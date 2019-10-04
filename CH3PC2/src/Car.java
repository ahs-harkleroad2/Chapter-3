/**
 * Alex Harkleroad
 * Car Class
 * Programming III
 * 9/30/2019
 */
public class Car {
    
/**
     * Initialize fields
     */
    private int yearModel;
    private String make;
    private int speed;
       
       /**
        * Car class constructor
        */
       public Car(int y, String m, int s){
           yearModel = y;
           make = m;
           speed = s;
           }
       
       /**
        * Initialize methods
        */
       public void setyearModel(int y){
           yearModel = y;
        }
       public void setMake(String m){
           make = m;
        }
       public void setSpeed(int s){
           speed = s;
        }
       public void Accelerate(){
           speed += 5;
        }
       public void Brake(){
           speed -= 5;
       }
       public int getyearModel(){
           return yearModel;
        }
       public String getMake(){
           return make;
        }
       public int getSpeed(){
           return speed;
        }
       
}