import java.util.*;

public class Dynamic_Array {
    static int[] insert(int a[],int x){
        int b[]=new int[a.length+1];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        b[a.length]=x;
        return b;

    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter Size of Array= ");
        int n=cin.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements of Array-");
        for(int i=0;i<a.length;i++){
            a[i]= cin.nextInt();
        }
        System.out.print("Enter new element to be inserted= ");
        int x=cin.nextInt();
        int b[]=insert(a,x);
        a=b;
        System.out.println("Elements in the array are-");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
