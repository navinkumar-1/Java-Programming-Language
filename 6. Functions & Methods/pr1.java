public class pr1 {

    public static boolean find(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static void series(int k){
        for(int i=2;i<=k;i++){
            if (find(i)){
                System.out.println(i+" ");
            }
        }
    }

    public static void main(String args[]) {  
        series(20);      
    }
    
}