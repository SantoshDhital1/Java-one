import java.util.Scanner;
public class SumOfArray_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of elements you want to sum:");
        int n = sc.nextInt();
        int marks[] = new int[15];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        System.out.println("The elements of the array are:");
        for (int i=0; i<n; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("The sum of array is");
        System.out.println(sum);
    }
}
