package Bank.Handler.AbstractClass;

import Bank.Account.Account;
import Bank.Account.AccountInterface;

public abstract class Handler {
    private Handler next;

    public Handler linkWith(Handler next){
        this.next = next;
        return next;
    }

    public abstract void handler(AccountInterface account);
}
