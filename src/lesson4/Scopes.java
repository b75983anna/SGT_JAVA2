package lesson4;

public class Scopes {

    static final int SOME_CONSTANT = 314;
    static int globalResult = 0;

    public static void main(String[] args) {

        int someNumber = SOME_CONSTANT;

        // Only thing - to pass the value as an argument
        // to a method
        int someResult = multiplyByFive(someNumber);
        System.out.println(someResult);

        // BAD EXAMPLE
        // SOMETHING CAN INTERFERE WITH GLOBAL VARIABLES
        multiplyByTwo(5);
        multiplyAndStoreInGlobalVariable(15);

        System.out.println("Global Result:" + globalResult);
    }

    static int scopeVisible(int someNumber) {
        boolean visibleInsideMethod = true;

        return someNumber * 2;
    }

    // DO LIKE THIS
    static int multiplyByFive( int number) {
        int five = SOME_CONSTANT;

        return number * five;
    }

    // AVOID USE GLOBAL VARIABLES
    static void multiplyAndStoreInGlobalVariable( int number) {
        int five = SOME_CONSTANT;

        globalResult = number * five;
    }

    static void multiplyByTwo( int number) {

        globalResult = number * 2;
    }
}
