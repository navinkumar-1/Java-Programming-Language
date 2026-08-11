public class exm7 {
    public static void main(String args[]){
        int n = 4581;

        while( n > 0){
            int lastdigit = n % 10;
            System.out.print(lastdigit+"");
            n = n / 10;

 
        }

    }
    
}
