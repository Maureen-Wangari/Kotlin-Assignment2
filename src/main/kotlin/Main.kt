fun main(){
    sentence("Barnie bakes brown bagels and burns")
    println( arithmetics(arrayOf(2,3,5,6,)))
    calculateVolume(23.0)
    println(palindrome("madam"))
    checkEven(listOf(2,3,7,8,4,22,45,6,7))
    println(peopleHeights(listOf(22,5,6,34,89,33,4,6)))
    println( twoLists(listOf("Maureen","Apples","Oranges","Melon", "Guavas")))


    val products = listOf(
        Product("groceries", 10.0, 2),
        Product("hygiene", 5.0, 4),
        Product("general", 20.0, 1),
        Product("appliances", 100.0, 6),
        Product("groceries", 15.0, 5),
        Product("hygiene", 7.0, 2)
    )
    val totals = categoryTotals(products)
    println(totals)



}

fun sentence(word: String){
    var words =(word.lowercase().split('b'))
    println(words)
}


fun arithmetics (number: Array<Int>) :Calc{
    var total = number.sum()
    var count = number.count()
    var averages = number.average()
    var result = Calc(total, count, averages)
    return result

}
data class Calc(var a:Int, var b:Int, var c:Double){

}

//METHOD 2
fun mathematics (number: Array<Int>) :Triple<Int, Int, Double>{
    var total = number.sum()
    var count = number.count()
    var averages = number.average()
    return Triple(total, count,averages)

}

//CALCULATING THE VOLUME OF A SPHERE.
fun calculateVolume(r: Double){
    val pi = 3.142
    val size = 4.0/3
    var volume = pi*size*(r*r*r)
    println(volume)
}


//CHECKING FOR STRING PALINDROMES
    fun palindrome(word: String): Boolean {
        val reversedWord = (word.reversed())
        return  word == reversedWord

    }

//PRINTING OUT ELEMENTS AT EVEN INDICES
fun checkEven(words: List<Int>){
    var result = words.filterIndexed(){index, i->
        (index % 2 == 0)
    }
    println(result)
}

fun peopleHeights(height: List<Int>) : Pair<Int, Double>{
val total = height.sum()
    val average = height.average()
    return Pair(total, average)
}


//TWO LISTS CONTAINING WORDS THAT START WITH VOWELS AND ANOTHER CONTAINING WORDS THAT START WITH CONSONANTS

fun twoLists(oneList: List<String>){
    val listOne: MutableList<String> = mutableListOf()
    val listTwo: MutableList<String> = mutableListOf()

    val vowel = listOf('a','i','e','u','o')

    oneList.forEach { element ->

        var firstCharacter = element.lowercase().get(0)

        if (vowel.contains(firstCharacter)){
            listOne.add(element)
        }

        else{
            listTwo.add(element)
        }

    }


    println(listOne)
    println(listTwo)

}


data class Product(val category: String, val price: Double, val quantity: Int){

}
fun categoryTotals(products: List<Product>): Map<String, Double> {
    val totals = mutableMapOf<String, Double>()
    for (product in products) {
        val currentTotal = totals.getOrDefault(product.category, 0.0)
        totals[product.category] = currentTotal + product.price*product.quantity
    }
    return totals
}