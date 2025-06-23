package lec07

import java.lang.IllegalArgumentException

/**
 * 1. try catch finally 구문
 * 2. Checked Exception과 Unchecked Exception
 * 3. try with resources
 */

fun main(){

}

/**
 * try catch finally
 */
fun parseIntOrThrow(str: String): Int{
    try{
        return str.toInt()
    }catch (e: NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다. ")
    }
}

fun parseIntOrThrowV2(str: String): Int?{
    return try{
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
}

/**
 * 정리
 * - try catch finally 구문은 문법적으로 완전히 동일하다.
 *  - Kotlin에서는 try catch가 expression이다.
 *
 * - Kotlin에서 모든 예외는 Unchecked Exception이다.
 * - Kotlin에서는 try with resources 구문이 없다. 대신 코틀린의
 * 언어적 특징을 활용해 close를 호출해준다.
 */