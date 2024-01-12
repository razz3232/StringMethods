package Palindrome;
import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String palin = input.nextLine();
        StringBuilder palinrev = new StringBuilder(palin);
        String message = (palin.equalsIgnoreCase(palinrev.reverse().toString()))? "Palindrome": "not palindrome";
        System.out.println(message);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        if(sb.equals(sb.reverse()))
        System.out.println("Palindrome");
        System.out.println("not palindrome");


    }
}
