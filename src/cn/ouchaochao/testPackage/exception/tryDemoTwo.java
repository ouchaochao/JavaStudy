package cn.ouchaochao.testPackage.exception;

import java.util.Scanner;

public class tryDemoTwo {
    public static void main(String[] args) {
        int result = test();
        System.out.println("The result is: " + result);
    }

    public static int test() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Start===");
        try {
            System.out.println("First input:");
            int one = input.nextInt();
            System.out.println("Second input");
            int two = input.nextInt();
            return one / two;
        } catch (ArithmeticException e) {
            System.out.println("除数不为零");
            return 0;
        } finally {
            System.out.println("===End===");
        }
    }
}
