import java.util.Random;
import java.util.Scanner;

public class AfterRoundOne {
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();
    int computerChoice;
    int playerChoice;
    int playerPick;
    int computerPick;
   AfterRoundOne() {
       System.out.println("Welcome to After Round One");
   }
   void getValues(){
       computerChoice = random.nextInt(10);
       System.out.print("Pick your number (0 - 10): ");
       playerChoice = scanner.nextInt();
       System.out.println();
       System.out.println("Computer's choice: " + computerChoice);
       System.out.println("Player's choice: " + playerChoice);
   }
   void startGame(){
       getValues();
       int status = 0;
       System.out.println("After round one, original panadol extra, oti  gbe ge, babagida yasooo");
       while(status == 0){
           System.out.println();
           System.out.print("Pick your next move: ");
           playerPick = scanner.nextInt();
           computerPick = random.nextInt(10);
           System.out.println("You played " + playerPick);
           System.out.println("Computer played " + computerPick);
           System.out.println();
           System.out.println("Yasooo.......");
           System.out.println();
           if((playerPick + computerPick) == playerChoice){
               System.out.println("Player wins");
               status = 1;
           }
           if((playerPick + computerPick) == computerChoice){
               System.out.println("Computer wins");
               status = 1;
           }
       }
   }
}
