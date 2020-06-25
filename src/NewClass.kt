fun main(args : Array<String>)
{
    println("Enter two numbers")

    var a = Integer.valueOf(readLine())
    var b = Integer.valueOf(readLine())

    var result : Int = productOf (a,b)

    println(result)

}

fun productOf(a: Int, b: Int): Int {

    return a*b

}

