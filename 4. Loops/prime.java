import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :-");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1) {
        isPrime = false;
        }
        
        for (int i=2; i<=num-1; i++){
            if(num%i==0){
                isPrime = false;
            }
        }   
        
        if (isPrime==true){
            System.out.println(num+" Is Prime Number");
        }
        else{
            System.out.println(num+" Is Not A Prime Number");
        }
        }
    }
