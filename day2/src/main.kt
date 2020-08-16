fun main(){

}
open class Animal{
    val image = ""
    val food = ""
    val habitat = "" //ที่อยู่อาศัย
    var hunger = 10  //กินเยอะไหม

   open fun makeNoise () {
        println("The Animal is making a noise")
    }
   open fun eat () {
        println("The Animal is eating")
    }
   open fun roam(){
        println("The Animal is roaming")
    }
    fun sleep(){
        println("The Animal is sleeping")
    }
}