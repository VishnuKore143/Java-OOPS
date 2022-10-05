package Arrays;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String reverse = "";
       int strLength = str.length();
       for (int i=(strLength-1); i>=0; --i){
           reverse  += str.charAt(i);
       }
       if (str.equals(reverse)){
           System.out.println(str+" is palindrome");
       }else {
           System.out.println(str+" is not a palindrome");
       }

    }
}
