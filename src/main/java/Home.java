public class Home {
  Dog dog = new Dog();
  Cat cat = new Cat();

  public Cat adoptPet(Cat sound){
    dog.sound();
    cat.sound();

    return sound;
  }
  public Dog makeAllSounds(Dog sound){

    System.out.println("This prints: ");

    return  sound;
  }
}