import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Graph <T>{
    //Atributos 
    private HashSet<NodeGraph<T>> nodes;

    public HashSet<NodeGraph<T>> getNodes() {
        return nodes;
    }
    public Graph (){
        this.nodes= new HashSet<>();
    }
    public void addNode(NodeGraph<T> node){
        nodes.add(node);
    }

    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2){
        node1.addFriend(node2.getUser());
        node2.addFriend(node1.getUser());

    }


    public HashSet<T>getFriends(NodeGraph<T> node){
        return node.getFriends();
    }

    public List<T> recommendFriends(NodeGraph<T> node){

        List<T> recommendedFriends = new ArrayList<>();
        for (T friend : node.getFriends()) {
            for (NodeGraph<T> n : nodes) {
                if (n.getUser().equals(friend) && !n.getFriends().contains(node.getUser())) {
                    recommendedFriends.add(n.getUser());
                }
            }
        }
        return recommendedFriends;
    }
    public void printGraph() {
        for (NodeGraph <T> node : nodes) {
            System.out.print("Vertex " +node.getUser() + " ->");
            for (T friends : node.getFriends        ()) {
                System.out.print(" " + friends);
            }
            System.out.println();
        }
    }
}
