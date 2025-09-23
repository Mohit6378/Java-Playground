import java.util.Scanner;

class checkchar {
    public static void main(String args[]) {

        Scanner letter = new Scanner(System.in);
        System.out.println("Enter a character:");

        char ch = letter.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " is a lowercase letter.");

        else if (ch >= 'A' && ch <= 'Z')
             System.out.println(ch + "is an uppercase letter.");

        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + "is a digit.");
        else
            System.out.println(ch + "is a special symbol.");
    }
}