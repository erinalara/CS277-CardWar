

import java.util.ArrayList;

public class Deck {

    //private Card c;
    ArrayList <Card> deck = new ArrayList<Card>();

    public void addCards() {
        String card_suit = "";
        for (int i = 0; i < 4; i++) {

            for (int j = 0; i < 13; j++) {

                if (i == 0) {
                    card_suit = "Hearts";
                }
                if (i == 1) {
                    card_suit = "Diamonds";
                }
                if (i == 2) {
                    card_suit = "Clovers";
                }
                if (i == 3) {
                    card_suit = "Spades";
                }
                Card c = new Card(card_suit, j);
                deck.add(c);
            }
        }
    }

    public void shuffle() {

        int max = deck.size();
        int min = 1;

        for (int i = 0; i < deck.size(); i++) {

            int rd = (int)(( Math.random() * (max - min + 1)))  ;
            System.out.println(rd); // random number

            Card c_switch = deck.get(i);
            Card c_swap = deck.get(rd);

        }

        for (int j = 0; j < 52; j++) {
            System.out.println(deck.get(j));
        }


    }

    public void deal(int players){



    }

    public void plsy() {


    }

    @Override
    public String toString () {

        return "";
    }

}
