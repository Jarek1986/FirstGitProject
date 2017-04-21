package konstruktory;

public class Car extends Vehicle {
    public void move(){
        super.move();   // invokes the super class method
        System.out.println("Car is good. Car class");
    }
}
