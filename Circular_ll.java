import java.util.Scanner;

public class Circular_ll {
    public static void main(String[] args) {
            Circular obj= new Circular();
            obj.insert();
            obj.display();
            obj.delete();
            obj.display();
    }
}
class Circular{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head,tail;

    public void  insert(){
        int c=1;
        Scanner sc = new Scanner(System.in);
        while(c==1){
        System.out.println("enter the no where you want to insert the data,1,2,3");
        int i=sc.nextInt();
        switch (i){
            case 1:{
                System.out.println("enter data");
                int data=sc.nextInt();
                Node new_node= new Node(data);
                if(head==null){
                head=new_node;
                tail=new_node;
                new_node.next=head;
                }
                else {
                    new_node.next=head;
                    tail.next=new_node;
                    head=new_node;
                }
            break;
            }
            case 2:{
                System.out.println("enter the data");
                int data=sc.nextInt();
                Node new_node= new Node(data);
                Node temp=head;
                while(temp.next!=head){
                    temp=temp.next;
                }
                temp.next=new_node;
                tail=new_node;
                new_node.next=head;
                break;
            }
            case 3:{
                System.out.println("enter the specific index");
                int j= sc.nextInt();
                System.out.println("enter the data");
                int data=sc.nextInt();
                Node new_node= new Node(data);
                Node temp= head,ptr=temp.next;
                for (int w=0;w<(j-2);w++){
                      temp=ptr;
                      ptr=ptr.next;
                }
                new_node.next=temp.next;
                temp.next=new_node;

                break;
            }
        }
            System.out.println("enter 1 to continue");
             c=sc.nextInt();
    }
    }
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("no ll exist");
        } else {
            System.out.println("your data is this: ");
            System.out.println(temp.data);
            while (temp.next != head) {
                temp = temp.next;
                System.out.println(temp.data);
            }
        }
    }

    public void delete(){
        Scanner cs = new Scanner(System.in);
        if(head==null){
            System.out.println("no ll exist");
        }
        else {
        System.out.println("DELETE--> enter the no 1 for beginning\n enter the no 2 for end 3 for specific location ");
        int i=cs.nextInt();
        switch (i){
            case 1:{

                head=head.next;
                tail.next=head;
                break;
            }
            case 2:{
                Node temp=head,ptr=temp.next;
                while (ptr.next!=head){
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=head;
                tail=temp;

                break;
            }
            case 3:{
                System.out.println("entre the location");
                int k=cs.nextInt();
                Node temp= head;
                Node ptr=temp.next;
                for(int r=0;r<k-2;r++){
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=ptr.next;

                break;
            }
        }
    }
    }
}
