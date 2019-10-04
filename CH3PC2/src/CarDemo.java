/**
 * Alex Harkleroad
 * Car Class Demonstration
 * Programming III
 * 9/30/2019
 */
public class CarDemo {

    public static void main(String[] args) {
        //Create car object
        Car car = new Car(2009, "Toyota", 0);
        
        //Demonstrate
        car.Accelerate();
        System.out.println("The car's speed is " + car.getSpeed());
        car.Accelerate();
        System.out.println("The car's speed is " + car.getSpeed());
        car.Accelerate();
        System.out.println("The car's speed is " + car.getSpeed());
        car.Accelerate();
        System.out.println("The car's speed is " + car.getSpeed());
        car.Accelerate();
        System.out.println("The car's speed is " + car.getSpeed());
        
        car.Brake();
        System.out.println("THe car's speed is " + car.getSpeed());
        car.Brake();
        System.out.println("THe car's speed is " + car.getSpeed());
        car.Brake();
        System.out.println("THe car's speed is " + car.getSpeed());
        car.Brake();
        System.out.println("THe car's speed is " + car.getSpeed());
        car.Brake();
        System.out.println("THe car's speed is " + car.getSpeed());
    }

}
