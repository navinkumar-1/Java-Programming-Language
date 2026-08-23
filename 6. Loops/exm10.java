import java.util.Scanner;
public class exm10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\n Enter The Number :-");
            int n = sc.nextInt();
            if (n==10){
                System.out.println("I am Out |");
                break;
            }
            
            System.out.print("Number is :-"+n);


        }while(true);

    }

    }