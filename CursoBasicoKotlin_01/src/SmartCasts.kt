import java.lang.IllegalArgumentException

// JAVA = instanceof; KOTLIN = is
interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avaliacao(expressao: Expressao) : Int {
    return when(expressao) {
        is Numero -> expressao.valor
        is Soma -> avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        else -> throw IllegalArgumentException("Expressao é desconhecida!")
    }
}

fun main() {
    // ((1 + 2) + 4) = 7
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}