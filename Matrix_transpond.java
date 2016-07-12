/**
 * Created by OK on 7/10/2016.
 */
public class Matrix_transpond {
    public static void main(String [] args){

        int[][] r = new int[3][4];
        for (int i =0;i !=r.length;i++){
            for (int j =0; j!=r[0].length;j++){
                r[i][j]=i+j;
                System.out.print(r[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] answer = transpond(r);
        for (int i =0;i !=answer.length;i++){
            for (int j =0; j!=answer[0].length;j++){
                System.out.print(answer[i][j]+"  ");
            }
            System.out.println();
        }

    }

    public static int [][] transpond(int[][] a){
        int[][] answer = null;
        if (a.length==0){throw new RuntimeException("error : empty matrix");}
        else {
            int rows = a.length;
            int col = a[0].length;
            answer = new int[col][rows];
            for (int i =0; i!=rows; i++){
                for (int j =0; j!=col;j++){
                    answer[j][i]=a[i][j];
                }
            }
            return answer;
        }


    }

}
