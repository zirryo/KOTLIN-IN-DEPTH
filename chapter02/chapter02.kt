fun basicGrammar() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)
    // readLine() : 표준 입력에서 한 줄을 읽어서 문자열로 반환해주는 표준 코틀린 함수
    // !! : 널 아님 단언(not-null assertion). 널을 반환하지 않을 것이 확실한 경우 !! 을 이용하여 널이 될 수 있는 가능성 무시

    val c: Int = 100
    val d: String = "Hello!"
    // 변수 이름 뒤에 콜론을 표시하고 그 뒤에 타입을 적어서 타입을 명시할 수 있다.
    // val e: Int = "Hi!" 와 같이 초기값이 지정한 타입에 속하지 않을 경우 컴파일 오류를 일으킨다.

    val e: String
    e = "Hello!!!"
    /* 초기값을 생략하고 나중에 변수를 초기화할 수도 있다.
       이 경우 변수 타입을 명시해야 한다.
       변수를 사용하기 전에 변수를 초기화했는지 컴파일러가 확실히 알 수 없는 경우 컴파일 오류가 발생한다. */
}

fun basicType() {
    val f = 12_345_678
    val g: Byte = 1

    val h = 1_000_000 // 리터럴에 `_` 를 넣어서 가독성을 높일 수 있다.

    val i = 100L // 리터럴에 L 이나 l 을 붙이면 Long 타입이 된다.
    // val j: Int = 100L  // Error : assigning Long to Int
    val k = Short.MIN_VALUE
    println(k) // -32768
    val l = Int.MAX_VALUE
    println(l) // 2147483647
    val m = 1.0 / Double.NEGATIVE_INFINITY
    println(m) // -0.0
    val n = 2 - Double.POSITIVE_INFINITY
    println(n) // -Infinity
    val o = 3 * Float.NaN
    println(o) // NaN

    // 2.2.6 수변환
    val p = 100 // Int
    val q: Long = p // Error : can't assign Int to Long

    // 2.2.8 비교와 동등성
    val r = 1
    val x = 2L
    println(r == x) // Error : comparing Int and Long
    println(r.toLong() == x) // 두 타입이 같으므로 동등성 연산 가능

    println(Double.NaN == Double.NaN) // false
    println(Double.NaN != Double.NaN) // true
    println(Double.NaN <= Double.NaN) // false
    println(Double.NaN < Double.POSITIVE_INFINITY) // false
    println(Double.NaN > Double.NEGATIVE_INFINITY) // false
}

