public class Main {

    public static void main(String[] args) {



        int number = 4;
        int finishNumb = 20;

        while (number <= finishNumb){
            number++;
            if(! isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
           }

            // modify the while code above.
            // Make it also record the total number of even numbers it has found
            // and break once 5 are found
            // and at the end, display the total number of even numbers found

        
        }

    // 1. Create a method called isEvenNumber that takes a parameter of type int.
    // 2. Its purpose is to determine if the argument passed to the method is an even or odd.
    // 3. Return true if an even number, otherwise return false;


    public static boolean isEvenNumber(int number){
            if ((number % 2 ) == 0) {
                return true;
            } else{
                return false;
            }
        }

    }

