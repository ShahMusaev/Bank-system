package Bank.Factory.Interfaces.Implements;

import Bank.Account.Account;
import Bank.Account.Decorate.Extends.AccountDecorate;
import Bank.Account.Implements.CreditAccount;
import Bank.Factory.Interfaces.AccountFactory;

import java.math.BigDecimal;
import java.util.Date;

public class CreditAccountFactory implements AccountFactory {
    private BigDecimal limit = BigDecimal.valueOf(15000);
    private BigDecimal commission = BigDecimal.valueOf(200);
    private BigDecimal balance = BigDecimal.valueOf(0);

    @Override
    public Account createAccount() {
        return  new CreditAccount(balance,limit, commission);
    }
}
