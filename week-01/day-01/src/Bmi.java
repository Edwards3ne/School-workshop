public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double heightInM2 = heightInM * heightInM;
        double BMI = massInKg / heightInM2;

        // Print the Body mass index (BMI) based on these values
        System.out.println(BMI);

    }
}