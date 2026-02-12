package Test;

public class BankAccount {

        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Balance after deposit: " + balance);
        }


        public void withdraw(double amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        }


        public double getBalance() {
            return balance;
        }

    public static void main(String[] args) {


            BankAccount account = new BankAccount(1000);
            account.deposit(500);
            account.withdraw(200);
        }
    }


