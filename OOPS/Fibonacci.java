import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the nth term: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, num;
        System.out.println(a);
        System.out.println(b);
        if (n>0)
        {
        for (int i = 2; i < n; i++)
        {
            num = a + b;
            System.out.println(num);
            a = b;
            b = num;
        }
        }
    }

}
