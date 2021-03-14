fun checkOrder(h1: Int, h2: Int, h3: Int): Boolean {
    return (h1 >= h2 && h2 >= h3) || (h1 <= h2 && h2 <= h3)
}

fun main() {
    val (h1, h2, h3) = IntArray(3) { readLine()!!.toInt() }

    print(checkOrder(h1, h2, h3))
}