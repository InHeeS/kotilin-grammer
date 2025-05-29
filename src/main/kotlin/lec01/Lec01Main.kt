package lec01

import Person

/**
 * 코틀린에서 변수를 다루는 방법
 */
fun main(){
    /**
     * var : 가변
     * val : 불변
     * 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.
     * boxing/unboxing 을 고려하지 않아도 된다.
     * 객체를 인스턴스화 할때 new 를 붙이지 않아도 된다.
     * null 은 완전히 다른 타입으로 대체된다.
     */
    val number2: Long = 5
    println(number2)

    var number1 = 10L

    var number3: Long? = 1_000L
    number3 = null

    var person = Person("조인희")

}