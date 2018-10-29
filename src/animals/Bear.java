package animals;

public class Bear extends Animal{
    public String to_String(){
        return "Bear " + this.name;
    }
    @Override
    public void talk(){
        if ( this.status == Status.AWAKE)
            System.out.println("Rrrr");
    }
}
