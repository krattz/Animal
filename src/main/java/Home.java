import java.util.ArrayList;
public class Home {
  Dog dog = new Dog();
  Cat cat = new Cat();
ArrayList list = new ArrayList<Object>();

  public String adoptPet(Cat sound)
  {
    sound.sounds();
    return "meows";
  }
  public String adoptPet(Dog now)
  {
    now.sounds();
    return "barks";
  }

  public void makeAllSounds()
  {
    for (Object a: list
         ) {
      list.add(adoptPet(dog));
      list.add(adoptPet(cat));
    }
  }
}