public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int daily = 6;
        int semester = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        String answer1 = (" hours");
        System.out.println(((semester*5) * daily) + answer1);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float workHours = 52 * semester;//884
        float codeHours = (semester * 5) * daily;//510
        float percentage = (codeHours / workHours) * 100;
        String answer2 = ("%");

        System.out.println(percentage + answer2) ;
    }
}