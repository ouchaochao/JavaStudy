package cn.ouchaochao.testPackage.stringDemo;

public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Thinking in Java");
        byte[] arrs = str.getBytes();
        for (byte arr : arrs) {
            System.out.print(arr + " ");
        }
        System.out.println();
        String str1 = new String(arrs);
        System.out.println(str1);

    }
}
