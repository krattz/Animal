public class MainProgram {

    public static void main(String[] args) {
        Home home = new Home();
        Dog dog = new Dog();
        Cat cat = new Cat();
        home.makeAllSounds();
        dog.sounds();
        cat.sounds();
        dog.eats();
        cat.eats();
        home.adoptPet(cat);
        home.list.add(home.adoptPet(cat));
        home.list.add(home.adoptPet(dog));
        System.out.println(home.list.size());

    }
}