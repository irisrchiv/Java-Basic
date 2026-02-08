import java.util.Scanner;

public class OddEven {
    public static void main (String Char[]) {
        Scanner cha = new Scanner(System.in);

        int N = 0;
        System.out.print("Enter an Integer No: ");
        N = cha.nextInt();

        if ((N % 2) == 0)
            System.out.println("Your Entered Even number.");
        else 
            System.out.println("You entered Odd number.");
    }
    
}
