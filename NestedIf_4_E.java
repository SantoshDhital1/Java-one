import java.util.Scanner;
public class NestedIf_4_E {
    public static void main(String[] args) {
       int age, weight;
        Scanner s1 = new Scanner(System.in);
        System.out.println("How old are you?");
        age = s1.nextInt();
        System.out.println("How much is your weight?");
        weight = s1.nextInt();
        if (age >= 18 && age < 43) {
            if (weight > 50) {
                System.out.println("You are eligible for army.");
            }
            else {
                System.out.println("You are not eligible for army.");
            }
        }

    }
}
