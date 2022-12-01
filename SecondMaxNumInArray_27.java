import java.util.Scanner;
public class SecondMaxNumInArray_27 {
    public static void main(String[] args) {
        int secLar,large;
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
        System.out.println("The second greatest number of array elements is");
        large = arr[0];
        secLar = arr[1];

        for (int i=0; i<=n; i++) {
            if (arr[i] > large) {
                secLar = large;
                large = arr[i];
            }
            else {
                if (arr[i] < large && arr[i] > secLar)
                {
                    secLar = arr[i];
                }
            }

        }
        System.out.println(secLar);
    }
}
