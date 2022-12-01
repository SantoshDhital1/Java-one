import java.util.Scanner;
public class MaxNumInArray_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large;
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array of elements are:");
        for (int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The greatest number of array elements is:");
        large = arr[0];
        for (int i=0; i<n; i++ ) {
            if (large<arr[i]) {
                large = arr[i];
            }
        }
        System.out.println(large);
    }
}
