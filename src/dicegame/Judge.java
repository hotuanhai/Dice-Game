
package dicegame;

import java.util.Random;
import java.util.Scanner;

public class Judge {
    private static Player[] players = new Player[4];
    private static Dice[] dices = new Dice[4];
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of player");
        int numPlay = scanner.nextInt();
        createDice();
//        for(int i = 1 ; i <= 4; ++i){
//            int val = dices[i-1].getVal();
//           System.out.print(val + " ");
//        }
        System.out.println("");
        createPlayer(numPlay);
//        for(int i = 1; i <= 4; ++i){
//            System.out.println(players[i-1].getName());
//        }
        
        while(true){
            System.out.println("Enter next player's turn ");
            System.out.println("(1,2,3,4)");
            int turn = scanner.nextInt();
            players[turn -1].roll(dices[rd.nextInt(4)]);
            System.out.println(players[turn -1].getName() + " new point:" + players[turn -1].getPoint());
            if(players[turn -1].getPoint() == 21){
                System.out.println("The winner is: " + players[turn -1].getName());
                for(int i = numPlay + 1 ; i <= 4; ++i){
                    int a = i - numPlay;
                    System.out.println("player " + players[i-1].getName() +": " + ((AI)players[i-1]).showEmo(i-1));
                }
                break;
            }
        }
    }
    
    public static void createDice(){
        for(int i = 1; i <= 4; ++i){
            dices[i-1] = new Dice(i);
        }
    }
    public static void createPlayer(int numPlay){
        Scanner scanner = new Scanner(System.in);

        for(int i = 1 ; i <= numPlay; ++i){
            System.out.println("player " + i + " name: ");
            String name  = scanner.nextLine();
            players[i-1] = new Player(name);
        }
        for(int i = numPlay + 1 ; i <= 4; ++i){
            int a = i - numPlay;
            String name = "AI " + a;
             players[i-1] = new AI(name);
        }
    }
}
