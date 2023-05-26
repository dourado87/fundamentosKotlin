package fundamentos

fun main(){
//    printa1a10()
//    printPar1a10()
//    printRange(inicio = 10, fim = 20)
//    whileMenorQue10()
      doWhileMenorque10()
}

fun printa1a10(){

    for(numero in 1 .. 10){
        println(numero)
    }
}

fun print10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}

fun printPar1a10(){
    for(numero in 2 .. 10 step 2){
        println(numero)
    }
}

fun printRange(inicio: Int, fim: Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}

fun whileMenorQue10(){
    var x=0
    while(x<10){
        println(x)
        x++
    }
}

fun doWhileMenorque10(){
    var x = 10
    do{
        println(x)
        x++
    }while(x<10)
}

