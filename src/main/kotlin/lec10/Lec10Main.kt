package lec10

/**
 * 클래스를 상속받을 때 주의할 점
 * 하위 클래스에서 오버라이드하고 있는 프로퍼티에는 접근하면 안된다.
 * 상위 클래스를 설계할 때
 * 생성자 또는 초기화 블록에 사용되는 프로퍼티에는
 * open을 피해야 한다
 */
fun main(){
    Derived(200)
}

open class Base(
    open val number: Int = 100
){
    init{
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init{
        println("Derived Class")
    }
}
/**
 * 정리
 * 1. final : override를 할 수 없게 한다. default로 보이지 않게 존재한다.
 * 2. open : override를 열어 준다.
 * 3. abstract : 반드시 override 해야 한다.
 * 4. override : 상위 타입을 오버라이드 하고 있다.
 *
 * - 상속 또는 구현을 할 때에 : 을 사용해야 한다.
 * - 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 한다.
 * - override를 필수로 붙여야 한다.
 * - 추상 멤버가 아니면 기본적으로 오버라이드가 불가능하다.
     * - open을 사용해주어야 한다.
 * - 상위 클래스의 생성자 또는 초기화 블록에서 open 프로퍼티를
 * 사용하면 얘기치 못한 버그가 생길 수 있다.
 */