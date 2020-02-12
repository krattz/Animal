public class Dog extends Animal {
     public String sounds()
     {
       String bark = "";
       setName("Rax");
       bark = this.getName() + " barks";
       System.out.println(bark);
       return bark;
     }
}
