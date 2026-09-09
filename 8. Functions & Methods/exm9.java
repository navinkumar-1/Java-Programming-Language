public class exm9 {
    public static float sum(float a, float b){
        return a + b;
    }
    public static int sum(){
        int a = 10;
        int b = 20;
        return a + b;
    }
    public static double sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String args[]){
        
        // Function Overloading 
        float result = sum(10f,20f);
        System.out.println(result);

        // Function Overloading
        int result2 = sum();
        System.out.println(result2);

        // Function Overloading
        double result3 = sum(10);
        System.out.println(result3);
    }
}
