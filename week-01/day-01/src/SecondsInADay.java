public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
        int allSeconds = (currentHours * 60 * 60 ) + (currentMinutes * 60 ) + currentSeconds;

        int secondsPerDay = 86400;

        int remainingSeconds = secondsPerDay - allSeconds;

        System.out.println(remainingSeconds);

        int remainingHours = remainingSeconds /60 /60;
        int remainingMinutes = (remainingSeconds - (remainingHours * 60 * 60)) /60;
        int remainingSecondsAfter = (remainingSeconds -(remainingMinutes *60) - (remainingHours * 60 * 60));


        System.out.println("Remaining hours :" + remainingHours);
        System.out.println("Remaining minutes : " + remainingMinutes);
        System.out.println("Remaining seconds : " + remainingSecondsAfter);

    }
}