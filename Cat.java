public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " cat meows");
    }
}
