import java.util.Scanner;

public class Guessinggame{
    public static void main(String[] args)
    {
        Scanner play = new Scanner(System.in);

            guessGame(play);
        
    }

     static void guessGame(Scanner play) 
     {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Let's play a game. I've picked a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (true) 
        {
            System.out.print("Enter your guess: ");
            guess = play.nextInt();
            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Try higher.");
            } else {
                System.out.println("Try lower.");
            }

            if (attempts == 7) {
                System.out.println("Sorry, you've used all your attempts.");
                System.out.println("The correct number was " + targetNumber + ".");
                break;
            }
        } 
    }
}

