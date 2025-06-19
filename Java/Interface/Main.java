package Java.Interface;

public class Main {
    public static void main(String[] args) {
        Animal ob=new Dog();
        Animal ob1=new Cat();
        ob.sound();
        ob.display();
        ob1.display();
        ob1.sound();
    }
   
}
