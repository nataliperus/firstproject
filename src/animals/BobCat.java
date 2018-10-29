package animals;

public class BobCat extends Cat {
    public String to_String(){
        return "BobCat";
    }
    @Override
    public void talk(){
        if ( this.status == Status.AWAKE)
            System.out.println("Miau");
    }
}
