import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankAccountFilterTest {
    @Test
    void filterAccounts(){
        BankAccount acct1 = new BankAccount(1234,50,-100);
        BankAccount acct2 = new BankAccount(1235,150,100);

        BankAccountDB dao = Mockito.mock(BankAccountDB.class);

        List<BankAccount> results = Arrays.asList(acct1,acct2);
        Mockito.when(dao.all()).thenReturn(results);

        BankAccountFilter filter = new BankAccountFilter(dao);
        List<BankAccount> result = filter.filter();

        Assertions.assertEquals(acct1, result.get(0));
        Assertions.assertEquals(1, result.size());
    }
}
