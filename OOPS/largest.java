import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        if(a > b && b > c)
        {
            System.out.println(a + " is largest no.");
        }
        else if(b > a && b > c)
        {
            System.out.println(b + " is largest no.");
        }
        else
        {
            System.out.println(c + " is largest no.");
        }
    }
}