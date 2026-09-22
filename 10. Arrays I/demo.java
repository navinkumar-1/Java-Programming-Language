import java.util.*;

public class demo{
    public static void main(String args[]){
    int marks[]= new int[100];

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Physics marks :- ");
    marks[0]= sc.nextInt();
    System.out.print("Enter Chemistry marks :- ");
    marks[1]= sc.nextInt();
    System.out.print("Enter Maths marks :- ");
    marks[2]= sc.nextInt();
    System.out.println();

    System.out.println("The Student Marks is : ");
    System.out.println("phy :-"+marks[0]);
    System.out.println("chem :-"+marks[1]);
    System.out.println("maths :-"+marks[2]);
    }
}