import Car.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindCarTest {
    @Test
    public void findCar() throws Exception {
        Car car = new Car(Transmission.AUTOMATIC, "45678946552", State.GOOD, Name.BMW,
                Color.GREEN, 45000, 1998);
        Inventory inventory = new Inventory();
        FindCar find = new FindCar();

        inventory.addCar(Transmission.MECHANICAL, "985612356", State.SATISFACTORY, Name.CHEVROLET,
                Color.WHITE, 98555, 2011);
        assertTrue(find.findCar(car, inventory).isEmpty());

        inventory.addCar(Transmission.AUTOMATIC, "45678946552", State.GOOD, Name.BMW,
                Color.GREEN, 45000, 1998);
        assertTrue(find.findCar(car, inventory).size() == 1);

    }
}