import java.util.Scanner;
public class IfElse_04_C {
    public static void main(String[] args) {
         int year;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the year:");
        year = s1.nextInt();
        if ((year % 4 ==0) && (year % 100 !=0)  || (year % 400 ==0)) {
            System.out.println("Leap year.");
        }
        else {
            System.out.println("Not a leap Year");
        }
    }
}
