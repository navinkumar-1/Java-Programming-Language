import java.util.Scanner;
public class exm5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number :-");
        int num = sc.nextInt();

        

        if (num==0){
            System.out.println("Number is Zero");
        }
        else if(num<1){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is Positive");
        }

    }
}
