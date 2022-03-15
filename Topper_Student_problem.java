import java.util.Scanner;

public class Topper_Student_problem {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student1 arr[]= new Student1[5];
        for(int t=0;t< arr.length;t++){
            arr[t]=new Student1();
              arr[t].setMarks(sc.nextInt());
              arr[t].setRollno(sc.nextInt());
              arr[t].setName(sc.next());
        }
        int maxindex=0,minindex=0,max=0;
        int min=arr[0].getMarks();
        for(int i=0;i<arr.length;i++){
            if (max < arr[i].getMarks()){
                max=arr[i].getMarks();
                maxindex=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(min > arr[i].getMarks()){
                min= arr[i].getMarks();
                minindex=i;
            }
        }

        System.out.println("The topper marks is"+arr[maxindex].getMarks()+"\n"+"the name of topper is"+arr[maxindex].getName() +"\n"+"the rollno of topper is"+arr[maxindex].getRollno());
        System.out.println("The minTopper marks is"+arr[minindex].getMarks()+"\n"+"the name of minTopper is"+arr[minindex].getName() +"\n"+"the rollno of minTopper is"+arr[minindex].getRollno());


    }




}
class Student1{
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
