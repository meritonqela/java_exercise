/**
 * Created by OK on 7/10/2016.
 */
public class Matrix_multiply {
    public static void main (String [] args){
        double [][] a = new double[3][2];
        double [][] b = new double[2][3];
        for (int i =0;i<a.length;i++){
            for (int j =0; j<a[0].length;j++){
                a[i][j]=i+j+1;
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i =0;i <b.length;i++){
            for (int j =0; j<b[0].length;j++){
                b[i][j]=i+j+1.5;
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println();

        double [][]c = multiply(a,b);
        for (int i =0;i<a.length;i++){
            for (int j =0; j!=b[0].length;j++){
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }



    }

    public static double [][] multiply(double[][] a, double[][] b){
        double [][] answer =null;
        if (a[0].length !=b.length){throw new RuntimeException("error: invalid arguments ");}
        else {
            answer =new double[a.length][b[0].length];
            for (int i =0; i<a.length;i++){
                for(int j =0; j<b[0].length;j++){
                    double sum =0.0;
                    for (int k =0; k<b.length;k++)
                    {sum += a[i][k]*b[k][j];}
                    answer[i][j]=sum;
                }
            }
        }
        return answer;
    }
}
