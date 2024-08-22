public class JavaBasicsDemo {
    String message;  // property,attributes or fields

    public void displayMessage() { // method or function
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        JavaBasicsDemo demo = new JavaBasicsDemo(); // demo is a object
        demo.message = "Hello, Java!";  // initalisation
        demo.displayMessage();  // invoke or call method
    }
}
