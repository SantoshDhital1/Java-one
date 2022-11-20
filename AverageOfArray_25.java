import java.util.Scanner;
public class AverageOfArray_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        float average=0;
        System.out.println("Enter the number of elements you want to take average:");
        int n= sc.nextInt();
        int arr[] = new int[20];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            average = sum/n;
        }
        System.out.println("Array elements are:");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The average of the array elements is " + average);
    }
}
