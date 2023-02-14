import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args){
        /** left hand side can be different from right hand side
            *Car what is defining what my Truck can do(all of the methods definitions are provided by car)
            *but the actual implementation is provided by Truck
            */
        Car myTruck = new Truck();
        /*
         * myTruck is a Truck, which inherits all of the behavior of Car
         * including the move() method
         * 
         * INHERITANCE
         * refer to Application in OOP
         * 
         * POLYMORPHISM
         * refer to Application in OOP
         * compile-time (method overloading), run-time (overriding)
         * 
         * ENCAPSULATION
         * Access modifiers - public(accessible everywhere), protected(accessible w/in package & subclass), 
         *                    default(accessible w/in package), private(accessible only w/in class)
         * has to do with the ability for an object to 'hide' its data
         * 
         * (Ted don't agreed with this and: has to do more w/the logical concept of specific object 
         * having ownership over its own piece of data. Object has its own fields, 
         * and every individual obj maintains its own state. We encapsulate a value into an object. 
         * Contains everything in a single unit)
         * 
         * ABSTRACTION
         * avoiding complicated implementation deails, referring to human-redable description of code instead - simplification
         * multiple ways to achive this - the best way is interfaces
         */
        myTruck.move();

        List<Animal> animals = new ArrayList();
        List<Animal> animals2 = new LinkedList();
        Animal kitty = new Cat();

        /**
         * A class can only immediatly  extend one other class
         * (multiple inheritance - we want to avoid conflicts when inheriting fields/ methods)
         * if we want to have an extremely useful class, we may have a class that implements multiple interfaces
         * 'what's the difference btw extends & inherits'
         * 
         * 
         * INHERITANCE
         * POLYMORPHISM
         * ENCAPSULATION
         * ABSTRACTION
         * 
         */
    }
}
