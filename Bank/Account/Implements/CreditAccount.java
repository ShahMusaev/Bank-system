package Bank.Account.Implements;

import Bank.Account.Account;
import Bank.Exception.BankAccountException;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private BigDecimal limit;
    private BigDecimal commission;

    public CreditAccount(BigDecimal balance,BigDecimal limit, BigDecimal commission) {
        this.limit = limit;
        this.commission = commission;
        this.balance = balance;
    }

    @Override
    public void validation(BigDecimal money) throws BankAccountException {
        if (limit.compareTo(balance.subtract(money)) < 0)
            throw new BankAccountException();
    }

    public BigDecimal getCommission() {
        return commission;
    }
}
