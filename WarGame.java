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




    }

    public void gameOver(){


    }

    public String toString() {
        return "";

    }


}
