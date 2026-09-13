public class DatatypesAndVariables {
    
    public static void main(String[] args) {
        // For loop practice
        System.out.println("=== For Loop ===");
        forLoopExample();
        
        // While loop practice
        System.out.println("\n=== While Loop ===");
        whileLoopExample();
        
        // Do-While loop practice
        System.out.println("\n=== Do-While Loop ===");
        doWhileLoopExample();
        
        // Enhanced For loop (for-each) practice
        System.out.println("\n=== Enhanced For Loop ===");
        enhancedForLoopExample();
        
        // Nested loops practice
        System.out.println("\n=== Nested Loops ===");
        nestedLoopsExample();
    }
    
    // Traditional for loop
    static void forLoopExample() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
            System.out.println("Iteration " + i + ": sum = " + sum);
        }
        System.out.println("Final sum: " + sum);
    }
    
    // While loop
    static void whileLoopExample() {
        int count = 0;
        while (count < 5) {
            System.out.println("Count: " + count);
            count++;
        }
        System.out.println("Loop ended. Final count: " + count);
    }
    
    // Do-While loop (executes at least once)
    static void doWhileLoopExample() {
        int number = 0;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number < 5);
        System.out.println("Loop ended. Final number: " + number);
    }
    
    // Enhanced for loop with array
    static void enhancedForLoopExample() {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
    
    // Nested loops
    static void nestedLoopsExample() {
        System.out.println("Multiplication Table:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
        }
    }
}
