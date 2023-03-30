package Guess;
import  java.util.Random;


public class Guessgs  {
    public  static  void  main(String[] args){
        Game hu = new Game();
        Random random = new Random();
        int randomInt = random.nextInt( 3);

        hu.intake("John", "Fon", "Don" );
        hu.guess(1,  3, 2);

        if(hu.player1 == randomInt){
            System.out.println(hu.plone + " is the winner");
        } else if (hu.player2 == randomInt) {
            System.out.println(hu.pltwo + " is the winner");

        } else if (hu.player3 == randomInt) {
            System.out.println(hu.plthree + " is the winner");
        } else {
            System.out.println("No winner in this round");
        }
    }
}
