class BaseClass {
    void display() {
        System.out.println("Display from BaseClass");
    }
}

class DerivedClass extends BaseClass {  // inheritance
    @Override
    void display() {
        System.out.println("Display from DerivedClass");
    }

    // Method Overloading
    void display(String message) {
        System.out.println("Display: " + message);
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        BaseClass obj1 = new BaseClass();
        DerivedClass obj2 = new DerivedClass();
        BaseClass obj3 = new DerivedClass();

        obj1.display();
        obj2.display();
        obj2.display("Overloaded Method");

        obj3.display();  // Demonstrates overridden method call
    }
}
