import java.util.*

fun main(){
    students("Pamera","Juliet","Belyse","Celine")
    Africa()
    calculation()
    println(Arrays.toString(names("Joshua","Kaleb","Yves")))
}
fun students(name1:String,name2:String,name3:String,name4:String) {
    var namesArray = arrayOf(name1,name2,name3,name4 )
    println(Arrays.toString(namesArray))
    }
fun Africa(){
    var citiesArray=arrayOf("harare","mumbai","dodoma","jakarta")
    println(citiesArray[0].capitalize()+" " + citiesArray[1].capitalize()+" "+citiesArray[2].capitalize()+" "+ citiesArray[3].capitalize())
}
fun calculation(){
    var numbArray=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sumElements=numbArray[1]+numbArray[4]
    println(sumElements)
    println(numbArray.indexOf(158))
    var sortAsc=numbArray.sorted()
    println(sortAsc)}
fun  names (name1:String,name2:String,name3:String):Array<String> {
     return arrayOf(name1,name2,name3)

}




