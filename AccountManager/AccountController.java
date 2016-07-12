package com.company;

import javax.swing.*;
/** AccountController maintains the balance on a bank account. */
public class AccountController
{
    private BankReader reader; // input-view
    private BankWriter primaryWriter; // output-view (first account)
    private BankAccount primaryAccount; // model (first account)
    private BankWriter secondaryWriter;
    private BankAccount secondaryAccount;
    private BankWriter writer;
    private BankAccount account;
    private boolean bankier = false;
    private boolean continues = true;
    private boolean changeAcc = false;  //change the account
    private char person;


    public AccountController(BankReader r, BankWriter w, BankAccount a)
    {   reader = r;
        account = a;
        writer = w;
    }

    public AccountController(BankReader r, BankWriter w1 , BankAccount a1, BankWriter w2, BankAccount a2)
    {   reader = r;
        primaryWriter = w1;
        primaryAccount = a1;
        secondaryWriter = w2;
        secondaryAccount = a2;
        bankier = true;
        changeAcc = true;

    }

    public void resetAccount(BankWriter w , BankAccount a)
    {
        writer.showTransaction("Inactive");
        writer = w;
        account = a;
        writer.showTransaction("Active");
    }
    /** accountAccess , knows which account to access */
    public void accuntAccess() {
        if (bankier) {
            if (continues) {
                person = reader.readName();
                continues = false;
            }

            if (person == 'A') {
                account = primaryAccount;
                writer = primaryWriter;
                resetAccount(primaryWriter, primaryAccount);
                bankier = false;
            } else if (person == 'B') {
                account = secondaryAccount;
                writer = secondaryWriter;
                resetAccount(secondaryWriter, secondaryAccount);
                bankier = false;
            } else {
                this.accuntAccess();
            }

        }
    }
    /** changeAccess , change the acess between two accounts */
    public void changeAccess()
    {   if (changeAcc)
      {   int end = JOptionPane.showConfirmDialog(null, "Do you want to continue with account "+person+ "?");
        if (end == JOptionPane.NO_OPTION){
            if (person == 'A') {person = 'B';}
            else if (person == 'B') {person = 'A';}
            bankier = true;
            this.processTransactions();
        }
        else if (end == JOptionPane.YES_OPTION) {}


      }
    }

    /** processTransactions processes user commands until a Q is entered */
    public void processTransactions()
    {   accuntAccess();
        char command = reader.readCommand("Command (D,W,Q) and amount:");
        if ( command == 'Q' ) // quit?
        { } // terminate method by doing nothing more
        else { if ( command == 'D' ) // deposit?
        { int amount = reader.readAmount();
            boolean ok = account.deposit(amount);
            if ( ok )
            { writer.showTransaction("Deposit of $", amount); }
            else { writer.showTransaction("Deposit invalid ", amount); }
            changeAccess();
        }
        else if ( command == 'W' ) // withdraw?
        { int amount = reader.readAmount();
            boolean ok = account.withdraw(amount);
            if ( ok )
            { writer.showTransaction("Withdrawal of $", amount); }
            else { writer.showTransaction("Withdrawal invalid ", amount); }
            changeAccess();
        }
        else { writer.showTransaction("Illegal command: " + command); }
        this.processTransactions(); // send message to self to repeat
    }
    }


}