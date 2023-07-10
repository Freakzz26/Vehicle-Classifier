abstract class Vehicle
{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle
{
    void start()
    {
        System.out.println("Car Started");
    }
    void stop()
    {
        System.out.println("Car Stopped");
    }
}
class Motorcycle extends Vehicle
{
    void start()
    {
        System.out.println("Motorcycle Started");
    }
    void stop()
    {
        System.out.println("Motorcycle Stopped");
    }
}
public class vehicleclassifier {
    public static void main(String[] args) {
        Vehicle car=new Car();
        car.start();
        car.stop();
        Vehicle motorcycle =new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }
}
