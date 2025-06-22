package lec05

import java.lang.IllegalArgumentException

/**
 * 코틀린에서 제어문을 다루는 방법
 * 1. if문
 * 2. Expression과 Statement
 * 3. switch와 when
 */

/**
 * in num1..num2
 */
fun validateScoreIsNotNegative(score: Int){
    if (score !in 0..100){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

/**
 * Java에서 if-else는 Statement이지만,
 * Kotlin에서는 Expression입니다.
 *  - Expression : 하나의 값으로 처리
 */
fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        "p"
    }else{
        "f"
    }
}

/**
 * switch, case
 */
fun getGradeWithSwitch(score: Int): String{
    return when(score / 10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(
    score: Int
): String{
    return when(score){
        in 90..99 -> "a"
        in 80..89 -> "b"
        in 70..79 -> "c"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

/**
 * when은 Enum Class 혹은 Sealed Class와
 * 함께 사용할 경우, 더욱더 진가를 발휘한다.
 */
fun judgeNumber(number: Int){
    when(number){
        1, 0, -1 -> println("o")
        else -> println("x")
    }
}

fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("짝수 입니다.")
        else -> println("주어진 숫자는 홀수입니다. ")
    }
}

/**
 * == 정리 ==
 * - if / if – else / if - else if – else 모두 Java와 문법이 동일하다.
 * - 단 Kotlin에서는 Expression으로 취급된다.
 * - 때문에 Kotlin에서는 삼항 연산자가 없다
 * - Java의 switch는 Kotlin에서 when으로 대체되었고,
 * when은 더 강력한 기능을 갖는다.
 */