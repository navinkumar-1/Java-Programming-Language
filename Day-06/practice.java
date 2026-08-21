public class practice {

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

    public static void main(String args[]) {

        int n = 20;

        for (int i = 2; i <= n; i++) {

            if (find(i)) {
                System.out.println(i + " ");
            }
        }
        
    }a
    
}