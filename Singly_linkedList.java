import java.util.Scanner;

public class Singly_ll {
    public static void main(String[] args) {
        LL obj= new LL();
        obj.insert();
        obj.display();
        obj.delete();
        obj.display();
    }

}
class LL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert() {
        int q, d = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter 1 for inserting the data at begining\nenter 2 for inserting the data at end\nenter 3 for inserting the data at specific location");
            q = sc.nextInt();
            switch (q) {

                case 1: {
                    System.out.println("enter the data");
                    int data = sc.nextInt();
                    Node new_node = new Node(data);
                    if (head == null) {
                        head = new_node;
                    } else {
                        new_node.next = head;
                        head = new_node;
                    }
                    break;
                }

                case 2: {
                    System.out.println("enter the data");
                    int data = sc.nextInt();
                    Node new_node = new Node(data);
                    Node temp;
                    temp = head;
                    if (head == null) {
                        head = new_node;
                    } else {
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                    }

                    break;
                }
                case 3: {

                    System.out.println("enter the Index no where you want to insert the data");
                    int I = sc.nextInt();
                    System.out.println("enter the data for new node");
                    int data = sc.nextInt();
                    Node new_node = new Node(data);
                    Node temp = head, ptr = temp.next;
                    for (int i = 0; i < I - 2; i++) {
                        temp = ptr;
                        ptr = ptr.next;
                    }
                    new_node.next = temp.next;
                    temp.next = new_node;
                    break;
                }
                case 4: {
                    System.out.println("enter the correct value");
                }


            }
            System.out.println("enter the no 0. to stop insertion in the LL or 1 to continue");
            d = sc.nextInt();

        }
        while (d == 1);

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

    public void delete() {
        Scanner sc = new Scanner(System.in);
        int p = 1;
        if(head==null){
            System.out.println("ll not exist");
        }
        else if(head.next==null){
            head=null;
        }
        else{
        while (p == 1) {
            System.out.println("enter 1 for beginning deletion\n enter 2 for end deletion \n enter 3 for deletion at specific  location");
            int I = sc.nextInt();
            switch (I) {

                case 1:{
                    Node temp=head;
                    head=temp.next;
                break;
                }
                case 2:{
                     Node temp=head;
                     Node ptr=temp.next;
                     while(ptr.next!=null){
                         temp=ptr;
                         ptr=ptr.next;
                     }
                     temp.next=null;
                break;
                }
                case 3:{
                    int o;
                    System.out.println("enter the specific location ");
                    o= sc.nextInt();
                    Node temp=head;
                    Node ptr=temp.next;
                    for(int i=0;i<(o-2);i++){
                        temp=ptr;
                       ptr= ptr.next;
                    }
                    head.next=ptr.next;
                }

            }
            System.out.println("enter 1 to continue the deletion or 0 to stop");
            p=sc.nextInt();
        }
    }
    }
}
