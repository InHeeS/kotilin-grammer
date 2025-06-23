package lec06

/**
 * 1. for-each문
 * 2. 전통적인 for문
 * 3. Progression과 Range
 * 4. while 문
 */


fun main(){

    /**
     * for-each 문
     */
    val numbers = listOf(1L, 2L, 3L)
    for(number in numbers){
        println(number)
    }

    for (i in 1..3){ // <-> 3 downTo 1
        println(i)
    }

    for (i in 1..5 step 2){
        println(i)
    }

    /**
     * Progression & Range
     * IntProgression : 등차수열
     * IntRange : 시작값, 끝값, 공차
     * 1..5 step 2 : 시작값 1, 끝값 5, 공차가 2인 등차수열
     */


    /**
     * While
     * java 와 완전히 동일하다.
     */


    /**
     * 정리
     * - for each 문에서 Java는 : Kotlin은 in 을 사용한다.
     * - 전통적인 for문에서 Kotlin은 등차수열과 in을 사용한다.
     * - 그 외 for문 문법은 모두 동일하다.
     * - while문과 do while문은 더욱더 놀랍도록 동일하다.
     */


}
