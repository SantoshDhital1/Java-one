import java.util.Scanner;
public class SumOfEvenNum_20 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i, sum=0, n1, n2;
        System.out.println("Enter the first number:");
        n1 = obj.nextInt();
        System.out.println("Enter the last number:");
        n2 = obj.nextInt();
        for (i=n1; i<=n2; i++) {
            if (i%2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of even numbers from n1 to n2 is " + sum);
    }
}
