package com.angelalfaro;

public class Main {

    public static void main(String[] args) {
        // Simple assignment to recap all the data types we learned in class as well as new concepts on strings and operators

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean


        // Today we are learning "strings"
        // A string is a sequence of characters

        ///////////// EXAMPLES OF SIMPLE PROGRAMS USING STRING //////////////////
        String myString = "This is a string";
        System.out.println("My string is equal to : " + myString);

        myString = myString + " and this is more";
        System.out.println(myString);

        myString = myString + " \u00A9";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is: " + numberString);
        // The result will be the combining of the two numbers because it-
        // -treats the numbers as characters not as integers

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string is: " + lastString);
        // it will treat the int as a string
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("Last string value " + lastString);
        // again the java-compiler treats the double as a string


        //////////////// OPERATORS ///////////////////////////////////////

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result - 1;
        System.out.println( previousResult + " - 1  = " + result);
        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        previousResult = result;

        result = result + 1;
        System.out.println("Result is now " + result);
        // result ++; and result-- are two ways to speed this up


        //////////// IF THEN STATEMENT EXAMPLES ///////////////


        boolean newBool = false;
        if (newBool == false)
            System.out.println( "It is not true" );


        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got a high score");
        int secondTopScore = 81;

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests are true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");
        // it would be an error if you used only one equal sign

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true: false;
        if (wasCar )
            System.out.println("wasCar is true");



        ////////////////// CHALLENGE ///////////////////

        // 1. Create a double variable with the value of 20
        // 2. Create a second variable of type double with the value of 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of the #3 divided by the 40
        // 5. Write an "if" statement that displays a message "total was over the limit"
        //       If the remaining total (#4) is equal to 20 or less



        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue ) * 25;
        double theRemainder = myTotal % 40;
        if (theRemainder<= 20)
            System.out.println("The total was over the limit");
        











    }
}
