package OOPsProblem.ExampleAbstraction.Bank;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(12345678, 1000);
        savingAccount.showBalance();
        savingAccount.diposit(500);
        savingAccount.withdraw(300);
        savingAccount.showBalance();
    }
}
