class Car {

    String brand;
    int speed;

    
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    void accelerate() {
        speed += 10;
        System.out.println(brand + " is now going at " + speed + " km/h");
    }
}
public class classandobject {
    public static void main(String[] args) {
      
        Car myCar = new Car("Toyota", 50);
        
       
        System.out.println("Brand: " + myCar.brand); // Toyota
        
       
        myCar.accelerate(); 
    }
}
