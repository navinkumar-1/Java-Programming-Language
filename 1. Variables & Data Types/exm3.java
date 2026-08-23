import java.util.Scanner;

public class exm3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Item Prices  :- ");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        System.out.println("Item Total :- "+(pencil+pen+eraser));
        System.out.println("Gst :- "+(((pencil+pen+eraser)*18)/100));
        System.out.println("Final Amount :- "+((pencil+pen+eraser)+(((pencil+pen+eraser)*18)/100)));

    }
}