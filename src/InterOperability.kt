fun main(args: Array<String>)
{
    println("Enter the Length and breadth value for rectangle")
    val l = Integer.valueOf(readLine())
    val b= Integer.valueOf(readLine())

    val areResult = MyJava.calculateArea(l ,b)

    println(areResult)

}

fun add(a: Int, b: Int) : Int {

    return a+b



}

