public class AgeApp {
    public static void main(String[] args) {
        int age = 81; // Change the age here to test

        if (age > 0 && age < 18) {
          // print the age levels  
            System.out.println("You are underage.");
        } else if (age >= 65) {
            System.out.println("You are retired.");
        } else {
            System.out.println("You are an adult.");
        }
        System.out.println("Press space to exit.");
    }
}
