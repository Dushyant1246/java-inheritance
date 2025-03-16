public class Animal {
    protected String name;
    private int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
/*
new Animal("a", 10).makeSound();
new Dog("b", 11).makeSound();
new Cat("c", 12).makeSound();
new Bird("d", 13).makeSound();

Animal makes a sound
b dog barks
c cat meows
d bird chirps
 */