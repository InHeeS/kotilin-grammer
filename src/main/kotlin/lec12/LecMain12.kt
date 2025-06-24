package lec12

import java.time.Month

fun main(){
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable {
        override fun move() {
            println("움직인다!")
        }

        override fun fly() {
            println("날아간다!")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int,
){
    companion object Factory : Log {
        /**
         * const : 기본타입과 String 에만 붙을 수 있다.
         * Java에서 Kotlin companion object를 사용하려면
         * @JvmStatic 을 붙여야 합니다!
         */
        private const val MIN_AGE = 0

        @JvmStatic // Java에서 static으로 사용 가능
        fun newBaby(name: String): Person{
             return Person(name, MIN_AGE)
        }

        override fun log() {
            TODO("Not yet implemented")
        }


    }
}

object Singleton {
    var a: Int = 0
}

/**
 * abstract Class
 */
private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}

/**
 * 정리
 * - Java의 static 변수와 함수를 만드려면,
 * Kotlin에서는 companion object를 사용해야 한다.
 * - companion object도 하나의 객체로 간주되기 때문에 이름을
 * 붙일 수 있고, 다른 타입을 상속받을 수도 있다.
 * - Kotlin에서 싱글톤 클래스를 만들 때 object 키워드를 사용한다.
 * - Kotlin에서 익명 클래스를 만들 때 object : 타입을 사용한다
 */