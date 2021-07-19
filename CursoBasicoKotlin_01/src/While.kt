// Crie um programa que calcule e exiba o resultado da
// média de temperatuas informadas pelo usuário

fun main() {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while(temperatura != 999) {
        println("Digite uma temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt() // GAMBIARRA, PERIGOSO

        if(temperatura != 999) {
            somatorio = somatorio + temperatura
            quantidade++
        }
    }
    println("A média da temperatura é: ${somatorio/quantidade}")
}