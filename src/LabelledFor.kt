fun main (args: Array<String>)
{
//   outerLoop@ for(i in 1..10)
//    {
//       for (j in 1..10)
//       {
//           println("$i $j")
//           if (i==1 && j==4)
//               break@outerLoop
//       }
//        }


    for (i in 1..20)
    {
       for ( j in 1..20)
        {
            if ( i== 10 && j == 12)
            continue
            println("$i $j")
        }

    }


}