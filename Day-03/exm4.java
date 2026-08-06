import java.util.Scanner;
public abstract class exm4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :- ");
        int num2 = sc.nextInt();
        System.out.print("Only Binary Arithmetic Operation");
        System.out.print("Enter Operator (+, -, *, /, %):- ");
        String operator = sc.next();


        switch(operator){
            case "+":
                System.out.println("Addition is "+(num1+num2));
                break;
            case "-":
                System.out.println("Substraction is "+(num1-num2));
                break;
            case "*":
                System.out.println("Multiplication is "+(num1*num2));
                break;
            case "/":
                System.out.println("Division is "+(num1/num2));
                break;
            case "%":
                System.out.println("Module is "+(num1%num2));
                break;
            default:
                System.out.println(" Choose Only Binary Operator ");

        }





    }
    
}
