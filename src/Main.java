public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(15000.00);
        while (true) {
            try {
                account.withDraw(6000);
                System.out.println(" остаток " + account.getAmount());
            } catch (LimitException e) {
                try {
                    account.withDraw((int)account.getAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }

                System.out.println( e.getMessage());
                break;
            }
        }
    }
}