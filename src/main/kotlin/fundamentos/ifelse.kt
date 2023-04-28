package fundamentos

fun main(){
        println(testeNota(nota = 7))
}

fun parimpar(numero: Int):String{
   return if(numero % 2 ==0){
        "par"
    } else {
       "impar"
   }
}

// se a nota >= 6 passou
// se a nota for >= 4 recuperação
// se a nota for < 4 reprovou

fun testeNota(nota: Int): String{
    if (nota >= 6){
        return "aprovado"
    }else if(nota >= 4 && nota < 6){
        return "recuperação"
    } else {
        return "reprovado"
    }
}