package ua.levelup.homework23

fun main (args: Array<String>) {
    println(pow(-3, 2.0))
    println(filter("kotlin", 'k','b','j','i'))

}

fun pow(power: Int, number: Double): Double {
    var result =0.0
    if (power<0){
        var res: Double=number
        for (i in power..-1 ){
            res*=number
        }
        result=1/res
    }
    if (power>1){
        var res: Double=number
        for (i in 2..power) {
            res *= number
        }
        result=res
    }
    when (power){
        0-> return 1.0
        1-> return number
    }
    return result
}

fun filter(string:String, vararg symbols: Char):String{
    val arrChars: MutableList<Char> = mutableListOf()
    for (i in string.indices) {
        for (j in symbols.indices){
            if (string[i]==symbols[j]){
                arrChars.add(symbols[j])
            }
        }
    }
    return arrChars.joinToString(separator = "")
}