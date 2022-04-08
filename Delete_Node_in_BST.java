

import java.util.Scanner;

public class Delete_Node_in_BST {

    public static void main(String[] args) {
         Node2 root=null;
        Scanner sc= new Scanner(System.in);
        Delete obj= new Delete();

        int a=-1;
        while(a==-1){
               root= obj.create(root);
            System.out.println("for continue press -1");
                 a=sc.nextInt();
        }
        Node2 temp=root;
        obj.print(temp);
        System.out.println("enter the element which you want to delete");
        int ele= sc.nextInt();
        obj.delete(temp,ele);
        System.out.println("After Deletion");
        obj.print(temp);
    }
    public Node2 delete(Node2 root,int data){
        if(root==null){
            System.out.println("No such element in BST");
            return null;
        }
       else if(data> root.data){root.right=delete(root.right,data);}
       else if(data< root.data){root.left=delete(root.left,data);}
else{
       if(root.left!=null && root.right!=null){
            int temp=max(root.left);
            root.data= temp;
            root.left=delete(root.left, root.data);
        }
            if(root.right==null){
                return root.left;
            }
            if(root.left==null){
                return root.right;
            }
          else if(root.left==null && root.right==null){
              return null;
            }
        }
        return root;
    }
    public static int max(Node2 root){
        if(root.right==null){
            return root.data;
        }
       return max(root.right);

    }
    public static void print(Node2 root){
        if(root==null){return;}
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    Scanner sc= new Scanner(System.in);
    public Node2 create(Node2 root){
        Node2 par;
        System.out.println("enter the data");
        int data=sc.nextInt();
        Node2 newnode= new Node2(data);
        if(root==null){
            root=newnode;
            return root;
        }
        else{
            par=root;
            while(par!=null){
            if(par.data> newnode.data){if(par.left==null){par.left=newnode;break;}par=par.left;}
           else if(par.data< newnode.data){if(par.right==null){par.right= newnode;break;}par=par.right;}
            }
        }
     return root;
    }
}
class Node2{
    int data;
    Node2 left;
    Node2 right;
    public Node2(int data){
        this.data=data;
    }
}
