fun main() {
    val nome: String = "Douglas"
    println("Hello " + nome + "!") // MODO DE ESCRITA DO JAVA
    println("Hello $nome!") // MODO DE ESCRITA DO KOTLIN, USANDO $
    println("Hello \$nome!") // \ FAZ COM QUE O COMPILADOR NAO INTERPRETE O $ (StringTemplate)
    println("A soma é: ${soma(10, 20)}") // USE {} PARA FAZER EXPRESSÕES
}

fun soma(a: Int, b: Int): Int {
    return a + b
}