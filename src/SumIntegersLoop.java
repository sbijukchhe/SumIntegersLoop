/*
The following program should allow the users to input 10 integers and output the total. Please finish it.

import java.util.Scanner;

public class GetIntegers {

    public void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        // Loop should start here
        num = keyboard.nextInt();
        total += num;
        // Loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }

}
 */

import java.util.Scanner;

public class SumIntegersLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, total = 0;

        System.out.println("Please enter 10 numbers to find sum...");

        for(int i=1; i<=10; i++){

            num = input.nextInt();
            total += num;
        }
        System.out.println("\nThe total of all 10 numbers is " + total);
    }
}
