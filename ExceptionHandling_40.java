public class ExceptionHandling_40 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        try {
            int i = arr[4];

            System.out.println("This statement is never executed if error occurs.");
        }
        catch (Exception e) {
            System.out.println("Exception caught in catch block.");
        }
        finally {
            System.out.println(arr[0]);
            System.out.println("Finally block executed.");
        }
    }
}
