import java.util.Scanner;

public class Main {

    public static void main (String[] args){
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int playerNum = getPlayers();

        int remainder = 0;

        if (52 % playerNum > 0){

            remainder = 52 % playerNum;
        }

        System.out.println("remainder: " + remainder);


        Game war = new Game();
        war.play(playerNum);


    }

    public static int getPlayers(){

        Scanner scan = new Scanner(System.in);

        System.out.print("How many players? (min: 2, max: 10): ");

        int playerNum = scan.nextInt();

        while (playerNum < 2 || playerNum > 10) {

            System.out.print("How many players? (min: 2, max: 10): ");
            playerNum = scan.nextInt();
        }
        return playerNum;
    }
}

        int playerNum = getPlayers();

        int remainder = 0;

        if (52 % playerNum > 0){

            remainder = 52 % playerNum;
        }

        System.out.println("remainder: " + remainder);

        System.out.print(playerNum);
    }

    public static int getPlayers(){

        Scanner scan = new Scanner(System.in);

        System.out.print("How many players? (min: 2, max: 10): ");

        int playerNum = scan.nextInt();

        while (playerNum < 2 || playerNum > 10) {

            System.out.print("How many players? (min: 2, max: 10): ");

            playerNum = scan.nextInt();

        }

        return playerNum;
    }
}
