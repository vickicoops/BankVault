//As a Customer I want to be able to access my funds
//As a Bank I want to be able to access my vault and to grant access to the Bank Manager
//As a Bank Manager I want to be able to facilitate customer access to their funds
//Project - allow customers access to the Bank's vault, ONLY through the Bank Manager

import Secure.Bank;
import Secure.BankManager;

public class Main {

    public static void main(String[] args) {
        Bank barclays = new Bank();
        BankManager mrManager = new BankManager();
        Customer bloggs = new Customer();

        bloggs.customerAccessVault(mrManager, barclays);

//        barclays.accessVault();
        // test to check works - this would only run if accessVault method in Bank class was public/accesible to Customer class

    }

}
