package Bank.Account.Decorate.Extends;

import Bank.Account.Account;
import Bank.Account.Decorate.Decorate;
import Bank.Exception.BankAccountException;


import java.math.BigDecimal;

public class AccountDecorate extends Decorate {
    BigDecimal limit;

    public AccountDecorate(Account account, BigDecimal limit) {
        super(account);
        this.limit = limit;
    }

    public void transfer(BigDecimal money, Account account) throws BankAccountException {
        if (limit.compareTo(money) < 0)throw new BankAccountException();
        super.transfer(money, account);

    }
    public void withdraw(BigDecimal money) throws  BankAccountException{
        if (limit.compareTo(money) < 0)throw new BankAccountException();
        super.withdraw(money);
    }

    public void update(BigDecimal money){
        super.update(money);
    }

    public BigDecimal getBalance(){
        return super.getBalance();
    }

    public void setBalance(BigDecimal balance){ super.setBalance(balance);}


}
