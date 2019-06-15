package Bank;

import Bank.Account.Account;
import Bank.Account.AccountInterface;
import Bank.Account.Decorate.Decorate;
import Bank.Account.Decorate.Extends.AccountDecorate;
import Bank.Exception.BankAccountException;
import Bank.Handler.AbstractClass.Extends.InterestPresentHandler;
import Bank.Handler.AbstractClass.Extends.LessCommissionHandler;
import Bank.Handler.AbstractClass.Handler;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws BankAccountException {
        AccountInterface account;
        Handler handlerPresent, handlerCommission;

        Client client = Client.builder("Shahrom", "Musaev")
                .withAddress("Lesnoi")
                .withPassport("12345678")
                .build();


        Bank bank = new Bank();

        bank.createAccount(client, Bank.AccountType.current);

        account = client.getAccount().get(0);

        System.out.println("Your balance: " + account.getBalance());

        account.update(new BigDecimal(100));

        System.out.println("Your balance: " + account.getBalance());

        handlerPresent = new InterestPresentHandler();

        handlerPresent.handler(account);

        System.out.println("Your balance: " + account.getBalance());


    }
}
