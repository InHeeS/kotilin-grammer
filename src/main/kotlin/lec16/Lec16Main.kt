package lec16

/**
 * 1. 확장함수
 * 2. infix 함수
 * 3. inline 함수
 * 4. 지역함수
 */

/**
 * Java로 만들어진 라이브러리를 유지보수, 확장할 때
 * Kotlin 코드를 덧붙
 */
fun main(){
    val str = "ABC"
    println(str.lastChar())

    val srt1: Train = Srt()
    srt1.isExpensive() // Train.isExpensive() 호출

    val srt2: Srt = Srt()
    srt2.isExpensive() // Srt.isExpensive() 호출
}

/**
 * 확장 함수
 * fun 확장하려는클래스.함수이름(파라미터): 리턴타입 {
 * // this를 이용해 실제 클래스 안의 값에 접근
 * }
 *
 * 확장함수는 클래스에 있는
 * private 또는 protected 멤버를
 * 가져올 수 없다
 *
 * 멤버함수와 확장함수의 호출순서는 멤버함수가 우선이다.
 *
 * Java에서 Kotlin 확장함수를 가져다 사용 가능하다. - 정적 메소드를 부르는 것처럼
 *
 */
fun String.lastChar(): Char{
    return this[this.length - 1]
}

/**
 *  해당 변수의 현재 타입
 *  즉, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정된다.
 */
open class Train(
    val name: String = "기차",
    val price: Int = 5_000,
)

fun Train.isExpensive(): Boolean {
    return this.price > 10_000
}

class Srt : Train("SRT", 20_000)

fun Srt.isExpensive(): Boolean {
    return this.price > 30_000
}

/**
 * infix 함수
 * infix fun 클래스이름.함수이름(파라미터): 리턴타입 {}
 * 멤버 함수에도 붙일 수 있다.
 * ex) 3.add(4), 3 add2 4
 */

/**
 * inline 함수
 *
 * 함수를 파라미터로 전달할 때에 오버헤드를 줄일 수 있다.
 * 하지만 inline 함수의 사용은
 * 성능 측정과 함께 신중하게 사용되어야 합니다!
 *
 * 코틀린에는 적절하게 inline 함수가 내재되어 있다.
 */

/**
 * 지역함수
 * 함수 안에 함수를 선언 가능하다.
 * 가독성이 떨어짐..
 */

/**
 * 정리
 * - Java 코드가 있는 상황에서, Kotlin 코드로 추가 기능 개발을 하기
 * 위해 확장함수와 확장프로퍼티가 등장했다.
 * - 확장함수는 원본 클래스의 private, protected 멤버 접근이 안된다!
 * - 멤버함수, 확장함수 중 멤버함수에 우선권이 있다!
 * - 확장함수는 현재 타입을 기준으로 호출된다!
 * - Java에서는 static 함수를 쓰는것처럼 Kotlin의 확장함수를 쓸 수 있다.
 *
 * - 함수 호출 방식을 바꿔조는 infix 함수가 존재한다.
 * - 함수를 복사-붙여넣기 하는 inline 함수가 존재한다.
 * - Kotlin에서는 함수 안에 함수를 선언할 수 있고 지역함수라고 부른다.
 */