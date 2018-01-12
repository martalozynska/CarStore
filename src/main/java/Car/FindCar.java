package Car;

import java.util.Iterator;
import java.util.List;

public class FindCar {
    public static List<Car> findCar(Car wantedCar, Inventory inventory) {
        List matchingCars = inventory.search(wantedCar);
        if (!matchingCars.isEmpty()) {
            System.out.println("You may like these cars: ");
            for (Iterator i = matchingCars.iterator(); i.hasNext(); ) {
                Car car = (Car) i.next();
                System.out.println(car.getSpec().getName() + " is available.It's " +
                        car.getSpec().getColor() + " The condition is " + car.getSpec().getState() +
                        ", released in " + car.getYear() + " and costs " + car.getPrice() + "$");
            }
        } else {
            System.out.println("It's a pity, but we don't have such a car that You'd like to have.");
        }
        return matchingCars;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addCar(Transmission.AUTOMATIC, "45678946552", State.GOOD, Name.BMW,
                Color.GREEN, 45000, 1998);
        inventory.addCar(Transmission.MECHANICAL, "100255699", State.PERFECT, Name.MERCEDES,
                Color.BLACK, 60000, 2003);
        inventory.addCar(Transmission.MECHANICAL, "985612356", State.SATISFACTORY, Name.CHEVROLET,
                Color.WHITE, 98555, 2011);
        Car car = new Car(Transmission.AUTOMATIC, "45678946552", State.GOOD, Name.BMW,
                Color.GREEN, 45000, 1998);
        FindCar findcar = new FindCar();
        findcar.findCar(car, inventory);




    }

}
