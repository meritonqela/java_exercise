import javax.swing.*;
/** AccountManager , start the application for managing accounts */
public class AccountManager
{ public static void main(String[] args)
  {
    String input = JOptionPane.showInputDialog("Which person are you, A, B, or BT?").toUpperCase();
    BankReader reader = new BankReader();
    BankAccount primaryAccount = new BankAccount(0);
    BankAccount secondaryAccount = new BankAccount(0);

   if (input.equals("BT"))
     {   BankWriter primaryWriter = new BankWriter("Account A",primaryAccount, 100 , 100);
       BankWriter secondaryWriter = new BankWriter("Account B", secondaryAccount, 400, 100);
       AccountController controller = new AccountController(reader,primaryWriter, primaryAccount, secondaryWriter, secondaryAccount );
       controller.processTransactions();
     } else if (input.equals("A"))
       {   BankWriter primaryWriter = new BankWriter("Account A",primaryAccount, 100 , 100);
        AccountController controller = new AccountController(reader, primaryWriter, primaryAccount);
        controller.processTransactions();
       } else if (input.equals("B"))
     {  BankWriter secondaryWriter = new BankWriter("Account B", secondaryAccount, 400, 100);
       AccountController controller = new AccountController(reader, secondaryWriter, secondaryAccount);
       controller.processTransactions();
     }


  }

}


