package lec08

/**
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument (parameter)
 * 4. 같은 타입의 여러 파라미터 받기 (가변인자)
 */
fun main(){
    printNameAndGender(name = "조인희", gender = "MALE")

    /**
     * 배열을 바로 넣는것이 아니라 스프레드 변수를 붙여주어야 한다.
     */
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

/**
 * 두 정수를 받아 더 큰 정수를 반환하는 예제
 * public 은 생략 가능하다.
 * if – else 는 expression
 * 함수가 하나의 결과값이면 block 대신 = 사용 가능
 * block { } 을 사용하는 경우에는 반환 타입이 Unit이 아니면,
 * 명시적으로 작성
 */
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * default parameter
 */
fun repeat(str: String,
           num: Int = 3,
           userNewLine: Boolean = true){
    for (i in 1..num){
        if (userNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

/**
 * builder를 직접 만들지 않고 builder의 장점을 가지게 된다.
 *
 */
fun printNameAndGender(name: String, gender: String){
    println(name);
    println(gender);
}

/**
 * Kotlin에서 Java 함수를 가져다 사용할 때는
 * named argument를 사용할 수 없다.
 */

/**
 * 같은 타입의 여러 파라미터 받기(가변 인자)
 * 문자열을 n개 받아 출력하는 예제
 */
fun printAll(vararg strings: String){
    for(str in strings){
        println(str);
    }
}

/**
 * 정리
 * - 함수의 문법은 Java와 다르다!
 * - body가 하나의 값으로 간주되는 경우 block을 없앨 수도 있고,
 * block이 없다면 반환 타입을 없앨 수도 있다.
 * - 함수 파라미터에 기본값을 설정해줄 수 있다.
 * - 함수를 호출할때 특정 파라미터를 지정해 넣어줄 수 있다.
 * - 가변인자에는 vararg 키워드를 사용하며, 가변인자 함수를 배열과
 * 호출할 때는 * 를 붙여주어야 한다.
 *
 */