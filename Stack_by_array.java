

import java.util.Scanner;

public class Stack_by_array {
    public static void main(String[] args) {
        Stack_A obj= new Stack_A();
        obj.push();
        obj.display();
        obj.pop();
        obj.display();
    }
}
class Stack_A{
    Scanner sc=new Scanner(System.in);
    int n=10;
    int arr[]= new int[n];
    int top=-1;
    void push(){
        if(top==(n-1)){
            System.out.println("overflow");
        }
        else{
            int j=1;
            while(j==1){
            System.out.println("enter the data");
            int data=sc.nextInt();
            top++;
            arr[top]=data;
            System.out.println("item inserted");
                System.out.println("press 1 to continue");
                j=sc.nextInt();
            }
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("underflow");
        } else {
            int j = 1;
            while (j == 1) {
                top = top - 1;
                System.out.println("item delete");
                System.out.println("press 1 to continue");
                j=sc.nextInt();
            }
        }
    }
    public void display(){
        System.out.println("item are:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
