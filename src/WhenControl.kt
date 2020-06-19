fun main (args : Array<String>)
{
    println("Enter any number within 1 to 50")
    val a = Integer.valueOf(readLine())

    var printString : String =

    when(a)
    {
        1-> "a is 1"
        2-> "a is 2"
        in 1..50-> "Your value is within the range and it lies between 1 to 50, and the value is ${a}"

        else ->
        {
            "Sorry, You've entered some other value, which is out of range."
        }

    }
    println(printString)

}