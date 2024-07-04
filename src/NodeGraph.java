import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NodeGraph <T> {


    //Atributos
    private T user;
    private HashSet<T> friends;
    
    //  Constructor
    public NodeGraph(T user) {
         this.user = user;
        this.friends = new HashSet<>();
    }
    //Metodos
    public void addFriend(T user){
          this.friends.add(user);

    }

    public HashSet<T> getFriends(){
        return this.friends;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

}
