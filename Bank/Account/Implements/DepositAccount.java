package Bank.Account.Implements;

import Bank.Account.Account;
import Bank.Exception.BankAccountException;
import java.util.Date;



import java.math.BigDecimal;

public class DepositAccount extends Account {

    private double percent;
    private Date expirationData;


    public DepositAccount(double percent, BigDecimal balance, Date expirationData) {
        this.percent = percent;
        this.balance = balance;
        this.expirationData = expirationData;
    }


    @Override
    public void validation(BigDecimal money) throws BankAccountException {
        if(expirationData.before(new Date())){
            throw new BankAccountException();
        }
    }
}

