public class Reptile extends Animal {
    private double tailLength;
    
    public Reptile(int age, double tailLength) {
        super(age);
        this.tailLength = tailLength;
    }
    
    public double getTailLength() {
        return tailLength;
    }
    
    public void run() {
        System.out.println("Reptile is running...");
    }
}