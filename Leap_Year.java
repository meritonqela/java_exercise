import javax.swing.*;
import java.util.GregorianCalendar;

/**LeapYear aplikacioni i cili merr ne menyr interaktive vitin nga shfrytzuesi dhe kthen si rezultat se 'a eshte ai vit i brishte apo jo'.
 *
 * @author Meriton Qela
 * @date 10 Mars 2016
 */
public class Leap_Year {


    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Ju lutem shkruani vitin: ");
        int year = new Integer(input).intValue();

        GregorianCalendar c = new GregorianCalendar();
        boolean viti = c.isLeapYear(year);

        if (viti) {
            JOptionPane.showMessageDialog(null, "Viti " + year + " eshte vit i brishte!");
        } else {
            JOptionPane.showMessageDialog(null, "Viti " + year + " nuk eshte vit i brishte!");
        }


    }
}



