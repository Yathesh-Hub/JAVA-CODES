class Animals {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Animal {
    public static void main(String[] args) {
        Animals myAnimal = new AnimalsP();
        myAnimal.makeSound(); 
        Dog myDog = new Dog();
        myDog.makeSound(); 
    }
}
