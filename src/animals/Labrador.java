package animals;

public class Labrador extends Dog{

    public Labrador(String name){
        this.name = name;
    }
    @Override
    public String to_String(){
        return super.to_String()+" Labrador "+ this.name;
    }
}
