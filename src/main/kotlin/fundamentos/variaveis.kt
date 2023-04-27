package fundamentos

fun main(){
//    var = variável que pode ser reatribuida
//    val = variável que não pode ser reatribuida
}

// posso criar variáveis fora das funções e toda variável fora da função precisa receber o valor na mesma hora
// uma variável do tipo String não deixa aceitar inteiro    

class variaveis {

//    lateInit pode ser iniciado depois, lateinit só é possível com var, pois val é imutável
    lateinit var teste: String

    fun iniciaVariaveis(){
        teste= "Teste"
    }
}