import java.util.Arrays;

public class AddNumInArray_32 {
    public static void main(String[] args) {
        int arr[] = {11, 21, 53, 84, 54, 60};
        int n = arr.length;
        int newArr[] = new int[n+1];
        int value = 49;
        System.out.println("Arrays: " + Arrays.toString(arr));
        for (int i = 0; i<n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;
        System.out.println("Arrays after adding element: " + Arrays.toString(newArr));
    }
}
