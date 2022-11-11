import java.util.Scanner;
public class large {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);
    }
}
