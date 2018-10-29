package animals;

public class Dog extends Animal {

    public String to_String(){
        return "Dog";
    }
    @Override
    public void talk(){
        if (this.status == Status.AWAKE)
            System.out.println("Gau");
    }
}
