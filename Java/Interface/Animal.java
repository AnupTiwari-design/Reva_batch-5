package Java.Interface;

public interface Animal {
    void sound();
    void display();
   default void eat(){
        System.out.println("eating");
    }
}
