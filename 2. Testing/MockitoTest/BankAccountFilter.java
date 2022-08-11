import java.util.ArrayList;
import java.util.List;

public class BankAccountFilter {
    private BankAccountDB dao;

    public BankAccountFilter(BankAccountDB dao){this.dao=dao;}

    public List<BankAccount> filter(){
        List<BankAccount>allAccount = dao.all();
        List<BankAccount>filtered = new ArrayList<>();

        for (BankAccount acct : allAccount){
            if (acct.getBalance()<100){
                filtered.add(acct);
            }
            return filtered;
        }
    return null;}
}
