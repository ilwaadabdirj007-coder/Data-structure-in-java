public class BankAccount {



        private String accountNumber;
        private String customerName;
        private double balance;


        public BankAccount(String accountNumber, String customerName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.customerName = customerName;
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance cannot be negative. Setting balance to 0.0.");
                this.balance = 0.0;
            }
        }


        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getCustomerName() {
            return customerName;
        }


        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Successfully deposited $" + amount + ". New Balance: $" + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }


        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount + ". Remaining Balance: $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance for withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        public static void main(String[] args) {

            BankAccount acc = new BankAccount("ACC-002", "Ilwaad abdi", 500.0);

            System.out.println("Account Holder: " + acc.getCustomerName());
            System.out.println("Current Balance: $" + acc.getBalance());

            acc.deposit(250.0);
            acc.withdraw(100.0);
            acc.withdraw(1000.0);
        }
    }



