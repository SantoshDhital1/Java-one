import java.util.Scanner;
public class SecondMinNumInArray_29 {
    public static void main(String[] args) {
        int small,secSmall;
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
        secSmall = arr[1];
        for (int i=0; i<n; i++) {
            if (small > arr[i]) {
                secSmall = small;
                small = arr[i];
            } else if (arr[i] > small && arr[i] < secSmall) {
                secSmall = arr[i];

            }
        }
        System.out.println(secSmall);
        }

    }


