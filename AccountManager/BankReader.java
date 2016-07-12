package com.company;
import javax.swing.*;
/** BankReader reads bank transactions from the user */
public class BankReader
{   private String input_line; // holds the most recent input command line
    public String name="";

    /** Constructor BankReader initializes the input reader */
    public BankReader()
    { input_line = "";}
    /** readName reads account name
      *  @return  the first character of name */
    public char readName()
    {
        name = JOptionPane.showInputDialog("Please enter username :  (A) or (B) ").trim().toUpperCase();
        return name.charAt(0);
    }


    /** readCommand reads a new command line
     * @param message - the prompt to the user
     * @return the first character of the command */
    public char readCommand(String message)
    { // read the input line, trim blanks and convert to upper case:
        input_line = JOptionPane.showInputDialog(message).trim().toUpperCase();
        return input_line.charAt(0); // return the leading character
    }

    /** readAmount returns the numerical value included in the input command line
     * @return the amount, converted entirely into cents; if there is
     * no amount to return, announce an error and return 0. */
    public int readAmount()
    { int answer = 0;
// extract substring of input line that forgets the initial character:
        String s = input_line.substring(1, input_line.length());
        s = s.trim(); // trim leading blanks from substring
        if ( s.length() > 0 ) // is there a number to return?
        { double dollars_cents = new Double(s).doubleValue();
            answer = (int)(dollars_cents * 100); // convert to all cents
        }
        else { JOptionPane.showMessageDialog(null,
                "BankReader error: no number for transaction---zero used");
        }
        return answer;
    }
}