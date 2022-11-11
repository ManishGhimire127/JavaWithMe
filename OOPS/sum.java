// Take two numbers and print the sum of both.

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        int a = no.nextInt();

        System.out.print("Enter the second no.:");
        int b = no.nextInt();

        int c = a + b;
        System.out.println("The Sum of two no. is: "+ c);
    }
}
