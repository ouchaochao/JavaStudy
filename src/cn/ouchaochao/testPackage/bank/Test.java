package cn.ouchaochao.testPackage.bank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("1001", 1000);

        SaveAccount sa = new SaveAccount(bank);
        DrawAccount da = new DrawAccount(bank);
        Thread save = new Thread(sa);
        Thread draw = new Thread(da);

        save.start();
        draw.start();

        try {
            draw.join();
            save.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bank);
    }
}
