package fundamentos

fun main(){
    println(validaNota(nota = 5))
}

fun validaNota(nota: Int): String{
    if (nota >= 6){
        return "aprovado"
    }else if(nota >= 4 && nota < 6){
        return "recuperação"
    } else {
        return "reprovado"
    }
}