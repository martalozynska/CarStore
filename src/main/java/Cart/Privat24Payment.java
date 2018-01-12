package Cart;

public class Privat24Payment implements  PaymentStrategy{

    @Override
    public boolean pay(double money) {
        System.out.println("You pay with Privat24. Price is " + money);
        return true;
    }
}
