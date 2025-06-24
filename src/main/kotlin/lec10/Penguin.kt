package lec10

class Penguin (
    species: String
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int = 2

    override fun move() {
        TODO("Not yet implemented")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    /**
     * Java, Kotlin 모두 인터페이스를 인스턴스화 할 수 없습니다!
     */
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}