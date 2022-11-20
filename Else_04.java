import java.util.Scanner;
public class Else_04 {
    public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		int age = 18;
		System.out.println("Enter your age:");
		age = s1.nextInt();
		if (age >= 18) {
			System.out.println("You are a voter.");
		}
	}
}