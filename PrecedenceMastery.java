public class PrecedenceMastery{

    public static void main(String[] args ){
        int var = 20 % 3 * 5 / 2 ;
        /*step 1 = 20%3 = a
          step 2 = a*5 = b
          step 3 = b/2 = c
            */
        System.out.println("result 1 :" + var);
        
        int var2 = 50/5 * 2 ;
        /* step 1 = 50/5  = a
           step 2 = a*2  */

        System.out.println("result2 :"+ var2);

        String a = "value.is: ";
        System.out.println(a + 10 + 20 );

        System.out.println( a + (10 + 20));
        // we now that the ( ) have more precedence than + :
        
        int x , y, z;
        x = y = z = 100 -50 * 2 ;
        /* step = 50*2 = a
           step = 100-a */
           System.out.println("add x + y + z :" + (x + y + z));
        // we now that the ( ) have more precedence than + :
        
        
    }
}