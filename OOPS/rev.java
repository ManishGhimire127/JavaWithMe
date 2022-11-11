import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int a = num.nextInt();

        String s = a + " ";
        StringBuilder str =  new StringBuilder();
        str.append(s);
        System.out.println(str.reverse());
    }
}