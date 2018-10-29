package animals;
@Domesticated("Domesticated")
public class Poodle extends Dog {

    public Poodle(String name){
        this.name = name;
    }
    @Override
    public String to_String(){
        return super.to_String()+" Poodle "+ this.name;
    }
}
