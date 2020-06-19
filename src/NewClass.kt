fun main(args : Array<String>)
{
    println("Enter first number")

    val a= Integer.valueOf(readLine())
    println("Enter Second number")

    val b = Integer.valueOf(readLine())

    val arithmeticObj = Arithmetic();
    arithmeticObj.doMath(a,b)

}

class Arithmetic
{
    fun doMath(a: Int, b: Int)
    {
      println("The Addition of $a and $b is : ${a+b}")
      println("The Subtraction of $a and $b is : ${a-b}")
      println("The Multiplication of $a and $b is : ${a*b}")
      println("The Division of $a and $b is : ${a/b}")
    }

}