import java.util.*;

public class PalindromeStr_1 {
    public static void main(String args[]) {

        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            revStr = str.charAt(i) + revStr;
        }

        System.out.println("Original string " + str);
        System.out.println("Reverse  string " + revStr);

        if (str.equals(revStr)) {
            System.out.println("Palindrome! ");
        } else {
            System.out.println("Not a palindrome! ");
        }
    }
}
