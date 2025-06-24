package lec09

/**
 * 1. 클래스와 프로퍼티
 * 2. 생성자와 init
 * 3. 커스텀 getter, setter
 * 4. backing field
 */

fun main(){

    Person()

    val person = Person("조인희")
    println(person.name)

    person.age = 10
    println(person.age)
}

/**
 * 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어준다
 * constructor 지시어 생략 가능
 * 클래스의 필드 선언과 생성자를 동시에 선언할 수 있다.
 * Java 클래스에 대해서도 .필드로 getter, setter를 사용한다.
 * 클래스가 생성되는 시점에 나이를 검증
 * consturctor(파라미터)로 생성자를 추가!
 */
class Person (
    name: String = "조인희",
    var age: Int
){

    /**
     * 무한 루프를 막기위한 field keyword 사용
     * 개인적으로는 custom getter에서
     * backing field를 쓰는 경우는 드물다.
     */
    val name = name
        get() = field.uppercase() // 커스텀 getter

    val upperCaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0){
            throw IllegalArgumentException("나이는 ${age}보다 커야 합니다.")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    /**
     * 값으로도 가능하지만
     * 객체의 속성이라면, custom getter
     * 그렇지 않다면 함수
     */
//    val isAdult: Boolean
//        get() = this.age >= 20
//

    constructor(name: String) : this(name, 1){
        println("첫 번째 생성자")
    }

    /**
     * 본문은 역순으로 실행됩니다
     * 부생성자보다는 default parameter를 권장
     * 정적 팩토리 메소드를 추천
     */
    constructor() : this("이름 없음"){
        println("두 번째 생성자")
    }
}

/**
 * 기본 생성자 생성
 */
class Student

/**
 * 정리
 * - 코틀린에서는 필드를 만들면 getter와 (필요에 따라) setter가
 * 자동으로 생긴다.
 *      - 때문에 이를 프로퍼티 라고 부른다.
 * - 코틀린에서는 주생성자가 필수이다.
 * - 코틀린에서는 consturctor 키워드를 사용해 부생성자를 추가로
 * 만들 수 있다.
 *      - 단, default parameter나 정적 팩토리 메소드를 추천한다.
 */