package lec03


/**
 * 기본 타입
 * 타입 캐스팅
 * Kotlin 의 3가지 특이한 타입
 * String Interpolation, String indexing
 */

fun main(){
    /**
     *  * 기본 타입간의 변환은 명시적으로 이루어져야 한다
     *  * - to변환타입()을 사용해야 합니다
     */
    val number1 = 3;
    val number2: Long = number1.toLong();

    /**
     * 변수가 nullable이라면 적절한 처리가 필요합니다!
     */
    val number3: Int? = 3;
    val number4: Long = number3?.toLong() ?: 0L

    /**
     * isInstanceof, typeCasting
     */
    printAgeIfPerson(null)
    printAgeIfPerson(Person("", 100))

    /**
     * --Any--
     * - Java의 Object 역할. (모든 객체의 최상위 타입)
     * - 모든 Primitive Type의 최상의 타입도 Any이다.
     * - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any?로 표현.
     * - Any 에 equals / hashCode / toString 존재.
     *
     * -- Unit --
     * - Unit은 Java의 void와 동일한 역할.
     * - (살짝 어려운 내용) void와 다르게 Unit은 그 자체로
     *   타입 인자로 사용 가능하다.
     * - 함수형 프로그래밍에서 Unit 은 단 하나의 인스턴스만 갖는 타입을
     *   의미. 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
     *
     * --Nothing (많이 사용하지 않는다.)
     * - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는
     *   역할
     * - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
     */


    /**
     * String interpolation / String indexing
     * $변수 를 사용할 수도 있다
     */

    val person = Person("조인희", 100)
    println("name is ${person.name}")

    val name = "su"
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    /**
     * charAt() method 필요없음
     */
    val str2 = "abc"
    println(str[1])

    /**
     * ==정리==
     * - 코틀린의 변수는 초기값을 보고 타입을 추론하며, 기본 타입들 간의
     * 변환은 명시적으로 이루어진다.
     * - 코틀린에서는 is, !is, as, as? 를 이용해 타입을 확인하고 캐스팅한다.
     * - 코틀린의 Any는 Java의 Object와 같은 최상위 타입이다.
     * - 코틀린의 Unit은 Java의 void와 동일하다.
     * - 코틀린에 있는 Nothing은 정상적으로 끝나지 않는 함수의 반환을
     * 의미한다.
     *
     * - 문자열을 가공할때 ${변수}와 ””” ””” 를 사용하면 깔끔한 코딩이
     * 가능하다.
     * - 문자열에서 문자를 가져올때의 Java의 배열처럼 [ ]를 사용한다
     */
}

fun printAgeIfPerson(obj: Any?){
    val person = obj as? Person
    println(person?.age)
//    if (obj is Person) { // <-> obj !is Person, return true or false
//        val person = obj as Person // return entity or null
//        println(person.age)
//    }
}

