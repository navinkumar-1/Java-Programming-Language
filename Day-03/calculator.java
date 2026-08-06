import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income :-");
        int income = sc.nextInt(); 
        
        if (income<=500000){       
            System.out.println("Tax is :- 0");
        }
        else if (income < 1000000){
            int tax = income*20/100;
            System.out.println("Tax is :-"+tax);
        }
        else if (income >=1000000){
            int tax = income*30/100;
            System.out.println("Tax is :-"+tax);
        }
        else{
            int tax = income*30/100;
            System.out.println("Tax is :-"+tax);
        }
        

    }
    
}
