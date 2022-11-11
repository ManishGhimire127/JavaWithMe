import java.net.Socket;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Calc {
    public static void main(String[] args) {
        char operator;
        double num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the operator (+, -, *, /): ");
        operator = input.next().trim().charAt(0);

        System.out.print("Enter the first operand: ");
        num1 = input.nextDouble();
        System.out.print("Enter the second operand: ");
        num2 = input.nextDouble();

        input.close();

        switch(operator){
            case '+':
            System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1+num2));
            break;
            case '-':
            System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1-num2));
            break;
            case '/':
            if(num2 != 0)
            System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1/num2));
            else 
            System.out.println("Denominator should not be zero");
            break;
            case '*':
            System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1*num2));
            break;
        }
    }
}
