package test;
import code.GUI.Account;
import org.junit.Assert;
import org.junit.Test;
import code.Business_Logic.Euro;

public class AccountTest {
    @Test
    public void TestValidatePIN() {
        Account account = new Account(1234, 1234, 100, 100);
        Assert.assertTrue(account.validatePIN(1234));
    }

    @Test
    public void TestCostruttore() {
        Account myAccount = new Account(1234, 1234, 1000, 1000);
        Assert.assertEquals(1234, myAccount.getAccountNumber());
        Assert.assertEquals(1000, myAccount.getAvailableBalance(), 0.001);
        Assert.assertEquals(1000, myAccount.getTotalBalance(), 0.001);
    }

    @Test
    public void TestCredit() {
        Account myAccount = new Account(1234, 1234, 1000, 1000);
        myAccount.credit(100);
        Assert.assertEquals(1100, myAccount.getTotalBalance(), 0.001);
    }

    @Test
    public void TestDebit() {
        Account myAccount = new Account(1234, 1234, 1000, 1000);
        myAccount.debit(100);
        Assert.assertEquals(900, myAccount.getAvailableBalance(), 0.001);
        Assert.assertEquals(900, myAccount.getTotalBalance(), 0.001);
    }
}