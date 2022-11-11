
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double ans = 0;

        while(true)
        {
            System.out.print("Enter the operator (+, -, *, /, %): ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                
                System.out.print("Enter first operand: ");
                double a = sc.nextInt();
                System.out.print("Enter second operand: ");
                double b = sc.nextInt();
                
                if(op == '+')
                {
                    ans = a + b;
                }
                if(op == '-')
                {
                    ans = a - b;
                }
                if(op == '*')
                {
                    ans = a * b;
                }
                if(op == '/')
                {
                    if(b != 0)
                    {
                        ans = a / b;
                    }
                }
                if(op == '%')
                {
                    ans = a % b;
                }
                System.out.println("Answer: "+ ans);
                
            }
            
            else if (op == 'x' || op == 'X' )
            break;
            else{
                System.out.println("Invalid value");
                break;
                }
        }
    }
}
