public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("Вы внесли в счет " +sum );
    }
    public void withDraw(int sum) throws LimitException{
        if (sum>amount){
            throw new LimitException("Ошибка...У вас на счету недостаточно средств для запрашиваемой вами суммы!" +
                    "У вас на счету", amount);
        }
        amount-=sum;
        System.out.println("Вы сняли " + sum );
    }
}