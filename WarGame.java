import java.util.ArrayList;

public class WarGame {

    private int wins;

    public void play(int playerNum) {

        Deck d = new Deck();
        d.addCards();
        d.shuffle();

        ArrayList <ArrayList> players_decks = new ArrayList<>();
        for (int i = 0; i < playerNum; i++) {
            ArrayList player = d.deal(playerNum);
            players_decks.add(player);
        }

        //Card max;
        // ERIC IDK HOW TO FIX THIS 
        // how to like idk uhhh remember the players' cards and compare
        for (int j = 0; j < playerNum; j++) {
            ArrayList <Card> player = players_decks.get(j);
            Card p_card = player.remove(0);
            System.out.println("Player " + (j+1) + "'s " + p_card.toString());
        }

        








    }

    public void gameOver(){


    }

    public String toString() {
        return "";

    }


}
