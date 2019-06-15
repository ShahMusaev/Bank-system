package Bank.Account.Decorate;

import Bank.Account.Account;
import Bank.Account.AccountInterface;
import Bank.Exception.BankAccountException;

import java.math.BigDecimal;

public abstract class Decorate implements AccountInterface {
    Account account;

    public Decorate(Account account) {
        this.account = account;
    }

    @Override
    public void withdraw(BigDecimal money) throws BankAccountException {
        account.withdraw(money);
    }

    @Override
    public void transfer(BigDecimal money, AccountInterface account) throws BankAccountException {
        this.account.transfer(money, account);
    }

    @Override
    public void update(BigDecimal money) {
        account.update(money);
    }

    @Override
    public BigDecimal getBalance(){
        return account.getBalance();
    }

    public void setBalance(BigDecimal balance){  account.setBalance(balance);}


}
