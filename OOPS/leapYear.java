// Input a year and find whether it is a leap year or not

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner yr = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = yr.nextInt();

        if((year % 400 == 0) || year % 4 == 0 && year % 100 != 0)
        {
            System.out.println(year + " is Leap year");
        }
        else
        {
            System.out.println(year + " is not Leap year");
        }
    }
}
