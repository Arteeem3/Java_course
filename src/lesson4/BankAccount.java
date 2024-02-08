package lesson4;


public class BankAccount {
    int id = 10;
    String name = "Petr";
    double balance;

}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Artem";
        MyAccount.balance = 200.99;

        System.out.println(MyAccount.name);

    }
}