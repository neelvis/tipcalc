fun checkOnePositive(n1: Int, n2: Int, n3: Int): Boolean {
    return (n1 > 0 && n2 <= 0 && n3 <= 0) ||
            (n1 <= 0 && n2 > 0 && n3 <= 0) ||
            (n1 <= 0 && n2 <= 0 && n3 > 0)
}

fun main() {
    val (n1, n2, n3) = IntArray(3) { readLine()!!.toInt() }

    print(checkOnePositive(n1, n2, n3))
}