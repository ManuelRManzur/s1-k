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
}