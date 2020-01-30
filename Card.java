public class Card {

    private String rank;

    private String suit;

    private int value;

    public Card(String rank, String suit, int value){

        rank = rank;

        suit = suit;

        value = value;

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
}
