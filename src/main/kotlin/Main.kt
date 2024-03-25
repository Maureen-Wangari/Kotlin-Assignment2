fun main(){
    sentence("Barnie bakes brown bagels and burns")
    println( arithmetics(5, 7, 12) )
//    println(Palindrome("madam"))
}

fun sentence(word: String){
    var words =(word.split(""))
    println(word.removePrefix("B"))
}

fun arithmetics (a:Int, b:Int, c:Int): Int {
    var sum = a + b + c
    return sum


}


//fun volume(pie:Double, radius:Int){
//
//}

class Palindrome(word:String) {
    fun palindrome(word: String) {
        if (word is String ) {
            println(Boolean)
        } else {
            println("")
        }
    }

}

