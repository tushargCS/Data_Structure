import java.util.Scanner;

public class Queue_array {
    public static void main(String[] args) {
         Queue obj= new Queue();
         obj.enqueue();
         obj.display();
         obj.dequeue();
         obj.display();
    }
}
class Queue{
    int n=10;
    int arr[]= new int[n];
    Scanner sc= new Scanner(System.in);
    int rear=-1,front=-1;
    public void enqueue(){
        int d=1;
        while(d==1){
        if(rear==(n-1)){
            System.out.println("overflow");
        }
        else {
            if (rear == -1 && front == -1) {
                rear++;
                front++;
                System.out.println("enter the data");
                int data = sc.nextInt();
                arr[rear] = data;
            }
            else {
                rear++;
                System.out.println("enter the data");
                int data=sc.nextInt();
                arr[rear]=data;

            }
        }
            System.out.println("press 1 to continue");
        d=sc.nextInt();
        }
    }
    public void dequeue(){
        if(rear == -1 && front == -1){
            System.out.println("underflow");
        }
        else{
            front++;
        }
    }
    public void display(){
        System.out.println("item are");
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
