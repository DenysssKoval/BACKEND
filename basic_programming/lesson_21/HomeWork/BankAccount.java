public class BankAccount {

        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Недостаточно средств на счете!");
            }
        }

        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount(1000.0);

            System.out.println("Баланс счета: " + account.getBalance());

            account.deposit(500.0);
            System.out.println("Баланс счета после внесения 500 рублей: " + account.getBalance());

            account.withdraw(300.0);
            System.out.println("Баланс счета после снятия 300 рублей: " + account.getBalance());

            account.withdraw(1500.0);
            System.out.println("Баланс счета после попытки снять 1500 рублей: " + account.getBalance());
        }


    }

