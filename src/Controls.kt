fun main (args : Array<String>)
{
    println("Enter the First Number")
    val a  = Integer.valueOf(readLine())

    println("Enter the second number")
    val b = Integer.valueOf(readLine())

    var maxValue : Int = if (a > b)

        a
    else
        b

    println("The maxvalue is : ${maxValue}")





}