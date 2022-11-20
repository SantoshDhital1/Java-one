import java.util.Scanner;
public class SumOfPrimeNum_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum=0, count=0;
        String primeNumbers = "";
        System.out.println("Enter the first numbers n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter  the last number n2:");
        int n2 = sc.nextInt();
        for (int i=n1; i<=n2; i++) {
            count = 0;
            for (num=i; num>=1; num--) {
                if (i%num==0) {
                    count ++;
                }
            }
            if(count == 2) {
                sum +=i;
            }
        }
        System.out.println("The sum of prime numbers from n1 to n2 is " + sum);
    }
}
