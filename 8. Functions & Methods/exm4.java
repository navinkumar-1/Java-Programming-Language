import java.util.Scanner;
public class exm4 {
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to print: ");
        int n = scanner.nextInt();
        print(n);
        scanner.close();
    }
}
