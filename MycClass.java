public class MycClass {
    // Static variable
    public static int staticVariable = 10;

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        // Accessing static variable
        System.out.println("Static variable: " + MycClass.staticVariable);

        // Calling static method
        MycClass.staticMethod();
    }
}
