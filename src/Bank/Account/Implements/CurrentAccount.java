package Bank.Account.Implements;

import Bank.Account.Account;
import Bank.Account.AccountInterface;
import Bank.Exception.BankAccountException;


import java.math.BigDecimal;

public class CurrentAccount extends Account {

    private double percent;

    public CurrentAccount(double percent,BigDecimal balance) {
        this.percent = percent;
        this.balance = balance;
    }


    @Override
    public void validation(BigDecimal money) throws BankAccountException {
        if(balance.compareTo(money) < 0){
            throw new BankAccountException();
        }
    }

    public  double getPercent(){
        return percent;
    }


}
