package sample_programs;
import java.util.Scanner;
public class Vowel_or_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //to check whether letter is vowel or consonant
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}