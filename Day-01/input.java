import java.util.Scanner;

public class input{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Name Of User Is :- "+name);

        String name2 = sc.nextLine();
        System.out.println("Name Of User Is :- "+name2);

        int age = sc.nextInt();
        System.out.println("Age Of User Is :- "+age);

        float salary = sc.nextFloat();
        System.out.println("Salary Of User Is :- "+salary);

        char gender = sc.next().charAt(0);
        System.out.println("Gender Of User Is :- "+gender);

    }
}