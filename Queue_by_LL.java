import java.util.Scanner;

public class Queue_LL {
    public static void main(String[] args) {
        Queue_linkedlist obj=new Queue_linkedlist();
        obj.enqueue();
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
class Queue_linkedlist{
    static class Node{
        int data;
        Node next;
        Node rear;
        Node front;
        Node(int data){
            this.data=data;
        }
    }
    Node front,rear;
    public void enqueue(){
        int d=1;
        Scanner sc= new Scanner(System.in);
        while(d==1) {
            System.out.println("enter the data");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (front == null) {
                front = new_node;
                rear = new_node;
            } else {
                rear.next = new_node;
                rear = new_node;
            }
            System.out.println("enter 1 to continue");
            d=sc.nextInt();
        }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("underflow");
        }
        else{
            front=front.next;
        }
    }
    public void display(){
        Node temp =front;
        System.out.println("data is :");
        while(temp.next!=null){

            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }

}
