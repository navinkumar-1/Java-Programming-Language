public class factorial {
    public static int fact(int n){
        int f =1;

        for (int i =1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        int num = fact(5);
        System.out.println("Factorial is :- "+num);
    }

    
}
