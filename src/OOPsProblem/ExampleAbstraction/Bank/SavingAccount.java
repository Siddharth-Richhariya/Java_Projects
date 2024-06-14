package OOPsProblem.ExampleAbstraction.Bank;

public class SavingAccount extends Account {

    SavingAccount(int accountNumber, double Balance) {
        super(accountNumber, Balance);

    }

    void diposit(double amount) {
        Balance += amount;
        System.out.println("Deposited "+amount+" to saving account");
    }

    void withdraw(double amount){
        if(amount<= Balance){
            Balance -= amount;
            System.out.println("Withdrew "+amount+" to saving account");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

}
