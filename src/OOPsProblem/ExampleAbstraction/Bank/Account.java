package OOPsProblem.ExampleAbstraction.Bank;

abstract class Account {
    protected int accountNumber;
    protected double Balance;

    Account(int accountNumber, double Balance){
        this.accountNumber = accountNumber;
        this.Balance = Balance;
    }
    abstract void diposit(double amount);
    abstract void withdraw(double ammount);

    void showBalance(){
        System.out.println("Account Number -> "+accountNumber+", Balance ->"+Balance);
    }
}
