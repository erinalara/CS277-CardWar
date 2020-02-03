import java.util.ArrayList;

public class WarGame {

    private int wins;

    public void play(int playerNum) {

        Deck d = new Deck();
        d.addCards();
        d.shuffle();

        Card highest = new Card("", 0);

        ArrayList <ArrayList> players_decks = new ArrayList<>();
        ArrayList <Card> cardsInPlay = new ArrayList<>();
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
            cardsInPlay.add(p_card);
            System.out.println("Player " + (j+1) + "'s " + p_card.toString());
        }


        // working with 2+ players seems too difficult LOL
        for (int i = 0; i < cardsInPlay.size() - 1; i++){
            for( int j = 1; j < cardsInPlay.size() - 1; j++){

                if ()

            }

            // assume first card played is current highest
            highest = cardsInPlay.get(i);

            if (cardsInPlay.get(i++).compareTo(highest) > 1){

                // if next card is higher than current, mark the next card as the highest
                highest = cardsInPlay.get(i++);
            }

            else if (cardsInPlay.get(i++).compareTo(highest) == 0){

                // initiate war
            }
        }

        








    }

    public void gameOver(){


    }

    public String toString() {
        return "";

    }


}
