public class BankAccount {
    //This Class is going to contain the constructors
    private double accNumber;
    private double balance;
    private double transaction;


    public BankAccount() {
        accNumber = 0.0;
        balance = 0.0;
    }

    BankAccount(double balance) {
        this.balance = balance;
    }

    //withdraw method
    public double withdraw(double moneyWithdrawed){
        if (moneyWithdrawed >= this.balance || this.balance <= 0 || moneyWithdrawed <= 0) {
            System.out.println("YOU DON'T HAVE ENOUGH BALANCE or NUMBER CAN'T BE A NEGATIVE NUMBER");
        } else {
           return this.balance = this.balance - moneyWithdrawed;
        }
        return moneyWithdrawed;
    }

    //depositing method
    public double deposit(double depositedMoney) {
        if (this.balance <= 0 || depositedMoney <= 0) {
            System.out.println("CAN'T DEPOSIT A NUMBER THAT'S NEGATIVE");
        } else {
            return this.balance = this.balance + depositedMoney;
        }
        return depositedMoney;
    }



    //get balance method
    public double getBalance() {
        return this.balance;
    }
}