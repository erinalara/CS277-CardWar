import java.util.ArrayList;

public class WarGame {

    private int wins;

    public void play(int playerNum) {

        Deck d = new Deck();
        d.addCards();
        d.shuffle();

        Card highest = new Card();
        int losers = 0;

        ArrayList <ArrayList> players_decks = new ArrayList<>();
        ArrayList <Card> cardsInPlay = new ArrayList<>();

        for (int i = 0; i < playerNum; i++) {
            ArrayList player = d.deal(playerNum);
            players_decks.add(player);
        }

        while (losers != playerNum - 1) {

            for (int j = 0; j < playerNum; j++) {

                ArrayList<Card> player = players_decks.get(j);
                if (player.size() == 0) {
                    Card p_card = new Card();
                    cardsInPlay.add(p_card);
                }
                else {
                    Card p_card = player.remove(0);
                    cardsInPlay.add(p_card);
                    System.out.println("Player " + (j + 1) + "'s " + p_card.toString());
                }
            }
            int counter = 0;
            for (int i = 0; i < cardsInPlay.size(); i++) {

                // assume first card played is current highest
                highest = cardsInPlay.get(i);

                if (i != 0) {
                    if (cardsInPlay.get(i).compareTo(highest) > 1) {
                        // if next card is higher than current, mark the next card as the highest
                        highest = cardsInPlay.get(i);
                    }
                }
            }
            for (int i = 0; i < cardsInPlay.size(); i++) {
                if ((cardsInPlay.get(i).equalsTo(highest))){
                    // initiate war
                    counter ++;
                }
            }

            if (counter > 2) {
                war_start(playerNum, players_decks);
            }

            int winner = 0;
            for (int p = 0; p < cardsInPlay.size(); p++) {
                if (cardsInPlay.get(p).equalsTo(highest) == true) {
                    winner = p;
                }
            }
            ArrayList<Card> winner_add = players_decks.get(winner);
            winner_add.addAll(cardsInPlay);

            for (int l = 0; l < playerNum; l++) {
                ArrayList loser = players_decks.get(playerNum);
                if (loser.size() == 0) {
                    losers ++;
                    System.out.println("Player " + playerNum+ "has ran out of cards and lost.");
                }
            }
        }
    }

    public void war_start(int playerNum, ArrayList <ArrayList> players_decks){

        Card high = new Card();
        ArrayList <Card> war = new ArrayList<>();

        for (int k = 0; k < 4; k++) {

            for (int j = 0; j < playerNum; j++) {
                ArrayList<Card> player = players_decks.get(j);
                Card c = player.remove(0);
                war.add(c);
                System.out.println("War card for Player " + (j + 1) + "is xx");
                //System.out.println("Player " + (j+1) + "'s " + c1.toString());
            }
        }

        ArrayList <Card> round = new ArrayList<>();

        for (int g = 0; g+3 < war.size(); g++) {
            Card war1 = war.remove(g);
            round.add(war1);
            System.out.println("War card for Player " + (g + 1) + "'s " + war1.toString());
        }

        int counter = 0;
        for (int i = 0; i < round.size(); i++){
            // assume first card played is current highest
            high = war.get(i);

            if (i != 0) {
                if (war.get(i).compareTo(high) > 1) {
                    // if next card is higher than current, mark the next card as the highest
                    high = war.get(i);

                }
            }
            if ((war.get(i).equalsTo(high))){
                    // initiate war
            }
        }
        for (int i = 0; i < round.size(); i++) {
            if ((round.get(i).equalsTo(high))){
                // initiate war
                counter ++;
            }
        }

        if (counter > 2) {
            war_start(playerNum, players_decks);
        }
    }
    
    

    public void gameOver(){


    }

    public String toString() {
        return "";

    }


}
