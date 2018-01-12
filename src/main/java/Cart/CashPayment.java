package Cart;

public class CashPayment implements PaymentStrategy {

    @Override
    public boolean pay(double money) {
        System.out.println("You pay with cash. Price is " + money);
        return true;
    }
}
