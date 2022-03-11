import java.util.Scanner;

public class Circular_Queue_array {
    public static void main(String[] args) {

    }
}
class C_Queue_array{
    int n=10;
        int arr[]=new int [n];
        int rear=-1,front=-1;

        public void enqueue(){
            Scanner sc= new Scanner(System.in);
            if(front==(rear+1)%n){
                System.out.println("overflow");
            }
            else{

                System.out.println("enter the data");
               int i=sc.nextInt();
                if(rear==-1&&front==-1){
                    front++;
                    rear++;
                    arr[rear]=i;
                }
                else{
                    rear=(rear+1)%n;
                    arr[rear]=i;
                }
            }
        }
        public void dequeue(){
            if(front==-1&&rear==-1){
                System.out.println("underflow");
            }
            else if(front==rear){
                System.out.println("underflow");
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%n;
            }
        }
        public void display(){
           int i;
           for( i=front;i!=rear;i=(i+1)%n){
               System.out.println(arr[i]);

           }
            System.out.println(arr[i]);

        }
}
