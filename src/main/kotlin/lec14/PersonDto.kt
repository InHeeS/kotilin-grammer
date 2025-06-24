package lec14

fun main(){
    val person = PersonDto("John", 30)
    val person2 = PersonDto("Jane", 25)
    println("Name: ${person.name}, Age: ${person.age}")
    println(person == person2)

    handleCar(Avante())
}

data class PersonDto (
    val name: String,
    val age: Int,
){

}

/**
 * when
 * when은 Enum Class 혹은 Sealed Class와
 * 함께 사용할 경우, 더욱더 진가를 발휘한다
 */
fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> println("한국입니다.")
        Country.USA -> println("미국입니다.")
    }
}

/**
 * sealed class
 * Enum과 다른 점
 * - 클래스를 상속받을 수 있다.
 * - 하위 클래스는 멀티 인스턴스가 가능하다
 *
 * 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
 * 즉, 런타임때 클래스 타입이 추가될 수 없다.
 *
 *  * 추상화가 필요한 Entity or DTO 에 sealed class를 활용 !!!
 */
sealed class Car(
    val name: String,
    val price: Long,
)
class Avante : Car("Avante", 20000000L)
class Sonato : Car("Sonato", 25000000L)
class Genesis : Car("Genesis", 50000000L)

private fun handleCar(car: Car){
    when(car){
        is Avante -> println("아반떼입니다. 가격은 ${car.price}원 입니다.")
        is Sonato -> println("소나타입니다. 가격은 ${car.price}원 입니다.")
        is Genesis -> println("제네시스입니다. 가격은 ${car.price}원 입니다.")
    }
}


/**
 * enum class
 * 추가적인 클래스를 상속받을 수 없다.
 * 인터페이스는 구현할 수 있으며, 각 코드가 싱글톤이다.
 */
enum class Country(
    private val code: String
){
    KOREA("KO"),
    USA("US"),

    ;
}

/**
 * 정리
 * - Kotlin의 Data class를 사용하면 equals, hashCode, toString을
 * 자동으로 만들어준다.
 * - Kotlin의 Enum Class는 Java의 Enum Class와 동일하지만,
 * when과 함께 사용함으로써 큰 장점을 갖게 된다.
 * - Enum Class보다 유연하지만, 하위 클래스를 제한하는
 * Sealed Class 역시 when과 함께 주로 사용된다.
 */