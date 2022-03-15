import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Stack_ll {
    public static void main(String[] args) {
        Stack_linkedlist obj=new Stack_linkedlist();
        obj.push();
        obj.display();
        obj.pop();
        obj.display();
    }
}
class Stack_linkedlist{
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node top;

    void push(){
        int d=1;
        Scanner sc = new Scanner(System.in);
        while(d==1){
        System.out.println("enter the data");
        int data= sc.nextInt();
        Node new_node= new Node(data);
        if(top==null){
            top= new_node;
        }
        else {
            new_node.next=top;
            top=new_node;
        }
            System.out.println("to continue press 1");
        d=sc.nextInt();
        }
    }
    void pop(){
        Scanner sc =new Scanner(System.in);
        int d=1;
        while(d==1) {
            if (top == null) {
                System.out.println("underflow");
            } else {
                top = top.next;
            }
            System.out.println("to continue press 1");
            d=sc.nextInt();
        }
    }


    void display(){
        if(top==null){
            System.out.println("does not exist");
        }
        else{
            Node temp=top;
            while(temp.next!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }

}
