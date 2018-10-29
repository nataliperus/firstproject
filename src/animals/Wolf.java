package animals;

public class Wolf extends Dog{
    public String to_String(){
        return "Wolf";
    }
    @Override
    public void talk(){
        if ( this.status == Status.AWAKE)
            System.out.println("Ouuu");
    }
}
