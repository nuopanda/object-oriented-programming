package Assignment1;

public class ScratchAccount {
    public static void main(String[] argv) {
        AccountHolder holder = new AccountHolder("John", "Green");
        Amount amount = new Amount(100, 9);
        Amount deposit = new Amount(20, 5);
        Account account = new Account(holder, amount);
        Account updatedAccount = account.deposit(deposit);
        System.out.println(updatedAccount.getDollar());
        System.out.println(updatedAccount.getCents());
        Amount withdraw = new Amount(11, 22);
        Account updatedAccount2 = account.withdraw(withdraw);
        System.out.println(updatedAccount2.getDollar());
        System.out.println(updatedAccount2.getCents());

    }
}
