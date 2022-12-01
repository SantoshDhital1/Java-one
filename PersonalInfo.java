import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        String name;
        String address;
        int age, n=5;
        long phoneNumber;

        System.out.println("What is your name?");
        name = info.nextLine();

        System.out.println("Where are you from?");
        address = info.nextLine();

        System.out.println("How old are you?");
        age = info.nextInt();

        System.out.println("What is your phone number?");
        phoneNumber = info.nextLong();


            System.out.println("Your name is " + name);
            System.out.println("You address is " + address);
            System.out.println("Your age is " + age);
            System.out.println("Your phone number is " + phoneNumber);


    }
}
