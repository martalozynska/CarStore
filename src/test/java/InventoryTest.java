import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    Inventory inventory = new Inventory();
    @Test
    public void addCar() throws Exception {
        Car car = new Car(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
                45661, 1999);
        inventory.addCar(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
                45661, 1999);
        assertEquals(car.getId(), inventory.cars.get(inventory.cars.size() - 1).getId());

    }

    @Test
    public void getCar() throws Exception {
        inventory.addCar(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
                45661, 1999);
        assertNotNull(inventory.getCar("84651325486"));

    }

    @Test
    public void search() throws Exception {
        Car car = new Car(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
                45661, 1999);
        inventory.addCar(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
                45661, 1999);
        assertTrue(!inventory.search(car).isEmpty());

    }

}