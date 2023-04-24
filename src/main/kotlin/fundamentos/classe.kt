package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "o cidadão ${nome} tem a idade de ${idade} anos"
    }
}

fun main(){
    var gustavo = Pessoa(nome = "Gustavo", idade = 24)
    println(gustavo)
}