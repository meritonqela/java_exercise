/** Prints lower triangle matrix and upper triangle matrix  */

public class TriangleMatrix {
    public static void matrix() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + " " + j + "  ");
            }
            System.out.println();
        }
    }

    public static void matrix_2(){

        for (int i = 0; i <4 ; i++){
            for (int j=3; j>=i; j--){
                System.out.print(i+" "+j+"  ");
            }
            System.out.println();
        }
    }

    public static void main (String [] args)
    {
        System.out.println("Lower triangle matrix");
        matrix();
        System.out.println("Upper triangle matrix");
        matrix_2();

    }
}
