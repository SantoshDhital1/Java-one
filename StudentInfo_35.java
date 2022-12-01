import java.util.*;

public class StudentInfo_35 {
   private String name, address ;
   private  int age;
   private long phoneNum;

    StudentInfo_35(int a, String ad) {
        age = a;
        address = ad;
    }

    StudentInfo_35(String n, long p) {
        name = n;
        phoneNum = p;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of students:");
        int n = sc.nextInt();

        System.out.println("Enter the details of the students:");
       for(int i=1; i<=n; i++) {
           System.out.println("Name: ");
           String name = sc.nextLine();
           System.out.println("Address: ");
           String address = sc.nextLine();
           System.out.println("Age: ");
           int age = sc.nextInt();
           System.out.println("Phone Number: ");
           int phoneNum = sc.nextInt();
       }

    }
}
