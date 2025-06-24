package lec13

/**
 * 클래스 안에 클래스를 만들 때는 static 클래스를 사용하라
 * 잘 사용하지 않는 부분이다.
 * 내부 클래스의 경우 권장되지 않는 방법이다. inner class keyword
 * 바깥 클래스를 참조하지 않도록 되어 있음 굳이 하자면 inner keyword 사용
 */

/**
 * 정리
 * - 코틀린에서는 이러한 가이드를 따르기 위해
 * - 클래스 안에 기본 클래스를 사용하면 바깥 클래스에 대한
 * 참조가 없고
 * - 바깥 클래스를 참조하고 싶다면, inner 키워드를 붙여야 한다.
 * - 코틀린 inner class에서 바깥 클래스를 참조하려면
 * this@바깥클래스를 사용해야 한다.
 */
fun main(){

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom,
){
    class LivingRoom(
        private val area: Double
    )
}