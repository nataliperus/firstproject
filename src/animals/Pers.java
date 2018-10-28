package animals;

public class Pers extends Cat{

    public Pers(String name){
        this.name = name;
    }
    @Override
    public String to_String(){
        return super.to_String()+" Pers "+ this.name;
    }
}
