class BankAccount {
    String accountHolder;
    double balance;
    double overdraftLimit;

    
    public BankAccount(String name, double balance, double overdraft) {
        accountHolder = name;
        this.balance = balance;
        overdraftLimit = overdraft;
    }

    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". New balance: $" + balance);
    }

    
    void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        }
    }

    
    void checkBalance() {
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Parashjyoti", 500, 200);

        account.checkBalance();    
        account.deposit(300);      
        account.withdraw(600);     
        account.withdraw(450);     
        account.checkBalance();    
    }
}
