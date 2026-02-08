import java.util.*;

public class Guess {
    public static void main(String Char[]) {
        Scanner cha = new Scanner(System.in);
        
        int Guess = 0;
        Random N = new Random();
        int Secret = N.nextInt(100)+1;

        do {
            System.out.print("Enter your Guess(1-100): ");
            Guess = cha.nextInt();
        if (Guess > Secret)
            System.out.println("Too High!");
        else if (Guess < Secret)
            System.out.println("Too Low!");
        else
            System.out.println("CONGRATULATIONS!");
        } while (Guess != Secret);
    } 
}