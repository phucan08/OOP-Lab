public class TestAnimal {
    public static void main(String[] args) {
        
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal); 

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal); 

        Dog dog = new Dog("Buddy");
        System.out.println(dog); 
        dog.greets(); 
        Dog anotherDog = new Dog("Rex");
        dog.greets(anotherDog);

        Cat cat = new Cat("Kitty");
        System.out.println(cat); 
        cat.greets(); 
    }
}