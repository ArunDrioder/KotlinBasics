fun main(args : Array<String>)
{
    /*for (i in 1..10)
    {
        if (i%2 ==0)
            println(i)

    }*/

    println("Enter the number")
   val givenValue = Integer.valueOf(readLine())
    while ( givenValue in 1..10)
    {
        if (givenValue %2 == 0)
            println("The given number lies within 10 and it's even ")
                else
            println("The given number lies within 10, but it's Odd")
        break

    }



}