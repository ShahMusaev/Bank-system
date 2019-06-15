package Bank;

import Bank.Account.AccountInterface;
import Bank.Account.Decorate.Extends.AccountDecorate;
import Bank.Exception.BankAccountException;
import Bank.Factory.Interfaces.AccountFactory;
import Bank.Factory.Interfaces.Implements.CreditAccountFactory;
import Bank.Factory.Interfaces.Implements.CurrentAccountFactory;
import Bank.Factory.Interfaces.Implements.DepositAccountFactory;

import java.math.BigDecimal;

public class Bank {

    private AccountFactory accountFactory;
    private AccountInterface account;
    enum AccountType {
        deposit,
        credit,
        current
    }


    public void createAccount(Client client, AccountType accountType) throws BankAccountException {
        switch (accountType) {
            case deposit:
                accountFactory = new DepositAccountFactory();
                if(client.getPassport() == null) {
                    account = new AccountDecorate(accountFactory.createAccount(), BigDecimal.valueOf(50000));
                    System.out.println("Client with limit card");
                    break;
                }
                account = accountFactory.createAccount();
                System.out.println("Client haven't limit");
                break;

            case credit:
                accountFactory = new CreditAccountFactory();
                if(client.getPassport() == null) {
                    account = new AccountDecorate(accountFactory.createAccount(), BigDecimal.valueOf(20000));
                    System.out.println("Client with limit card");
                    break;
                }
                account = accountFactory.createAccount();
                System.out.println("Client haven't limit");
                break;

            case current:
                accountFactory = new CurrentAccountFactory();
                if(client.getPassport() == null) {
                    account = new AccountDecorate(accountFactory.createAccount(), BigDecimal.valueOf(50000));
                    System.out.println("Client with limit card");
                    break;
                }
                account = accountFactory.createAccount();
                System.out.println("Client haven't limit");
                break;

            default:
                throw new BankAccountException();
        }
        client.addAccount(account);
    }
}
