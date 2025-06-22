package lec02

import java.lang.IllegalArgumentException

/**
 * 코틀린에서 null 을 다루는 방법
 * 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
 * 한번 null 검사를 하면 non-null 임을 컴파일러가 알 수 있다.
 */
fun main() {
    val str: String? = "ABC" // null 이 들어갈 수 있다는 표시
    println(str?.length ?: 0) // safe call - elvis operator
    println(startsWith(null)) // runtimeError -> NPE

    val person = Person("공부하는 개발자")
    startsWithA(person.name) // @NotNull
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")

}

fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다.")

}

fun startsWithA2(str: String?): Boolean?{
    return str?.startsWith("A") // if null return null

}

fun startsWithA3(str: String?): Boolean{
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean{
    return str!!.startsWith("A") // 해당 변수는 절대로 null 이 아니다.
}