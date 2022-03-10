import java.util.Scanner;

public class Doubly_ll {
    public static void main(String[] args) {
           Doubly obj= new Doubly();
           obj.insert();
           obj.display();
           obj.delete();
           obj.display();
    }
}
 class Doubly{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
     }
     Node head,tail;
    public void insert(){
        int d=1;
        Scanner sc = new Scanner(System.in);
        while (d==1){
        System.out.println("enter 1 for B 2 for E and 3 for S");
        int t=sc.nextInt();
        switch (t){
            case 1:{
        System.out.println("ENTER THE DATA");
        int data= sc.nextInt();
        Node new_node = new Node(data);
        if(head==null){
            head=new_node;
            tail=new_node;
        }
        else {
            head.prev=new_node;
            new_node.next=head;
            head=new_node;
        }
        break;
            }
            case 2:{
                System.out.println("ENTER THE DATA");
                int data= sc.nextInt();
                Node new_node = new Node(data);
                Node temp=head;
                Node ptr=temp.next;
                while(ptr.next!=null){
                    temp=ptr;
                    ptr=ptr.next;
                }
                tail.next=new_node;
                new_node.prev=tail;
                tail=new_node;
            break;
            }

            case 3:{
                System.out.println("ENTER THE DATA");
                int data= sc.nextInt();
                Node new_node = new Node(data);
                Node temp=head;
                Node ptr=temp.next;
                System.out.println("enter the index");
                int i=sc.nextInt();
                for(int j=0;j<(i-2);j++){
                    temp=ptr;
                    ptr=ptr.next;
                }
                new_node.prev=temp;
                new_node.next=temp.next;
                temp.next=new_node;
                ptr.prev=new_node;
                break;
            }
    }
            System.out.println("enter 1 to continue");
        d=sc.nextInt();
    }
    }
     public void display() {
         Node temp = head;
         if (head == null) {
             System.out.println("no ll exist");
         } else {
             System.out.println("your data is this: ");
             System.out.println(temp.data);
             while (temp.next != null) {
                 temp = temp.next;
                 System.out.println(temp.data);

             }
         }
     }
     public void delete(){
        Scanner sc = new Scanner(System.in);
         int t;
         System.out.println("enter 1->B,2->E,3->S");
         t=sc.nextInt();
         switch (t){
             case 1:{
                Node temp=head;
                temp.next.prev=null;
                head=temp.next;
                 break;
             }
             case 2:{
               Node temp=head;
               Node ptr=temp.next;
               while(temp.next!=null){
                   temp=ptr;
                   ptr=ptr.next;
               }
               temp.next=null;
               tail=temp;
               break;
             }
             case 3:{
                 System.out.println("enter the index no");
                 int I= sc.nextInt();
                 Node temp=head;
                 Node ptr=temp.next;
                 for (int i=0;i<(I-2);i++){
                     temp=ptr;
                     ptr=ptr.next;
                 }
                 ptr.next.prev=temp;
                 temp.next=ptr.next;
                 break;
             }
         }
     }
}
