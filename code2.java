//Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().


import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        System.out.print("Enter the value for 'c': ");
        int c = scanner.nextInt();

        int result = noTeenSum(a, b, c);

        System.out.println("Sum without considering teens: " + result);

        scanner.close();
    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 14) || (n >= 17 && n <= 19)) {
            return 0;
        }
        return n;
    }
}
