import java.util.Scanner;
public class Loop_8 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1, n2, num=0;
        System.out.println("Enter the first  number n1:");
        n1 = obj.nextInt();
        System.out.println("Enter the last number n2:");
        n2 = obj.nextInt();
        System.out.println("The numbers from n1 to n2 is:");
        for (int i=n1; i<=n2; i++) {
            System.out.println(i);
        }
    }
}
