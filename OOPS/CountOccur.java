import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the number to check the occurance of: ");
        int occ = sc.nextInt();
        int count = 0;

        while(num > 0)
        {
            int rem = num % 10;
            if (rem == occ)
            {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
