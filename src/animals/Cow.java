package animals;
@Domesticated("Domesticated")
public class Cow extends Animal{
    public Cow(String name){
        this.name = name;
    }
    public String to_String(){
        return "Cow " + this.name;
    }
    @Override
    public void talk(){
        if ( this.status == Status.AWAKE)
            System.out.println("Moo");
    }
}
