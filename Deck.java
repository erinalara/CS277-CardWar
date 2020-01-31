

import java.util.ArrayList;

public class Deck {

    //private Card c;
    ArrayList <Card> deck = new ArrayList<Card>();

    public void addCards() {
        String card_suit = "";
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 15; j++) {

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

        int max = deck.size()-1;
        int min = 1;

        for (int i = 0; i < max; i++) {

            int rd = (int)(Math.random() * (max - min + 1)) + min;

            Card c_switch = deck.get(i);
            Card c_swap = deck.get(rd);

            deck.remove(deck.get(i));
            deck.add(i,c_swap);
            deck.remove(deck.get(rd));
            deck.add(rd, c_switch);

        }
        for (int j = 0; j < 52; j++) {
            System.out.println(deck.get(j).toString(deck.get(j)));
        }

    }

    public void deal(int players){


    }

    public void play() {


    }

    @Override
    public String toString () {
        return "";
    }

}
