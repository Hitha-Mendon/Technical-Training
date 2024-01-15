//You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

import java.util.Scanner;

public class code3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for 'c': ");
        int c = scanner.nextInt();

        int result = greenTicket(a, b, c);

        System.out.println("Result based on the green lottery ticket: " + result);

        scanner.close();
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }
}
