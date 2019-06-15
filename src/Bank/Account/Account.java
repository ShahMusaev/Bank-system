package Bank.Account;

import Bank.Client;
import Bank.Exception.BankAccountException;


import java.math.BigDecimal;

public abstract class Account implements AccountInterface {

    protected Client client;
    protected BigDecimal balance;

    public void update(BigDecimal money){
        balance = balance.add(money);

    }

    public void transfer(BigDecimal money, AccountInterface account) throws BankAccountException{
        this.withdraw(money);
        account.update(money);

    }

     public void withdraw(BigDecimal money) throws BankAccountException{
        validation(money);
        balance = balance.subtract(money);

     }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void validation(BigDecimal money) throws BankAccountException;

}


