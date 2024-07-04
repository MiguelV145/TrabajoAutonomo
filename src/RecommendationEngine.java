import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine  {
 
    public List<User> recommendationFriends(NodeGraph <User> node , Graph <User> graph ){
        List <User> recomendacions= new ArrayList<>();
        for (NodeGraph <User> potencialFriendsNode:  graph.getNodes()){
            User pontencialFrineds= potencialFriendsNode.getUser();
            if (!node.getFriends().contains(pontencialFrineds)&& ! node.getUser().equals(pontencialFrineds)){
                double similary = calculateSimilarity(node.getUser(),pontencialFrineds);

                if (similary >0.5){//Umbral para recomendaciones
                    recomendacions.add(pontencialFrineds);
                }
            }
        }
        return recomendacions;
        
    }

    public double calculateSimilarity(User user1, User user2){
        Set<String> intersts1=new HashSet<>(user1.getIntersts());
        Set<String> intersts2=new HashSet<>(user2.getIntersts());
        Set<String> interseccion=new HashSet<>(intersts1);
        interseccion.retainAll(intersts2);
        Set<String> union =new   HashSet<>(intersts1);
        union.addAll(intersts2);

        double resp= (double) interseccion.size()/union.size();
        System.out.println("Valor -> "+ resp);

        return resp;
    }
}