public class Main {

    public static void main(String[] args) {
	    // CHALLENGE01
        // 1. Create a method called getDurationString with two parameters:
        //                                      1st Parameter in minutes
        //                                      2nd Parameter in seconds
        // 2. You should validate that the 1st parameter minutes is >=0
        // 3. You should validate that the 2nd parameter seconds is >=0 && <=59
        // 4. The method should return "invalid value" in the method if either of the above are not true
        // 5. If the Parameters are valid then calculate how many hours, minutes, and seconds equal the
        //          minutes and seconds passed to this method and return the value as a string in format
        //          "XXh YYm ZZs" where XX represents the number of hours, YY the minutes and ZZ the seconds
        // 6. Create a 2nd method of the same name but with only one parameter: seconds.
        // 7. Validate that it is >=0 and return "Invalid value" if it is not true.
        // 8. If it is valid then calculate how many minutes are in the seconds value and then call the other
        //          overload method passing the correct minutes and seconds calculated so that it can calculate correctly



        // TIPS:
        // Use int or long for your number data types
        // 1 minutes = 60 seconds, and 1hr = 60 minutes = 3600 seconds
        // Methods should be static currently we are only using static methods



        // BONUS:
        // For the input 61 minutes output should be 01h 01m 00s but it is ok if it is: 1h 1m 0s (use if:else)



        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

    }


    private static String getDurationString(long minutes, long seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value"; }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }



        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    private static String getDurationString(long seconds){
        if(seconds < 0 ){
            return "Invalid Value"; }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);

    }
}
