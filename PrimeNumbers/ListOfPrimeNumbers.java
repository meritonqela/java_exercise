import javax.swing.*;

/** ListOfPrimeNumbers , print all prime numbers less than n (n is typed by a user)
 *  Date 05 Maj 2016
 *  @author Meriton Qela
 */
public class ListOfPrimeNumbers {

    public static void main(String [] args)
    {
       String input = JOptionPane.showInputDialog("Please type a number (integer) ? \n Application will print a list of prime numbers less than number you typed!");
       int n = new Integer(input).intValue();
       int sqrtN = (int)Math.ceil(Math.sqrt(n));
       int [] numberList = new int[n];

        for (int i = 0; i< n ; i++){
            numberList[i]=i+1;
        }

        for(int k=2; k <= sqrtN ; k++ )
        {
            for( int j = k+1; j<n ; j++ )
            {
                if (numberList[j] % k == 0)
                { numberList[j] =0;}
            }

        }

         for(int i = 1; i < n; i++){
            if(numberList[i] !=0)
            {System.out.println(numberList[i]);}

        }


    }

}
