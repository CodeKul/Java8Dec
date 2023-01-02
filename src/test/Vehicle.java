package test;

abstract public class Vehicle {
    abstract public void color();
    public void runAtSpeed(){
        System.out.println("vehicle is running at speed 50 km/hr");
    }
    public void runAtSpeed(int speed){
        System.out.println("vehicle is running at speed "+speed+"km/hr");
    }


    public static void main(String[] args) {
     Vehicle obj1= new Vehicle() {
         @Override
         public void color() {
             System.out.println("Vehicle color is red");
         }
     };
    obj1.color();
    obj1.runAtSpeed();
    obj1.runAtSpeed(20);

    }

}
