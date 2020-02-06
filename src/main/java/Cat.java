public class Cat extends Animal {

        public String sounds(){
                String purr ="";
                setName("Storm");
                purr = this.getName()+" meow";
                System.out.println(purr);
                return purr;
        }
}
