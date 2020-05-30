package com.angelalfaro;

public class Main {

    public static void main(String[] args) {

        // Learning char. Chars have a width of 16 (2 bytes)

        char myChar = '\u00A9';
        System.out.println("Uni code output was: " + myChar);

        // Booleans can only be true or false

        boolean myBoolean = true;
        boolean myBool = false;

        System.out.println ("My Boolean is : " + myBoolean);

        ////////////////////////////////////////////////////////

        // CHALLENGE /////////

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type 'char' and assign it the unicode value for that symbol.
        // 3. Display on the screen.

        ///////////////////////////////////////////////////////////


        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol is: " + registeredSymbol);



    }
}
