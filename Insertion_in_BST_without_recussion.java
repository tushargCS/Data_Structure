import java.util.Scanner;

public class Insertion_in_BST_without_recussion{
    static Node root=null;
    public static void main(String[] args) {
          int a=-1;
        Scanner sc= new Scanner(System.in);
          while(a==-1){
              System.out.println("enter the data");
              int data=sc.nextInt();
              Node newNOde= new Node(data);
              create(newNOde);
              System.out.println("enter the -1 to continue");
              a=sc.nextInt();
          }
          preorder(root);
    }
    public static void preorder(Node root){
        if(root==null){return;}
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);

        return;
    }
    public static void create(Node newNode){
        if(root== null){root= newNode;return;}
        else{
            Node par=root;
            while(par!=null){
            if(newNode.data>par.data){
                if(par.right==null){par.right=newNode;return;}
                par=par.right;
            }
            else if(newNode.data< par.data){
                if(par.left==null){par.left=newNode;return;}
                par=par.left;
            }
        }
        }
    }

}
class Node{
    Node left;
    Node right;
    int data;
    public Node(int data){this.data=data;}
}
