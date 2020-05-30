public class Main {

    public static void main(String[] args) {

        // CHALLENGE //
        // 1. Write a method with the name sumDigits that has one int parameter called number.
        // 2. If parameter is >= 10 then the method should process the number and return *sum of all digits*, otherwise
        //                                          return -1 to indicate invalid value.
        // 3. The numbers from 0-9 have 1 digit so we don't want to process them also we don't want to process negative
        //                                          numbers, so also also return -1 for negative numbers.
        // EX) For example calling the method sumDigits(125) should return 8 since 1+2+5=8.
        // EX) Calling the method sumDigits(1) should return -1 as per requirements described above.

        System.out.println("Sum of digits is number 125 is " + sumDigits(125));
        System.out.println("Sum of digits is number 125 is " + sumDigits(-125));
        System.out.println("Sum of digits is number 125 is " + sumDigits(5));


    }

    private static int sumDigits(int number){
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        // 125  -> 125 / 10 = 12. -> 12 * 10 = 120. -> 125-120-5.

        while (number > 0){
            // extract least significant digit
            int digit = number % 10;
            sum += digit;

            // drop LSF

            number /= 10; // same as Number = number / 10;

        }
        return sum;
    }
}
