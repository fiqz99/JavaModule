public class BankAccount {

    private int acctNum;
    private int balance;
    private int lastTransaciton;

    public BankAccount (int acctNum){this.acctNum = acctNum;}

    public BankAccount(int acctNum, int balance, int lastTransaciton){
        this.acctNum=acctNum;
        this.balance=balance;
        this.lastTransaciton=lastTransaciton;
    }
    public int getAcctNum(){return acctNum;}
    public int getBalance(){return balance;}

    public boolean deposit(int amount){
        if (amount <=0){return false;}

        balance += amount;
        lastTransaciton = amount;
        return true;
    }

    public boolean withdraw(int amount)
    {
        if (amount > 0 && balance >=amount){
            balance -= amount;
            lastTransaciton = amount;
            return true;
        }
        else {
            return false;
        }
    }

}
