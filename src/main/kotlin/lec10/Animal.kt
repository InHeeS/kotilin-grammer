package lec10

/**
 * Java, Kotlin 모두 추상 클래스는 인스턴스화 할 수 없다!
 */
abstract class Animal (
    protected val species: String,
    protected open val legCount: Int
){
    abstract fun move()
}