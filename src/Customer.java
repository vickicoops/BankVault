import Secure.Bank;
import Secure.BankManager;

public class Customer {

    public void customerAccessVault(BankManager mrManager, Bank barclays) {

        mrManager.managerAccessVault(barclays);

//        barclays.accessVault();
        // this will only run if accessVault method in Bank class is public/accesible to Customer

    }
}
