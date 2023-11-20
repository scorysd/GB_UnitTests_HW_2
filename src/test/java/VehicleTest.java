import org.junit.jupiter.api.*;

class VehicleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDrive() {
    }

    @Test
    void park() {
    }

    @Test
    @DisplayName("Car является Vehicle")
    public void itsACar(){
        Vehicle car = new Car("Mazda", "7", 2019);
        Assertions.assertInstanceOf(Vehicle.class, car);
    }
    @Test
    @DisplayName("4 колеса у машины")
    public void fourWheels(){
        Car car = new Car("Mazda", "7", 2019);
        Assertions.assertEquals(4 ,car.getNumWheels());
    }
    @Test
    @DisplayName("2 колеса у мото")
    public void twoWheels(){
        Motorcycle motorcycle = new Motorcycle("Kawa", "ninja", 2019);
        Assertions.assertEquals(2 ,motorcycle.getNumWheels());
    }
    @Test
    @DisplayName("скорость авто")
    public void carSpeed(){
        Car car = new Car("Mazda", "7", 2019);
        car.testDrive();
        Assertions.assertEquals(60, car.getSpeed());
    }
    @Test
    @DisplayName("скорость мото")
    public void motoSpeed(){
        Motorcycle motorcycle = new Motorcycle("Kawa", "ninja", 2019);
        motorcycle.testDrive();
        Assertions.assertEquals(75 ,motorcycle.getSpeed());
    }
    @Test
    @DisplayName("парковка авто")
    public void carPark(){
        Car car = new Car("Mazda", "7", 2019);
        car.testDrive();
        car.park();
        Assertions.assertEquals(0, car.getSpeed());
    }
    @Test
    @DisplayName("скорость мото")
    public void motoPark(){
        Motorcycle motorcycle = new Motorcycle("Kawa", "ninja", 2019);
        motorcycle.testDrive();
        motorcycle.park();
        Assertions.assertEquals(0 ,motorcycle.getSpeed());
    }


}