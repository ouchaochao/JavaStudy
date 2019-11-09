package cn.ouchaochao.testPackage.bank;

public class SaveAccount implements Runnable {
    Bank bank;

    public SaveAccount(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        bank.saveAaccount();
    }
}
