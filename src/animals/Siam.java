package animals;
@Domesticated
public class Siam extends Cat{
    public Siam(String name){
        this.name = name;
    }
    @Override
    public String to_String(){
        return super.to_String()+" Siam "+ this.name;
    }
}
