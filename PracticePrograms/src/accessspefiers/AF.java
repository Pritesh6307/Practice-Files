package accessspefiers;

public class AF {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40; // default access level (package-private)

    // Setters for b and d
    public void set(int x, int y) {
        b = x;
        d = y;
    }

    // Getter for private variable b
    public int getB() {
        return b;
    }

    // Getter for default access variable d
    public int getD() {
        return d;
    }

    // Get method returning a string representation of b and d
    public String get() {
        return "b: " + b + ", d: " + d;
    }

    // Test method to print values of variables
    public void test() {
        System.out.println(a); // public
        System.out.println(b); // private
        System.out.println(c); // protected
        System.out.println(d); // default (package-private)
    }
}