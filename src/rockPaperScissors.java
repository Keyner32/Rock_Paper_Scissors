import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by GabeKeyner on 8/4/2016.
 */
public class rockPaperScissors {


    static ArrayList<String> gameHistory = new ArrayList<>();


    public static void main(String[] args) {


        System.out.println("Greetings you have encountered the The Bridge to Narnia! \nIn order to cross this bridge you must surpass the test.. "); //This is my Title Menu
        System.out.println("You will need to make a life or death decision, \nSo choose your spirit animal to help you conquer your quest!");
        System.out.println("\nType [play] to start the game");
        System.out.println("Or type [history] to see previous quests!");
        enterPlay();


    }

    public static void enterPlay() {

        String userString = grabenterDraw();


        if (userString.equals("play")) {
            System.out.println("You may begin!\nYou may choose lion, lizard, hornet");
            enterDraw();
        } else {
            System.out.println("Invalid User Input \nType play or history to see previous quests!");

            enterDraw();
        }

    }


    public static void enterDraw() {


        String userString = grabenterDraw();// declaring the variable from the users string

        String compChoice;          // declaring the variable for the computer

        Random rn = new Random();       // generating the computer to chose 3 random numbers
        int compAnswer = rn.nextInt(3);


        if (compAnswer == 0) {

            compChoice = "lion";

        } else if (compAnswer == 1) {
            compChoice = "lizard";

        } else {
            compChoice = "hornet";
        }
        System.out.println(compChoice);

        // always need too print out to check your code in the messsage


        if (userString.equals(compChoice)) {
            gameHistory.add("Its a draw");
            System.out.println("its a draw!");

        } else if ((userString.equals("lion")) && (compChoice.equals("lizard"))) {
            gameHistory.add("Quest Won");
            System.out.println("You won!... enjoy your delicious meal.");


        } else if ((userString.equals("lion")) && (compChoice.equals("hornet"))) {
            gameHistory.add("Quest Lost");
            System.out.println("You lost... your were stung to death by a swarm of hornets.");

        } else if ((userString.equals("lizard")) && (compChoice.equals("lion"))) {
            gameHistory.add("Quest Lost");
            System.out.println("You lost... you were eaten by a ferocious beast.");

        } else if ((userString.equals("lizard")) && (compChoice.equals("hornet"))) {
            gameHistory.add("Quest Won");
            System.out.println("You won! your long tongue was able to snatch that bug out of the sky.");

        } else if ((userString.equals("hornet")) && (compChoice.equals("lizard"))) {
            gameHistory.add("Quest Lost");
            System.out.println("You lost... you came to the wrong reptiles habitat.");

        } else if ((userString.equals("hornet")) && (compChoice.equals("lion"))) {
            gameHistory.add("Quest Won");
            System.out.println("You won! you swarmed your enemy and stung it to death. ");

        } else if (userString.equals("quit")) {
            System.exit(0);
        } else if (userString.equals("history")) {
            gameHistory();

        } else {
            System.out.println("Invalid User Input");
        }


        System.out.println("\nChoose again or type [quit] to leave...");


        System.out.println("Or type [history] to see your recent quests!");

        enterDraw();

    }


    public static String grabenterDraw() {          //this scans the user input and sends it back to the computer choice

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();

    }

    public static void gameHistory() {          /*shows my previous games whether it was a Win, Lost , or a Draw
                                                this method was String and made an error asking for a return statement and
                                                changing the return type to void makes it not need one */

        System.out.println("\nHere lies your previous quests!\n");

        for (String quest : gameHistory) {
            System.out.println(quest);
        }
    }
}
