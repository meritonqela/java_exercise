import javax.swing.*;

/**
 * Created by OK on 7/10/2016.
 */
public class Decode {
    public static void main (String [] args){
        int [] code = new int[27];

        int k = new Integer(JOptionPane.showInputDialog("Type seed(an int)")).intValue();

        code[0]=k;
        for (int i =1; i!=code.length; i++){
            code[i]=(int)((code[i-1]*2)+1);
        }
        String answer ="";
        boolean processing = true;
        while (processing){
            String input = JOptionPane.showInputDialog("Type an integer to decode(or nothing to quit)");
            if (input.equals("")){processing = false;}
            else {
                 char c = decode(code, new Integer(input).intValue());
                answer += c;
            }
        }
        System.out.println(answer);

    }

    private static char decode(int [] code, int i){
        char c ='*';
        boolean found = false;
        int index =0;
        while (!found && index!=code.length){
            if (code[index]==i){
                found = true;
                if (index==0){c=' ';}
                else {c = (char)(index+'a'-1);}
            }
            else {index++;}
        }
        return c;
    }
}
