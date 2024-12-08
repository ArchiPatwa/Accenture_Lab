package Day4;
class Animal{
    public void makeSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("The Cat Meow");
    }
}
public class AnimalSound {
    public static void main(String[] args){
        Animal ani = new Animal();
        ani.makeSound();

        Animal dog = new Dog();
        dog.makeSound();
        Animal cat = new Cat();
        cat.makeSound();

    }
}
