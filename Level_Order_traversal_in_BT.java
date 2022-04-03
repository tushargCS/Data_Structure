import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class Level_Order_traversal_in_BT {
    public static void main(String[] args) {
    Node1 Root=create();
       level_Order(Root);
    }
    public static void level_Order(Node1 Root ){
          Node1 temp;
        Queue<Node1> obj= new LinkedList<>();
        obj.offer(Root);
        while(!obj.isEmpty()){
            temp=obj.peek();
            obj.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                obj.offer(temp.left);
            }
            if(temp.right!=null){
                obj.offer(temp.right);
            }
        }
        

    }
    public static Node1 create(){
        Scanner sc= new Scanner(System.in);
        int data=sc.nextInt();
        if(data==-1){return null;}
        Node1 NewNode= new Node1(data);

        NewNode.left=create();
        NewNode.right=create();

        return NewNode;

    }
}
class Node1{
    Node1 left;
    Node1 right;
    int data;
    public Node1(int data){
        this.data=data;
    }
}
