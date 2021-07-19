// MODO CORPO DE BLOCO:
fun obterMnemonica(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }
}

fun obterTemperatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main() {
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)
    val temperatura = obterTemperatura(Cor.AMARELO)
    println(temperatura)
    val temperatura2 = obterTemperatura(Cor.LARANJA)
    println(temperatura2)
    val temperatura3 = obterTemperatura(Cor.AZUL)
    println(temperatura3)
}

// TAMBÉM PODERIA SER FEITO ASSIM, COM O MODO CORPO DE EXPRESSÃO:
// fun obterMnemonica(cor: Cor) =
//     when (cor) {
//         Cor.VERMELHO -> "Ver"
//         Cor.AMARELO -> "Alguém"
//         Cor.VERDE -> "Viver"
//         Cor.AZUL -> "Além é"
//         Cor.LARANJA -> "Legal"
//     }


// USES OF ->
// The -> is a separator. It is special symbol used to separate code with different purposes. It can be used to:
//
//    1- Separate the parameters and body of a lambda expression
//
//    val sum = { x: Int, y: Int -> x + y }
//
//    2- Separate the parameters and return type declaration in a function type
//
//    (R, T) -> R
//
//    3- Separate the condition and body of a when expression branch
//
//    when (x) {
//        0, 1 -> print("x == 0 or x == 1")
//        else -> print("otherwise")
//    }