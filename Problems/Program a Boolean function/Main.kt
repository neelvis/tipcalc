fun main() {
        var x = readLine().toBoolean()
        var y = readLine().toBoolean()
        var z = readLine().toBoolean()
        print(!(x && y) || z)
}