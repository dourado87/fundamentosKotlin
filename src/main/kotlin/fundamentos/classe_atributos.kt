package fundamentos

class Carro(var cor:String, var anoFabricacao:Int, var dono: Dono) {

}
data class Dono(var nome: String, var idade: Int){

}

fun main(){
    var carro = Carro(cor = "Branco", anoFabricacao = 2021, Dono(nome= "Claudio", idade = 35))

    println(carro.cor)
    carro.cor = "Preto"
    println(carro.cor)
    println(carro.dono)
}