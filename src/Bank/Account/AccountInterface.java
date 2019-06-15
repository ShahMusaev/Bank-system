package Bank.Account;

import Bank.Exception.BankAccountException;
import org.omg.CORBA.BAD_CONTEXT;

import java.math.BigDecimal;

public interface AccountInterface {
    void  withdraw(BigDecimal money) throws BankAccountException;
    void transfer(BigDecimal money, AccountInterface account) throws BankAccountException;
    void update(BigDecimal money);
    BigDecimal getBalance();
    void setBalance(BigDecimal balance);

}
