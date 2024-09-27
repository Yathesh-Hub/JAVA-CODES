
class Animal {
    
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks");
    }
}
public class Animaltest {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        myAnimal.sound();
        myDog.sound();
    }
}
