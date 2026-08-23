import java.util.Scanner;
public interface exm2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range of NUmber :-");
        int range = sc.nextInt();
        int num = 0;
        
        while (num <= range){
            
            System.out.println(num);
            num++;
        }       
    }    
}
