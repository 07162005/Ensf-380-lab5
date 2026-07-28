public class Animal {
    protected int age;  
    
    public Animal(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getYears() {
        return this.age;
    }
}