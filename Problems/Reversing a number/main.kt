fun main() {
    var number = readLine()!!.toInt()
    var reverseNumber = ""

    while (number > 0) {
        reverseNumber += (number % 10).toString()
        number /= 10
    }

    println(reverseNumber.toInt())
}