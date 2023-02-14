import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Object myObj = new Object();

        MyClass myObj2 = new MyClass();
        myObj2.add(4);
        //System.out.println(myObj2.get(0));

        System.out.println(myObj);
        Animal a = new Animal();
        System.out.println(a);
        System.out.println("toString of MyClass" + myObj2);

        /*A - INHERITANCE
         * 1 - Class can 'extend' other Classes
         * 2 - Extending an Object will cause the class to inherit all behavior of the parent class
         * 3 - All classes that don't extend a class will inherently extend the Object class
         * 4 - the Object class contains methods like toString, equals, hashcode
         * 
         * B - POLYMORPHISM
         * 5 - When extending an Object, we can potentially overwrite the behavior of the parent class.
         *      eg, it's pretty common to overwrite the behavior of the Object class's toString and equals methods.
         * 6 - Polymorphism can be divided into runtime/ compile time polymorphism.
         * 7 - Compile time polymorphism - method overloading, having methods with the same name, but different parameters.
         * 8 - Runtime polymorphism - method overrring, having a child class overwrite the behavior of the parent(eg overwrite toString)         * 
         */

         ArrayList myAL = new MyClass();
         Object myO;
         boolean bool = true;
         if(bool){
            myO = new ArrayList<>();
         }else{
            myO = new Scanner(System.in);
         }
    }
}