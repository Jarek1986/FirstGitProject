package konstruktory;


public class TestCar {
    
    public static void main(String[] args) {
        Vehicle b = new Car(); // Vehicle reference but a car object
        b.move();              // Calls the method in Car class
    }
}
