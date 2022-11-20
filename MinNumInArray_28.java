import java.util.Scanner;
public class MinNumInArray_28 {
    public static void main(String[] args) {
        int small;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array elements are:");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The smallest number of array elements is ");
        small = arr[0];
        for (int i=0; i<n; i++) {
            if(small > arr[i]) {
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
