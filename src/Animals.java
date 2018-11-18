public class Animals {
    public static void main(String[] args) {

        Animal [] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Horse("Konik");
        animals[5] = new Elefant("Trąbalski");

        for(Animal animal: animals){
            animal.introuduce();
        }
    }
}
class Animal{
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę " + name;
    }

    String makeSound(){
        return "???";
    }

    void introuduce(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
class Dog extends Animal{
    public Dog(String name) {
        this.name = name;

    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}
class Cat extends Animal{
    public Cat( String name) {
        this.name = name;
    }
}
class Pig extends Animal{
    public Pig(String name) {
        this.name = name;
    }
    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "hrum hrum";
    }
}
class Horse extends Animal {
    public Horse(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "koń " + name;
    }

    @Override
    String makeSound() {
        return "iiii";
    }
}

class Elefant extends Animal {
    public Elefant(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "słoń " + name;
    }

    @Override
    String makeSound() {
        return "yyyy";
    }
}
