public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eats(){

        System.out.println(this.name + " eats");
    }
}
