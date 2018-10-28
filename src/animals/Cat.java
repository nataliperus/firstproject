package animals;

public class Cat extends Animal {
    String name;
    public String to_String(){
        return "Cat";
    }
    @Override
    public void talk(){
        if ( this.status == Status.AWAKE)
            System.out.println("Miau");
    }
}
