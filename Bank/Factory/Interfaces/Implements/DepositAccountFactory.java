package Bank.Factory.Interfaces.Implements;

import Bank.Account.Account;
import Bank.Account.Implements.DepositAccount;
import Bank.Factory.Interfaces.AccountFactory;

import java.math.BigDecimal;
import java.util.Date;

public class DepositAccountFactory implements AccountFactory {

   private double percent = 10;
   private BigDecimal balance = BigDecimal.valueOf(0);
   private Date experationData;

    @Override
    public Account createAccount() {
        return new DepositAccount(percent,balance,experationData);
    }
}
