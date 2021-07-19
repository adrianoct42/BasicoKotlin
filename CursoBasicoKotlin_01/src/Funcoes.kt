fun main() {
    println(max1(5, 12))
}

// Corpo de bloco
fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

// Corpo de expressão (somente para uma expressão, por ex: somente um if)
fun max1(a: Int, b: Int): Int = if (a > b) a else b