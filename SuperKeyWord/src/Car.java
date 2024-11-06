public class Car extends Vehicle{
    Car(String name){
        super(name);
    }
    void display()
    {
        System.out.println("The vehicle name : "+ super.name);
        System.out.println("Maximum speed: "+ super.maxSpeed);
       // message();
        super.message();
    }
}
