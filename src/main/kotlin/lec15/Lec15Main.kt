package lec15

fun main(){

    /**
     * 배열을 쓰지는 않지만 알아두자.
     */
    val array = arrayOf(100, 200)

    for(i in array.indices){
        println("$i ${array[i]}")
    }

    array.plus(300)
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }


    /**
     * 컬렉션을 만들어줄 때 불변인지, 가변인지를 설정해야 한다.
     *
     * Collection을 만들자 마자
     * Collections.unmodifiableList() 등을 붙여준다!
     *
     * 불변 컬렉션이라 하더라도
     * Reference Type인 Element의 필드는 바꿀 수 있다.
     *
     * 불변 리스트로 생성 후 갑녀 리스트로 바꾸자.
     */

    /**
     * List, Set, Map
     */
    val numbers = listOf(100, 200) // 불변 리스트
    var numbers2 = mutableListOf(100,200) // 가변 리스트
    val numbers3 = mutableSetOf(100, 200)
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "one"
    oldMap[2] = "two"
    mapOf(1 to "one", 2 to "two") // 불변 맵

    val emptyList = emptyList<Int>();

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for (key in oldMap.keys) {
    }

    for ((key, value) in oldMap.entries) {
    }

    /**
     * 컬렉션의 null 가능성
     * List<Int?> : 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
     * List<Int>? : 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
     * List<Int?>? : 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */

    /**
     * Java 와의 호환성
     * Java는 읽기 전용 컬렉션과 변경 가능 컬렉션을 구분하지 않는다.
     * Java는 nullable 타입과 non-nullable 타입을 구분하지 않는다.
     *
     */
}

private fun printNumbers(numbers: List<Int>){
    for (number in numbers) {
        println(number)
    }
}

/**
 * 정리
 * - 코틀린에서는 컬렉션을 만들 때도 불변/가변을 지정해야 한다.
 * - List, Set, Map 에 대한 사용법이 변경, 확장되었다.
 * - Java와 Kotlin 코드를 섞어 컬렉션을 사용할 때에는 주의해야 한다.
 * - Java에서 Kotlin 컬렉션을 가져갈 때는 불변 컬렉션을 수정할
 * 수도 있고, non-nullable 컬렉션에 null을 넣을 수도 있다.
 * - Kotlin에서 Java 컬렉션을 가져갈 때는 플랫폼타입을 주의해야
 * 한다
 */