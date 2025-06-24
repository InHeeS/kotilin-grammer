package lec11

/**
 * Kotlin에서는 패키지를 namespace를 관리하기 위한 용도로만 사용!
 * 가시성 제어에는 사용되지 않는다.
 *
 * 코틀린은 .kt 파일에 변수, 함수, 클래스 여러개를 바로 만들 수 있다
 *
 * public 기본값
 * - 어디서든 접근할 수 있다.
 * protected 파일(최상단)에는
 * - 사용 불가능
 * internal 같은 모듈에서만
 * - 접근 가능
 * private 같은 파일 내에서만
 * - 접근 가능
 */
fun main(){

}

val NUM = 3

fun add(a: Int, b: Int): Int{
    return a + b
}

/**
 * 생성자에 접근 지시어를 붙이려면, constructor를 써주셔야 합니다!
 */
class Cat protected constructor()