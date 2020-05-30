
public class Main {

    public static void main(String[] args) {
	// Example of a basic if/else statement


        int value =1;
        if (value == 1){
            System.out.println("Value was 1");
        }else if(value == 2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }


        int switchValue = 3;
        switch(switchValue){
            case  1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("actually it was a "+ switchValue);
                break; // If you remove the break it will continue on with the following cases: You can remove by commenting it out.
            default:
                System.out.println("Was not 1 or 2");
                break;

                // this code works
        }

        /////////////////////////// CHALLENGE ////////////////////////////////////
        //                                                                      //
        //                                                                      //
        // 1. Create a new switch statement using char instead of int           //
        // 2. Create a new char variable                                        //
        // 3. Create a switch statement testing for: A, B, C, D, or E           //
        // 4. Display a message if any of these are found and then break;       //
        // 5. Add a default which displays a message saying "not found".        //
        //                                                                      //
        //                                                                      //
        /////////////////////// END OF CHALLENGE RULES ///////////////////////////

        char charValue = 'G';
        switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;

            case 'B':
                System.out.println("B was found");
                break;

            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("Not Found");
                break;

                // This code works
        }

    String month = "January";
        switch (month.toLowerCase()){           //.toLowerCase is a class used to make the string appear as lower case to make it simpler and to decrease mistakes
            case "january":
                System.out.println("jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
                break;

                // this code works
        }










    }
}
