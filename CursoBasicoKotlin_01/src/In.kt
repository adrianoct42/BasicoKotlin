fun main() {
    println(isLetter('7'))
    println(isNotDigit('5'))
}

fun isLetter(c: Char) : Boolean {
    return (c in 'a'..'z' || c in 'A'..'Z')
}

fun isNotDigit(c: Char) : Boolean {
    return (c !in '0'..'9')
}