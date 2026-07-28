public class MyExample {
    public static void main(String[] args) {
        // Create a Lizard object
        Lizard lizard = new Lizard(3, 10.5, 4.2);
        
        // Demonstrate retrieving tailLength and tongueLength
        System.out.println("Tail Length: " + lizard.getTailLength());
        System.out.println("Tongue Length: " + lizard.getTongueLength());
        
        // Include a call to run()
        lizard.run();
    }
}