public class Main {

    public static void main(String[] args) {


        /////////////////////////////////////////////////// CHALLENGE ////////////////////////////////////////////////////////
        //                                                                                                                  //
        // 1. Write a method with the name printDayOfTheWeek that has one parameter of type 'int' and name it "day".        //
        // 2. The method should not return any value (hint: void).                                                          //
        // 3. Using a switch statement print "Sunday", "Monday",..., "Saturday" if the int parameter "day" is 0,1,...,6     //
        //                                                                      respectively otherwise it should print:     //
        //                                                                                                "invalid day"     //
        //                                                                                                                  //
        // //////////////////////////////////////////////////// BONUS ////////////////////////////////////////////////////////
        //                                                                                                                  //
        // 1. Write a second solution using if then else, instead of using switch.                                          //
        //                                                                                                                  //
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        printDayOfTheWeek(-1); // invalid day
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7); // invalid day



    }


    private static void printDayOfTheWeek(int day){

        switch(day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }




        // Bonus //


        if (day == 0){
            System.out.println("Sunday Bonus");
        } else if(day == 1){
            System.out.println("Monday Bonus");
        }else if(day == 2){
            System.out.println("Tuesday Bonus");
        }else if(day == 3){
            System.out.println("Wednesday Bonus");
        }else if(day == 4){
            System.out.println("Thursday Bonus");
        }else if(day == 5){
            System.out.println("Friday Bonus");
        }else if(day == 6){
            System.out.println("Saturday Bonus");
        }else if(day == 7){
            System.out.println("Invalid bonus");
        }
    }
}
