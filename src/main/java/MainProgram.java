public class MainProgram {

    public static void main(String[] args) {

        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        home.makeAllSounds();
        home.adoptPet(dog);
        home.adoptPet(cat);
    }
}
