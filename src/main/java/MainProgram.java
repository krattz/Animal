public class MainProgram {

    public static void main(String[] args) {

        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
//        dog.sound();
//        dog.eats();
//        cat.sound();
//        cat.eats();
        home.makeAllSounds(dog);
        home.adoptPet(cat);
    }
}
