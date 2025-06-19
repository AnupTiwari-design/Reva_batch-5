package Java.Abstraction;

public abstract class Car {
    public abstract void start();
    public abstract void stop();

    void display(){
        System.out.println("Information");
    }
}
class Driver extends Car{

   public void start(){
        System.out.println("start");
    }
  public  void stop(){
        System.out.println("stop");
    }
    public static void main(String[] args) {
        
    Car ob=new Driver();
        ob.display();
        ob.start();
        ob.stop();
    }

}
