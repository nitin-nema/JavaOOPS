class AccessModifiers {
    public String publicField = "Public";
    private String privateField = "Private";
    protected String protectedField = "Protected";
    String defaultField = "Default";

    public void displayFields() {
        System.out.println("Public Field: " + publicField);
        System.out.println("Private Field: " + privateField);
        System.out.println("Protected Field: " + protectedField);
        System.out.println("Default Field: " + defaultField);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        am.displayFields();

        // Direct access to fields outside the class is limited:
        System.out.println("Public Field Access: " + am.publicField);
//         System.out.println("Private Field Access: " + am.privateField); // Error
        System.out.println("Protected Field Access: " + am.protectedField);
        System.out.println("Default Field Access: " + am.defaultField);
    }
}
