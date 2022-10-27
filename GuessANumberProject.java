import java.util.Random;
import java.util.Scanner;

public class GuessANumberProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNum = new Random();
        int computerNum = randomNum.nextInt(100);

        while(true){
            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNum;

            boolean isValid = true;

            for(int i = 0; i < playerInput.length(); i++){
                if(playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }
            if(isValid) {
                playerNum = Integer.parseInt(playerInput);
                if(playerNum == computerNum){
                    System.out.println("Congrats! You guessed it!");
                    return;
                }
                else if(playerNum > computerNum){
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            } else {
                System.out.println("Invalid input. ");
            }

            }
    }
}