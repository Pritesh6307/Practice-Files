// File: practice_new/AF2.java
package practice_new;

import accessspefiers.AF;

public class AF2 extends AF {

    public static void main(String[] args) {
        AF2 obj = new AF2();

        // Accessing public, protected, and private members through getters
        System.out.println(obj.a);  // public, accessible
        // System.out.println(obj.b); // private, inaccessible (will cause error)
        System.out.println(obj.getB()); // Access private 'b' through getter
        System.out.println(obj.c);  // protected, accessible in subclass
        // System.out.println(obj.d); // default, inaccessible (will cause error)
        System.out.println(obj.getD()); // Access default 'd' through getter
    }
}
