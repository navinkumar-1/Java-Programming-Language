public class exm8 {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f = f*i;
        }
        return f;
    }

    public static int bincoeff(int n, int r){
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int n_r_fact= factorial(n-r);

        return n_fact/(r_fact*n_r_fact);
    }
    
    public static void main(String args[]){
        int result = bincoeff(5,2);
        System.out.println(result);
    }
    
}
