fun basicGrammer() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println(a + b)
    // readLine() : 표준 입력에서 한 줄을 읽어서 문자열로 반환해주는 표준 코틀린 함수
    // !! : 널 아님 단언(not-null assertion). 널을 반환하지 않을 것이 확실한 경우 !! 을 이용하여 널이 될 수 있는 가능성 무시

    val c: Int = 100
    val d: String = "Hello!"
    // 변수 이름 뒤에 콜론을 표시하고 그 뒤에 타입을 적어서 타입을 명시할 수 있다.
    // val e: Int = "Hi!" 와 같이 초긱값이 지정한 타입에 속하지 않을 경우 컴파일 오류를 일으킨다.

    val e: String
    e = "Hello!!!"
    /* 초기값을 생략하고 나중에 변수를 초기화할 수도 있다.
       이 경우 변수 타입을 명시해야 한다.
       변수를 사용하기 전에 변수를 초기화했는지 컴파일러가 확실히 알 수 없는 경우 컴파일 오류가 발생한다. */
}