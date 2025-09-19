package Oops;

public class Car {
    private int speed;
    private  String color;

    // Constructor
    public Car(String color){
        this.color = color;
    }

    public void setSpeed(int speed){
        if(speed < 0){
            System.out.println(speed + " Not Possible");
        }else{
            this.speed = speed;
            System.out.println("Driving at " + speed + " is Possible");
        }
    }

    void drive() {
        System.out.println(color + " car is driving at " + speed + " km/h.");
    }
}
