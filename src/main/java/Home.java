public class Home {
  Dog dog = new Dog();
  Cat cat = new Cat();

  public Dog adoptPet(Dog sound){
    dog.sound();

    return dog;
  }
  public Cat adoptPet(Cat sound){
    cat.sound();
    return cat;
  }


  public void makeAllSounds() {
    System.out.println("This prints: ");
  }
}