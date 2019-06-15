package Bank.Factory.Interfaces.Implements;

import Bank.Account.Account;
import Bank.Account.Implements.CurrentAccount;
import Bank.Factory.Interfaces.AccountFactory;

import java.math.BigDecimal;

public class CurrentAccountFactory implements AccountFactory {
    private double percent = 0.03;
    private BigDecimal balance = BigDecimal.valueOf(0);

    @Override
    public Account createAccount() {
        return new CurrentAccount(percent,balance);
    }
}
