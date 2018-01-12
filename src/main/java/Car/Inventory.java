package Car;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    public List<Car> cars;

    public Inventory() {
        cars = new LinkedList();
    }

    public void addCar(Transmission transmission,
                       String id,
                       State state,
                       Name name,
                       Color color,
                       int price,
                       int year) {
        Car car = new Car(transmission, id, state, name, color, price, year);
        cars.add(car);
    }

    public Car getCar(String id) throws IOException {
        for (Iterator i = cars.iterator(); i.hasNext(); ) {
            Car car = (Car)i.next();
            if (car.getId().equals(id)) { return car; }
        }
        return null;
    }

    public List search(Car wantedCar){
        List<Car> matchingCars = new ArrayList<Car>();
        for (Iterator i = cars.iterator(); i.hasNext(); ) {
            Car car = (Car)i.next();

            String name = wantedCar.getSpec().getName().toString().toLowerCase();
            if ((!name.equals(car.getSpec().getName().toString().toLowerCase()) && (!name.equals(""))) && (name != null)) { continue;}

            if (wantedCar.getYear() != car.getYear()) {continue;}

            if (wantedCar.getSpec().getTransmission() != car.getSpec().getTransmission()) {continue;}

            if (wantedCar.getSpec().getState() != car.getSpec().getState()) {continue;}

            matchingCars.add(car);
        }
        return matchingCars;

    }


}
