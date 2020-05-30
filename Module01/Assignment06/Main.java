public class Main {

    public static void main(String[] args) {

        // learning for loops for automation //
        System.out.println("10,000 at 2% interest =" + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest =" + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest =" + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest =" + calculateInterest(10000.0, 5.0));
        System.out.println("10,000 at 6% interest =" + calculateInterest(10000.0, 6.0));
        System.out.println("10,000 at 10% interest =" + calculateInterest(10000.0, 10.0));
        for (int i = 0; i < 2; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        ////////////////////////////////////////// ASSIGNMENT ///////////////////////////////////////
        //                                                                                         //
        // 1. Using the for statement, call the calculateInterest method with the amount of:       //
        //                                                    10000 with an interestRate of:       //
        //                                                                2,3,4,5,6,7 and 8.       //
        // 2. Print the result to the console window                                               //
        //                                                                                         //
        /////////////////////////////////////////////////////////////////////////////////////////////

        for (int i = 2; i < 11; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        //////////////////// MINI CHALLENGE ///////////////////
        //                                                   //
        // How would you modify the for loop above to        //
        // do the sme thing as shown but to start from       //
        // 8% and work back to 2%                            //
        //                                                   //
        ///////////////////////////////////////////////////////

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    
    public static double calculateInterest(double amount, double interestrate){
        return(amount * (interestrate/100));
    }
}
