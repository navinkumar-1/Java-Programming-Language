import java.util.Scanner;

public class pass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Marks :- ");
        int marks = sc.nextInt();

        String result = (marks<=33)? "Faillled" : "Passed";
        System.out.print("Student is Succesfully "+result);

    }
}