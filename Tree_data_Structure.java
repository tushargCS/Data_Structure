import java.util.Scanner;

public class Tree_data_Structure {
    public static void main(String[] args) {

        Tree obj= new Tree();
        Root root=obj.Create();
        obj.display(root);

    }

}
class Root{
    int info;
    Root left;
    Root right;
    public Root(int info){
        this.info=info;
        this.left=null;
        this.right=null;
    }
}
class Tree{

    public Root Create(){

        Scanner sc = new Scanner(System.in);
        int data= sc.nextInt();

        if(data==-1) return null;

        Root root=null;
         root= new Root(data);
        System.out.println("enter the data of left for Root "+root.info);
         root.left=Create();
        System.out.println("enter the data of right for Root "+root.info);
        root.right=Create();

        return root;

    }
    public void display(Root root){
        Display obj= new Display();
        System.out.println("enter 1 for InOrder traverse\nenter 2 for PostOrder traverse\nenter three for preorder");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        switch (i){
            case 1:{
                obj.InOrder(root);
                break;
            }
            case 2:{
                 obj.PostOrder(root);
                 break;
            }
            case 3:{
                  obj.PreOrder(root);
                  break;
            }
        }
    }
}
 class Display{
    public void InOrder(Root root){
        if(root==null){return;}

        InOrder(root.left);
        System.out.println(root.info);
        InOrder(root.right);
    }
    public void PostOrder(Root root){
        if(root==null){return;}
          PostOrder(root.left);
          PostOrder(root.right);
        System.out.println(root.info);
    }
    public void PreOrder(Root root){
        if(root==null){return;}
        System.out.println(root.info);
        PreOrder(root.left);
        PreOrder(root.right);
    }
 }
