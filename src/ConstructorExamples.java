public class ConstructorExamples {
    String message;

    // Default Constructor
    public ConstructorExamples() {
        message = "Default Constructor";
    }

    // Parameterized Constructor
    public ConstructorExamples(String msg) {
        message = msg;
    }

    // Copy Constructor
    //create a new object that is a copy of an existing objects
    public ConstructorExamples(ConstructorExamples obj) {
        message = obj.message;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        ConstructorExamples defaultObj = new ConstructorExamples();
        ConstructorExamples parameterizedObj = new ConstructorExamples("Parameterized Constructor");
        ConstructorExamples copyObj = new ConstructorExamples(parameterizedObj);

        defaultObj.displayMessage();
        parameterizedObj.displayMessage();
        copyObj.displayMessage();
    }
}
