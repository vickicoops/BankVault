package Secure;

public class Bank {

    protected void accessVault() {
        //protected method, so only accessible to Classes within the package (or any subsequently created child classes)
        //if this were a public method, the Customer would also be able to access the Vault by calling this method

        System.out.println("Welcome to the vault");
    }

}