import java.util.Scanner;

public class Polynomial_equation_addition {
    public static void main(String[] args) {
        Rohit obj= new Rohit();
        obj.insertll1();
        obj.insertll2();
        obj.Add();
        obj.display();
    }

}
  class Node{
    int expo;
    int coff;
    Node next;
    public Node(int expo,int coff){
        this.coff=coff;
        this.expo=expo;
    }
}
class Rohit{
     Node head1,head2,head3;
    Scanner sc = new Scanner(System.in);


    public void display(){
        Node temp3=head3;
        while (temp3!=null){
            System.out.println(temp3.coff+"  "+ temp3.expo);
            temp3=temp3.next;
        }
    }

    public void insertll1() {

        int c = 1;
        do {
            System.out.println("enter the coff");
            int coff = sc.nextInt();
            System.out.println("enter the expo");
            int expo = sc.nextInt();
            Node new_node = new Node(expo, coff);
            if (head1 == null || head1.expo < new_node.expo) {
                new_node.next = head1;
                head1 = new_node;
            } else {
                Node temp = head1;
                while (temp.next != null && temp.next.expo >= new_node.expo) {
                    temp = temp.next;
                }
                new_node.next = temp.next;
                temp.next = new_node;
            }
            System.out.println("press one to continue insertion");
            c = sc.nextInt();
        } while (c == 1);

    }

        public void insertll2(){

            int d = 1;
            do {
                System.out.println("enter the coff");
                int coff = sc.nextInt();
                System.out.println("enter the expo");
                int expo = sc.nextInt();
                Node new_node = new Node(expo, coff);
                if (head2 == null || head2.expo < new_node.expo) {
                    new_node.next = head2;
                    head2 = new_node;
                } else {
                    Node temp = head2;
                    while (temp.next != null && temp.next.expo >= new_node.expo) {
                        temp = temp.next;
                    }
                    new_node.next = temp.next;
                    temp.next = new_node;
                }
                System.out.println("press one to continue insertion");
                d= sc.nextInt();

            } while (d == 1);


        }



        public void Add(){

            Node ptr1=head1,ptr2=head2;
            int expo,coff;
            Node ptr;
            while(ptr1.next!=null && ptr2.next!=null) {
                if (ptr1.expo == ptr2.expo) {
                    coff = ptr1.coff + ptr2.coff;
                    expo = ptr1.expo + ptr2.expo;
                    Node new_node = new Node(coff, expo);
                    ptr2=ptr2.next;
                    ptr1=ptr1.next;
                    if(head3==null){
                        head3=new_node;
                    }
                    else{
                        Node temp=head3;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                    }
                }
                else if(ptr1.expo> ptr2.expo){
                    expo=ptr1.expo;
                    coff= ptr1.coff;
                    Node new_node= new Node(coff,expo);
                    ptr1=ptr1.next;
                    if(head3==null){
                        head3=new_node;
                    }
                    else{
                        Node temp=head3;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                    }
                }
                else if(ptr1.expo< ptr2.expo){
                    expo=ptr2.expo;
                    coff= ptr2.coff;
                    Node new_node= new Node(coff,expo);
                    ptr2=ptr2.next;
                    if(head3==null){
                        head3=new_node;
                    }
                    else{
                        Node temp=head3;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                    }
                }



            }
            while(ptr1.next!=null){
                expo=ptr1.expo;
                coff= ptr1.coff;
                Node new_node= new Node(coff,expo);
                if(head3==null){
                    head3=new_node;
                }
                else{
                    Node temp=head3;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=new_node;
                }
                ptr1=ptr1.next;
            }
            while(ptr2.next!=null){
                expo=ptr2.expo;
                coff= ptr2.coff;
                Node new_node= new Node(coff,expo);
                if(head3==null){
                    head3=new_node;
                }
                else{
                    Node temp=head3;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=new_node;
                }
                ptr2=ptr2.next;
            }

          }

    }

