package Cart;

import Car.Car;

import java.util.ArrayList;

public class BonusDecorator extends CartDecorator{


    public BonusDecorator(ArrayList<Car> cars) {
        super(cars);
    }

    @Override
    public boolean ship() {
        System.out.println("You have a bonus: 10 l of oil for your car");
        return true;
    }

}
