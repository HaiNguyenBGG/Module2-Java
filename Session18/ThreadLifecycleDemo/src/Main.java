class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " rút tiền: " + amount);
            balance -= amount;
            System.out.println("Số dư còn lại: " + balance);
        } else {
            System.out.println("Không đủ tiền!");
        }
    }
}

class Customer extends Thread {
    private BankAccount bankAccount;
    private int amount;

    public Customer(BankAccount bankAccount, int amount, String name) {
        super(name);
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public void run() {
        bankAccount.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread user1 = new Customer(bankAccount, 700, "User 1");
        Thread user2 = new Customer(bankAccount, 700, "User 2");

        user1.start();
        user2.start();
    }
}