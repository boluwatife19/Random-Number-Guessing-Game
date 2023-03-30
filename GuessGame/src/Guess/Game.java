package Guess;

public class Game {
    String plone = "";
    String pltwo= "";
    String plthree = "";
    int player1 = 0;
    int player2 = 0;
    int player3 = 0;

    void intake(String plone, String pltwo,
              String plthree  ){
        this.plone = plone;
        this.pltwo = pltwo;
        this.plthree = plthree;
    }

    void guess (int player1,
                int player2,
                int player3){
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
    }
}
