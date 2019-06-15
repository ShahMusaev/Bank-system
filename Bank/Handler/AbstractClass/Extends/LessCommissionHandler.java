package Bank.Handler.AbstractClass.Extends;

import Bank.Account.AccountInterface;
import Bank.Account.Decorate.Extends.AccountDecorate;
import Bank.Account.Implements.CreditAccount;
import Bank.Account.Implements.CurrentAccount;
import Bank.Handler.AbstractClass.Handler;

import java.math.BigDecimal;

public class LessCommissionHandler extends Handler {
    BigDecimal balanceAfterCommission;

    @Override
    public void handler(AccountInterface account) {
        if(account.getClass() == AccountDecorate.class){
            balanceAfterCommission = account.getBalance().subtract(((CreditAccount) account).getCommission());
            account.setBalance(balanceAfterCommission);
        }
    }
}
