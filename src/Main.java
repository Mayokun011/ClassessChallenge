public class Main {
    public static void main(String[] args) {

        Account mayosAccount = new Account();

        mayosAccount.setNumber("91223576");
        mayosAccount.setBalance(5000.00);
        mayosAccount.setCustomerName("Mayos Li");
        mayosAccount.setCustomerEmail("mayosli@gmail.com");
        mayosAccount.setCustomerPhone("08175462891");


        mayosAccount.withdrawFunds(1000.00);
        mayosAccount.depositFunds(2000.00);
        mayosAccount.withdrawFunds(500.00);


    }
}
