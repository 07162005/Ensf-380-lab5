public class Lizard extends Reptile {
    private double tongueLength;
    
    public Lizard(int age, double tailLength, double tongueLength) {
        super(age, tailLength);
        this.tongueLength = tongueLength;
    }
    
    public double getTongueLength() {
        return tongueLength;
    }
}