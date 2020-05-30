public class Main {

    public static void main(String[] args) {
	// Converting strings to different types "parsing values". It's useful when needing a string to convert it into int to use in calculation.
        String numberAsString = "2018.124";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);



    }
}
