import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // CHALLENGE: MINIMUM & MAXIMUM CHALLENGE
        //
        // 1. Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
        // 2. Before the user enters the number, print the message "Enter number:"
        // 3. If the user enters an invalid number, break out of the loop and print the min & max number.
        // Hint: Use an endless while loop.

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while(true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if(first){
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max){
                    max = number;
                }
                if(number < min){
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min = " + min + ", max = " + max);
        scanner.close();
    }
}
