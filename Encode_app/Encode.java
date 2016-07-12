import javax.swing.*;

public class Encode {

    public static void main(String [] args){
        int [] code = new int[27];

        int k = new Integer(JOptionPane.showInputDialog("Type seed: (an int)")).intValue();
        code[0]=k;
        for (int i =1; i!=code.length;i++){
            code[i]=(code[i-1]*2)+1;}

        String input = JOptionPane.showInputDialog("Type a sentence to encode: ");
        for (int j=0; j!=input.length();j++){
            char c = input.charAt(j);
            if(c==' '){System.out.println(code[0]);}
            else if(c>='a' && c<='z'){
                int index =(c-'a')+1;
                System.out.println(code[index]);}
            else {System.out.println("error: bad input character");}
        }


    }

}
