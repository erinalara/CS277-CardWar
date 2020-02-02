


public class Card {

    private String rank;

    private String suit;

    private int value;

    public Card(String c_suit, int c_value){
        suit = c_suit;
        value = c_value;
        if (c_value > 10) {
            if (c_value == 11) {
                rank = "Jack";
            }
            else if (c_value == 12) {
                rank = "Queen";
            }
            else if (c_value == 13) {
                rank = "King";
            }
            else if (c_value == 14) {
                rank = "Ace";
            }
        }
        else {
            rank = String.valueOf(c_value);
        }
    }

    public String getRank(){
        return rank;
    }

    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public boolean equalsTo(Card c) {
        return this.value == c.value;
    }

    public int compareTo(Card c){

        return this.value - c.value;
    }

    //@Override
    public String toString (Card c) {
        return "Card is " + c.rank + " of " + c.suit;
    }
}
