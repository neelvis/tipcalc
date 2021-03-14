fun checkSumIs20(n1: Int, n2: Int, n3: Int): Boolean {
    if (n1 + n2 == 20) return true
    if (n1 + n3 == 20) return true
    if (n3 + n2 == 20) return true
    return false
}

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    println(checkSumIs20(a, b, c))
}