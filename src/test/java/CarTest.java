import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CarTest {
    Car car = new Car(Transmission.MECHANICAL, "84651325486", State.BAD, Name.NISSAN, Color.BLACK,
            45661, 1999);
    @Test
    public void getPrice() throws Exception {
        Assert.assertEquals(45661, car.getPrice());
    }

    @Test
    public void getYear() throws Exception {
        Assert.assertEquals(1999, car.getYear());
    }

    @Test
    public void getId() throws Exception {
        Assert.assertEquals("84651325486", car.getId());
    }

    @Test
    public void setPrice() throws Exception {
        Assert.assertEquals(23000, car.setPrice(23000));

    }
    @Test
    public void getName() throws IOException {
        Assert.assertEquals(Name.NISSAN, car.getSpec().getName());
    }

    @Test
    public void getState() throws IOException {
        Assert.assertEquals(State.BAD, car.getSpec().getState());
    }

    @Test
    public void getColor() throws IOException {
        Assert.assertEquals(Color.BLACK, car.getSpec().getColor());
    }

    @Test
    public void getTransmission() throws IOException {
        Assert.assertEquals(Transmission.MECHANICAL, car.getSpec().getTransmission());
    }

}
