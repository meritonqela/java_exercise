import javax.swing.*;
/** Translate_Result , aplikacioni i cili perkthen numrin e pikeve ne njeren nga notat (A,B,C,D,E,F)!
 *  Nota A - 10
 *  Nota B - 9
 *  Nota C - 8
 *  Nota D - 7
 *  Nota E - 6
 *  Nota F - 5
 * @author Meriton Qela
 * @date 10 Mars 2016
 */

public class Points_to_grade {
    public static void main (String [] args ){
        String input = JOptionPane.showInputDialog("Ju lutem shenoni numrin e pikeve: ");
        int point = new Integer(input).intValue();
        int mark = (int)Math.floor(point/10);

        switch(mark)
        {
            case 10: {JOptionPane.showMessageDialog(null, "Nota : A");
                break; }
            case 9: {JOptionPane.showMessageDialog(null, "Nota A");
                break; }
            case 8: {JOptionPane.showMessageDialog(null, "Nota B");
                break;}
            case 7: {JOptionPane.showMessageDialog(null, "Nota C");
                break; }
            case 6: {JOptionPane.showMessageDialog(null, "Nota D");
                break;}
            case 5: {JOptionPane.showMessageDialog(null, "Nota E");
                break;}
            default: {JOptionPane.showMessageDialog(null, "Nota F");
                break;}

        }

    }
}
