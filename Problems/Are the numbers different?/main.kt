fun checkDifference(vararg numbers: Int): Boolean {
    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] == numbers[j]) return false
        }
    }
    return true
}

fun main() {
    val (n1, n2, n3) = IntArray(3) { readLine()!!.toInt() }

    print(checkDifference(n1, n2, n3))
}
