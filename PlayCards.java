import javax.swing.*;
/**PlayCards , application that distributes cards for plyers
 * Date 08 Maj 2016
 * @author Meriton Qela
 */
public class PlayCards {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(" Please type the number of players");
        int numOfPlayers = new Integer(input).intValue();
        if (numOfPlayers > 6) {
            JOptionPane.showMessageDialog(null, "This game don't accpets more than six players");
        } else {
            int numCanditade = numOfPlayers;
            String heart = "\u2764";
            String diamond = "\u2666";
            String spades = "\u2660";
            String clubs ="\u2663";
            String[] cards = new String[52];
            cards[0] = "A"+diamond;     cards[13] = "A"+heart;   cards[26] = "A"+ spades;    cards[39] = "A"+ clubs;
            cards[1] = "2"+diamond;     cards[14] = "2"+heart;   cards[27] = "2"+ spades;    cards[40] = "2"+ clubs;
            cards[2] = "3"+diamond;     cards[15] = "3"+heart;   cards[28] = "3"+ spades;    cards[41] = "3"+ clubs;
            cards[3] = "4"+diamond;     cards[16] = "4"+heart;   cards[29] = "4"+ spades;    cards[42] = "4"+ clubs;
            cards[4] = "5"+diamond;     cards[17] = "5"+heart;   cards[30] = "5"+ spades;    cards[43] = "5"+ clubs;
            cards[5] = "6"+diamond;     cards[18] = "6"+heart;   cards[31] = "6"+ spades;    cards[44] = "6"+ clubs;
            cards[6] = "7"+diamond;     cards[19] = "7"+heart;   cards[32] = "7"+ spades;    cards[45] = "7"+ clubs;
            cards[7] = "8"+diamond;     cards[20] = "8"+heart;   cards[33] = "8"+ spades;    cards[46] = "8"+ clubs;
            cards[8] = "9"+diamond;     cards[21] = "9"+heart;   cards[34] = "9"+ spades;    cards[47] = "9"+ clubs;
            cards[9] = "10"+diamond;    cards[22] = "10"+heart;  cards[35] = "10"+ spades;   cards[48] = "10"+clubs;
            cards[10] = "J"+diamond;    cards[23] = "J"+heart;   cards[36] = "J"+ spades;    cards[49] = "J"+ clubs;
            cards[11] = "Q"+diamond;    cards[24] = "Q"+heart;   cards[37] = "Q"+ spades;    cards[50] = "Q"+ clubs;
            cards[12] = "K"+diamond;    cards[25] = "K"+heart;   cards[38] = "K"+ spades;    cards[51] = "K"+ clubs;

            int[] index = new int[52];


            for (int i = 1; i <= numCanditade; i++)
            {
                System.out.println(" Lojtari " + i);
                boolean prcess = true;
                int j = 1;
                while (j<=4 || prcess)
                {
                    int card = chooseCard();
                    if (index[card] == 0) {
                        System.out.print(cards[card] + ",  ");
                        index[card] = card;
                        prcess = false;
                        j++;
                    }

                }
                System.out.println("\n");

            }


        }

    }

    public static int chooseCard(){
        int random = (int)(Math.random()*52);
        return random;
    }

}






