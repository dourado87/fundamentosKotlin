package fundamentos

fun main(){
    validNumber(-5)
}
fun validNumber(x: Int){

    when(x){
        5,-5-> println("x == 5")
        8-> println("x == 8")
        10->{
            println("x == 10")
            println("x é uma dezena")
        }
        in 11..15->println("X esta entre 11 e 15")
        else -> println("numero não mapeado")
    }
}

fun comecaConOi(x:Any): Boolean{
    return when(x){
        is String -> x.startsWith("Oi")
        else -> false
    }

}
