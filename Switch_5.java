import java.util.Scanner;
public class Switch_5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        char ch;
        System.out.println("Enter any vowel letter:");
        ch = s1.next().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println("vowel letter.");
                break;
            case 'e':
                System.out.println("Vowel letter.");
                break;
            case 'i':
                System.out.println("Vowel letter.");
                break;
            case 'o':
                System.out.println("Vowel letter.");
                break;
            case 'u':
                System.out.println("Vowel letter.");
                break;
            case 'A':
                System.out.println("Vowel letter.");
                break;
            case 'E':
                System.out.println("Vowel letter.");
                break;
            case 'I':
                System.out.println("Vowel letter.");
                break;
            case'O':
                System.out.println("Vowel letter.");
                break;
            case 'U':
                System.out.println("Vowel letter.");
                break;
            default:
                System.out.println("Consonant letter.");
        }
    }
}
