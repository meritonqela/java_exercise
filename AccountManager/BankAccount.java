import javax.swing.*;
/** BankAccount manages a single bank account */
public class BankAccount
{ private int balance; // the account’s balance
// representation invariant: balance >= 0 always!

    /** Constructor BankAccount initializes the account
     * @param initial_amount - the starting account balance, a nonnegative. */
    public BankAccount(int initial_amount)
    { if ( initial_amount >= 0 )
        { balance = initial_amount; }
        else { balance = 0; }
    }

    /** deposit adds money to the account.
     * @param amount - the amount of money to be added, a nonnegative int
     * @return true, if the deposit was successful; false, otherwise */
    public boolean deposit(int amount)
    { boolean result = false;
        if ( amount >= 0 )
        { balance = balance + amount;
            result = true;
        }
        else { JOptionPane.showMessageDialog(null,
                "BankAcccount error: bad deposit amount---ignored");
        }
        return result;
    }

    /* withdraw removes money from the account, if it is possible.
    * @param amount - the amount of money to be withdrawn, a nonnegative int
    * @return true, if the withdrawal was successful; false, otherwise */
    public boolean withdraw(int amount)
    { boolean result = false;
        if ( amount < 0 )
        { JOptionPane.showMessageDialog(null,
                "BankAcccount error: bad withdrawal amount---ignored"); }
        else if ( amount > balance )
        { JOptionPane.showMessageDialog(null,
                "BankAcccount error: withdrawal amount exceeds balance");
        }
        else { balance = balance - amount;
            result = true;
        }
        return result;
    }
    /* getBalance reports the current account balance
    * @return the balance */
    public int getBalance()
    { return balance; }
}
