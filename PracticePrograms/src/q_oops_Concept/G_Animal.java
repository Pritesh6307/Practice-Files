package q_oops_Concept;

public abstract class G_Animal {
    // Abstract method
    abstract void makesound();
    
    // Concrete method
    void sleep() {
        System.out.println("The Animal Is Sleeping");
    }
}

// Dog class inherits from Animal
class Dog extends G_Animal {
    // Implementing the abstract method from Animal
    void makesound() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class inherits from Animal
class Cat extends G_Animal {
    // Implementing the abstract method from Animal
    void makesound() {
        System.out.println("Meow! Meow!");
    }
}