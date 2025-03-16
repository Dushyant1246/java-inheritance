public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " dog barks");
    }
}
