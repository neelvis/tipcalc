fun main() {
    val number = readLine()!!
    var sumDigits = 0

    for (c in number) {
        sumDigits += c.toString().toInt()
    }

    println(sumDigits)
}
