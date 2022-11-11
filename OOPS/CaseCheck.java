import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any char: ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
 