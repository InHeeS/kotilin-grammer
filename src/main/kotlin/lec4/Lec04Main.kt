package lec4

/**
 * - 코틀린에서 연산자를 다루는 방법
 * 1. 단항 연산자 / 산술 연산자
 * 2. 비교 연산자와 동등성, 동일성
 * 3. 논리 연산자 / 코틀린에 있는 특이한 연산자
 * 4. 연산자 오버로딩
 */

fun main(){
    /**
     * == 비교 연산자 ==
     * Java와 다르게 객체를 비교할때
     * 비교 연산자를 사용하면 자동으로 compareTo를 호출해줍니다
     */
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2)
        println("o")

    /**
     * === 비교 연산자와 동등성, 동일성 ===
     * Kotlin에서는 동일성에 === 를 사용, 동등성에 ==를 호출
     * ==를 사용하면 간접적으로 equals를 호출해준다
     */


    /**
     * === 논리 연산자와 코틀린에 있는 특이한 연산자 ===
     * Java와 완전히 동일합니다.
     * Java 처럼 Lazy 연산을 수행합니다.
     *
     * in / !in
     * - 컬렉션이나 범위에 포함 유무
     *
     * a..b
     * - a 부터 b 까지의 범위 객체를 의미
     *
     * a[i]
     * - a에서 특정 index i로 값을 가져온다.
     */

    /**
     * kotlin 에서 객체마다 연산자를 직접 정의 가능하다.
     */
    val money3 = Money(1_000L)
    val money4 = Money(2_000L)
    println(money3 + money4)


}