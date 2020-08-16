fun main(){
var myhip = Hippo()
    myhip.eat()
    myhip.roam()
    myhip.makeNoise()
    myhip.sleep()

    //สร้างแมว
    var mycat = Cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
}
open class Animal{
    open val image = ""
   open val food = ""
   open val habitat = "" //ที่อยู่อาศัย
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
class Hippo : Animal(){
    //สร้างคลาสฮิปโปแต่ยังไม่ได้ทำอะไร
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}
class Cat : Animal(){
    override val image = "cat.jpg"
    override val food = "rat"
    override val habitat = "Home"

    override fun makeNoise() {
        println("เหมียว เหมียว")
    }

    override fun eat() {
        println("The Cat is eating $food")
    }
}
