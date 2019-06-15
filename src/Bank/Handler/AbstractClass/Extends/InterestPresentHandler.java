package Bank.Handler.AbstractClass.Extends;

import Bank.Account.AccountInterface;
import Bank.Account.Implements.CurrentAccount;
import Bank.Handler.AbstractClass.Handler;

import java.math.BigDecimal;

public class InterestPresentHandler extends Handler {
    BigDecimal balanceForPrecent;

    @Override
    public void handler(AccountInterface account) {
        if(account.getClass() == CurrentAccount.class){
            balanceForPrecent = account.getBalance().multiply(BigDecimal.valueOf(((CurrentAccount)account).getPercent()));
            account.setBalance(balanceForPrecent.add(account.getBalance()));
        }
    }

    
}
