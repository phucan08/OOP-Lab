public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Bubby");
        BigDog bigDog = new BigDog("Max");
    
        System.out.println("Cat greets: ");
        cat.greets();

        System.out.println("Dog greets: ");
        dog.greets();

        System.out.println("Dog greest another DDog: ");
        Dog anotherDog = new Dog("Charlie");
        dog.greets(anotherDog);

        System.out.println("BigDog greets: ");
        bigDog.greets();

        System.out.println("BigDog greets another Dog: ");
        bigDog.greets(dog);

        System.out.println("BigDog greest another BigDog: ");
        BigDog anotherBigDog = new BigDog("Bruno");
        bigDog.greets(anotherBigDog);
    }    
} 