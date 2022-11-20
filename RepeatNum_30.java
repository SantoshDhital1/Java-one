import java.util.Scanner;
public class RepeatNum_30 {
    public static void main(String[] args) {
//        int count=0;
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
        System.out.println("The repeated numbers are:");
       int max = Integer.MIN_VALUE;
        for (int i=0; i<n;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        int rip[] = new int[max + 1];
        for (int i=0;i<n; i++) {
            rip[arr[i]]++;
        }
        for(int i=0;i<=max;i++) {
            if (rip[i] >1) {
                System.out.println(i + " occurs " + rip[i] + " times.");
            }
        }

    }
}
