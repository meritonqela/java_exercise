import javax.swing.*;

/** Math ; has some methods for math calculate; suma, product, factorial, sinus and cosinus!
 *  @date 27 Mars 2016
 *  @author  Meriton Qela
 */


public class Math_ {

    public static int summation(int i)
    {
        int suma = 0;
        int number = 0;
        String s = "";
        while (number <= i)
        {
            suma = suma + number;
            s = s+" + "+number;
            number++;
        }
        System.out.print(s.substring(2,s.length())+" = "+suma);
        return suma;
    }

    public static int product(int a, int b){
        int product = 1;
        String s = "";
        if (b > a){
        while (a <= b)
        { product = product * a;
            s = s+" * "+a;
            a++;
        }
            System.out.print(s.substring(2,s.length())+" = "+product);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Product not possible!");}
        return product;
    }

    public static long factorial(long i)
    {
        long product = 1;
        if (i>=0){
        while (i>0)
        {  product = product * i;
            i--;
        }
        }
        else {JOptionPane.showMessageDialog(null, "Error : Negative number");}
        return product;
    }

    public static double sine(double x){
        double sinus = 0;
        int i=1,
            k=1;
        while (i<=19){
            sinus = sinus + k*(Math.pow(x,i)/factorial(i));
            k=k*(-1);
            i+=2;
        }
        return sinus;
    }

    public static double cosine(double x){
        double cosinus = 1;
        int i=2,
            k=-1;
        while(i<=20){
            cosinus += k*(Math.pow(x,i)/factorial(i));
            k=k*(-1);
            i+=2;
        }
        return cosinus;
    }

    public static void main (String [] args){
        System.out.println("Testimi i metodave te klases Math_");
        System.out.println();
        System.out.println("Shuma e 'n' numrave : / n=10");
        summation(10);
        System.out.println("\n Prodhimi i a * (a+1) * . . . * b , numrave : / a=3 dhe b=6");
        product(3,6);
        System.out.println();
        System.out.print("Faktorieli, per n=5    => ");
        System.out.println(factorial(5));
        System.out.println("Funksioni sinus:  x=PI/2 ");
        System.out.println(sine(Math.PI/2));
        System.out.println("Funksioni cosinus:  x=PI");
        System.out.println(cosine(Math.PI));
    }





}


