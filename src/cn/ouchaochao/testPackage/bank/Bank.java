package cn.ouchaochao.testPackage.bank;

import java.sql.Savepoint;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account, int balance) {
        setAccount(account);
        setBalance(balance);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void saveAaccount() {
        int balance = getBalance();
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance += 100;
        setBalance(balance);

        System.out.println("Add balance: " + balance);
    }

    public void drawAccount() {
        synchronized (this) {
            int balance = getBalance();
            balance -= 200;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(balance);
            System.out.println("Subtraction balance: " + balance);
        }
    }

}
