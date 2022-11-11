// Take a number as input and print the multiplication table for it.

import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int a = no.nextInt();

        for(int i = 1; i <= 10; i++)
        {
            int b = a * i;
            System.out.println(a + "*" + i + "=" + b);
        }
    }
}
 