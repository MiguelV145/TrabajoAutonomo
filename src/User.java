import java.util.List;

public class User {
    
    //Creacion de atributos para la clase
    private String name;
    private int age;
    private List<String> intersts;
    
    //Creacion del constructor
    public User(String name, int age, List<String> intersts) {
        this.name = name;
        this.age = age;
        this.intersts = intersts;
    }
    //Getter y setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getIntersts() {
        return intersts;
    }

    public void setIntersts(List<String> intersts) {
        this.intersts = intersts;
    }

    @Override
    public String toString() {
        return " " + name ;
    }
    
}
