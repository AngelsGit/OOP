import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Assignment taught how to read user input and display it using scanner.
        //

       /*
       Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your year of Birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;
            if(age >= 0 && age <= 100 ){
                System.out.println("Your name is " + name + ", and you are " + age + " years old!");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Eanable to parse year of birth.");
        }
        scanner.close();*/



        // The above was an assignment for Reading user input! Below is the challenge assigned in the course
        // CHALLENGE //////////////
        //
        // 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
        // 2. Create a *scanner* like in the previous lines of code.
        // 3. Use hasNextInt() method from the scanner to check if the user has entered an int value.
        // 4. If hasNextInt() returns false, print the message "invalid number". Continue reading until you
        //                                                              read 10 numbers.
        // 5. Use the nextInt() method to get the number and add it to the sum.
        // 6. Before the user enters each number print the message "enter user #x where x represents the count
        //                                                              ie. 1,2,3,4,5 etc.
        // Ex) The first message printed to the user would be "enter number #1:" the next "enter number #2:" and so on.

        Scanner scanner = new Scanner (System.in);

        int counter = 0;
        int sum = 0;

        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter ++;
                sum += number;
                if (counter == 10){
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine(); // handle end of line enter key.
        }
        System.out.println("Sum =" + sum);
        scanner.close();
    }
}
