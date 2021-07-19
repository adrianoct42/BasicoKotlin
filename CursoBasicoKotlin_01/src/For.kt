// NAO EXISTE O for "PADRAO DO JAVA" NO KOTLIN
// Aqui só se usa ranges!

// FizzBuzz game
// Numeros divisíveis por 15 = FizzBuzz
// Numeros divisíveis por 3 = Fizz
// Numeros divisíveis por 5 = Buzz
// Caso contrário = imprime o número

fun fizzBuzz(numero: Int) : String {
     return when {
        numero % 15 == 0 -> "FizzBuzz"
        numero % 3 == 0 -> "Fizz"
        numero % 5 == 0 -> "Buzz"
        else -> "$numero"
    }
}

fun main() {
    for (numero in 1..100){
        println(fizzBuzz(numero))
    }
}