package Bank;

import Bank.Account.Account;
import Bank.Account.AccountInterface;
import Bank.Account.Decorate.Extends.AccountDecorate;
import Bank.Account.Implements.CreditAccount;
import Bank.Account.Implements.DepositAccount;
import Bank.Exception.BankAccountException;
import Bank.Factory.Interfaces.AccountFactory;
import Bank.Factory.Interfaces.Implements.CreditAccountFactory;
import Bank.Factory.Interfaces.Implements.CurrentAccountFactory;
import Bank.Factory.Interfaces.Implements.DepositAccountFactory;
import org.omg.CORBA.BAD_CONTEXT;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Client {
    private String name;
    private String surname;
    private String address;
    private String passport;
    AccountInterface account;
    ArrayList<AccountInterface> accounts = new ArrayList<AccountInterface>();

    private Client(String name, String surname, String address, String passport) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public ArrayList<AccountInterface> getAccount(){
        return accounts;
    }




    public void addAccount(AccountInterface account){
        accounts.add(account);
    }



    public static Builder builder(String name, String surname)
    {
        return new Builder(name, surname);
    }


    public static class Builder {
        private String name;
        private String surname;
        private String address;
        private String passport;

        private Builder(String name, String surname){
            this.name = name;
            this.surname = surname;
        }


        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withPassport(String passport) {
            this.passport = passport;
            return this;
        }

        public Client build() {
            return new Client(name, surname, address, passport);
        }
    }
}
