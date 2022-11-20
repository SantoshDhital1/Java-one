import java.util.Scanner;
public class IfElse_04_D {
    public static void main(String[] args) {
        int per;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your percentage:");
        per = s1.nextInt();
        if (per >= 90 && per <100) {
            System.out.println("A+ Grade");
        }
        else if (per >=80 && per <90 ) {
            System.out.println("A Grade");
        }
        else if (per >= 70 && per <80) {
            System.out.println("B+ Grade");
        }
        else if (per >=60 && per <70) {
            System.out.println("B Grade");
        }
        else if (per >= 50 && per <60){
            System.out.println("C+ Grade");
        }
        else if (per >= 40 && per <50){
            System.out.println("C Grade");
        }
        else if (per >= 30 && per <40){
            System.out.println("D+ Grade");
        }
        else if (per >= 20 && per <30){
            System.out.println("D Grade");
        }
        else {
            System.out.println("E Grade");
        }
    }
}
