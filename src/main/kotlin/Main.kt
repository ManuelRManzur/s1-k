import kotlin.math.pow

fun main(){
    //Boolean size 1bit false/true
    //Char size 16bit 'a' to 'z' '/n' '/101'
    /*
    Numbers
    Byte size 8bit -127 to 128
    Double size 64bit 3.4d
    Float size 32bit 3.4f
    Int size 32bit -2 -1 0 1 2
    Long size 64bit -2L -1L -0L 1L 2L
    Short size 16bit none
    */
    //String 'hola'
    //Array of int [1,2,3]
    val dayOfBirth : Int = 3
    val monthOfBirth : Int = 5
    println("My birthday is $dayOfBirth/$monthOfBirth")
    println("My birthday is: "+dayOfBirth+"/"+monthOfBirth)
    var name : String = "Emmanuel"
    var lastname : String = "Manzur"
    println("My name is ${name.uppercase()} ${lastname.lowercase()}")
    println("My name is: "+name+" "+lastname)
    name = "Jeff"
    println("My name is $name $lastname")

    //Sum
    println(2+2)
    //Subtract
    println(2-2)
    //Division
    println(2/2)
    //Modulus
    println(2%2)
    //Multiplication
    println(2*2)
    //Power
    println(2.0.pow(2))
    //Math operations
    println(1+(9/3)*2)
    //Boolean comparison/equality
    println(2==2)
    println(2!=2)
    println(2>2)
    println(2<2)
    println(2>=2)
    println(2<=2)
    //Assignment operations
    var anyNumber : Int = 0
    anyNumber+=10
    anyNumber-=2
    anyNumber*=2
    anyNumber/=2
    anyNumber%=2
    //Increment & decrement
    anyNumber++
    anyNumber--
    println(anyNumber)
    //Logic operators
    var isTrue: Boolean= true
    var isFalse: Boolean= false
    //and
    println(isTrue && isFalse)
    //or
    println(isTrue || isFalse)
    //not
    println(!isTrue)
    helloWorld()
    var myNumber: Int = tripleTheValue(2)
    println(myNumber)
    favoriteFoodPrompt("Manuel","ceviche")
}

fun helloWorld(){
    println("Hello world")
}

fun tripleTheValue(numberValue: Int): Int{
    return numberValue*3
}

fun favoriteFoodPrompt(name: String, favoriteFood: String): Unit{
    println("$name's favorite food is $favoriteFood")
}