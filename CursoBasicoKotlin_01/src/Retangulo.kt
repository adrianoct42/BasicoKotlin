class Retangulo(val altura: Int, val largura: Int){

    // ASSESSORES CUSTOMIZADOS
    val isQuadrado: Boolean
        get(){
            return altura == largura
    }

    // OUTRA FORMA DE FAZER (que honestamente prefiro)
    fun EQuadrado(): Boolean {
        return altura == largura
    }
}

fun main(){
    val retangulo: Retangulo = Retangulo(10, 10)
    println(retangulo.isQuadrado)
    println(retangulo.EQuadrado())
}