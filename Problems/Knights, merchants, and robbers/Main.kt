fun main() {
    val firstAnswer = readLine().toBoolean()
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    val decision = confession == true || firstAnswer && !secondAnswer || !firstAnswer && secondAnswer
    
    print(!decision)
}
