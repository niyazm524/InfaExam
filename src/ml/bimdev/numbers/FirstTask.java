package ml.bimdev.numbers;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int goodNumbers = 0;

        System.out.print("Enter count of numbers: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.printf("Enter %s'th number: ", i+1);
            int n = Math.abs(sc.nextInt());  // ну на всякий случай
            if (isConditionOK(n)) {
                goodNumbers++;
                if(goodNumbers > 2) break;
            }
        }

        if(goodNumbers == 2) {
            System.out.println("Exact two numbers!");
        } else {
            System.out.println("Nope :(");
        }

    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static boolean isConditionOK(int n) {
        if(countOfEvenDigits(n) % 2 == 0) {
            int fact = factorial(countOfDigits(n));
            int remainder = fact % 2;
            while (fact > 0) {
                int digit = fact % 10;
                if(digit % 2 != remainder) {
                    return false;
                }

                fact /= 10;
            }
            return true;
        }
        return false;
    }

    private static int countOfEvenDigits(int n) {
        int count = 0;

        while(n > 0) {
            int digit = n % 10;
            if(digit % 2 == 0)  count++;
            n = n / 10;
        }
        return count;
    }

    private static int countOfDigits(int n) {
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
