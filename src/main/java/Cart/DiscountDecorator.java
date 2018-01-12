package Cart;

import Car.Car;

import java.util.ArrayList;

public class DiscountDecorator extends CartDecorator {
    public DiscountDecorator(ArrayList<Car> cars) {
        super(cars);
    }

    public boolean ship(){
        System.out.println("You have 5% disount on your car");
        return true;
    }
}
