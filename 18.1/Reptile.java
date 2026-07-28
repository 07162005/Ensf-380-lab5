public class Reptile extends Animal {
    public Reptile(int age) {
        super(age);
    }
    
    public void displayAge() {
        System.out.println("Age in years: " + getYears());
    }
}