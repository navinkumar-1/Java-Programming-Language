import java.util.Scanner;
public class relation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :-");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :-");
        int num2 = sc.nextInt();

        boolean result1 = num1>num2;
        boolean result2 = num1<num2;
        boolean result3 = num1>=num2;
        boolean result4 = num1<=num2;
        boolean result5 = num1==num2;

        System.out.println("num1 > num2: " + result1);
        System.out.println("num1 < num2: " + result2);
        System.out.println("num1 >= num2: " + result3); 
        System.out.println("num1 <= num2: " + result4);
        System.out.println("num1 == num2: " + result5);

        sc.close();
    

    }
    
}
