package fundamentos

fun main(){
    var nome = retornaNome()
//    println(nome)
    dizOi(nome)
}

fun retornaNome(): String{
    return "Claudio"
}

fun dizOi(nome: String){
    println("oi ${nome}")
}