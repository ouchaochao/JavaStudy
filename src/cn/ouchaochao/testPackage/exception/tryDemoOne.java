package cn.ouchaochao.testPackage.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryDemoOne {
    public static void main(String[] args) {
        //输入两个整数，输出两个整数的商
        Scanner input = new Scanner(System.in);
        System.out.println("===Start===");
        try {
            System.out.println("Input the first num: ");
            int one = input.nextInt();
            System.out.println("Input the second num: ");
            int two = input.nextInt();
            System.out.println("The result is: " + (one / two));
        } catch (ArithmeticException e) {
            System.out.println("除数不为零");
            System.exit(1);
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出错啦");
            e.printStackTrace();
        } finally {
            System.out.println("===End===");
        }
    }
}
