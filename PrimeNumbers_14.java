import java.util.Scanner;
public class PrimeNumbers_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int num=0;
        String primeNumbers = "";
        System.out.println("Enter the first numbers n1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the last number n2:");
        int n2 = sc.nextInt();
        for (i=n1; i<=n2; i++) {
            int counter=0;
            for(num=i; num>=1; num--) {
                if(i%num==0) {
                    counter += 1;
                }
            }
            if (counter==2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers from n1 to n2 are:");
        System.out.println(primeNumbers);
    }
}
