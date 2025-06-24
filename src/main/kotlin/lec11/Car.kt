package lec11

/**
 * Internal은 바이트 코드 상 public이 된다.
 * 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
 *
 * Kotlin의 protected와 Java의 protected는 다르다.
 * Java는 같은 패키지의 Kotlin protected 멤버에 접근할 수 있다
 */
class Car (
    internal val name: String,
    private var owner: String,
    _price: Int
){
    var price = _price
        private set

}

/**
 * 정리
 * - Kotlin에서 패키지는 namespace 관리용이기 때문에
 * protected는 의미가 달라졌다.
 * - Kotlin에서는 default가 사라지고, 모듈간의 접근을 통제하는
 * internal이 새로 생겼다.
 * - 생성자에 접근 지시어를 붙일 때는 constructor를 명시적으로
 * 써주어야 한다.
 * - 유틸성 함수를 만들 때는 파일 최상단을 이용하면 편리하다
 *
 */