import java.util.Scanner;
public class arithmetic{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The fisrt number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :- ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int sub = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        int module = num1%num2;
        int increment = ++num1;

        System.out.println("sum:- "+sum);
        System.out.println("Sub:- "+sub);
        System.out.println("Mul:- "+mul);
        System.out.println("Div:- "+div);
        System.out.println("Module :-"+module);
        System.out.println("Increment :-"+increment);
        sc.close();



    }
}