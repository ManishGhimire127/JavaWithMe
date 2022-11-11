import java.util.Scanner;
public class large1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
