public class fun2 {
    public static  int sum(int a, int b){
        return a+b;
    }
    public static double sum(float a, float b, double c){
        return a+b+c;
    }
        public static float sum(float a, float b, float c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(10,20));
        System.out.println(sum(10.2f,20.2f,23.5f));
        System.out.println(sum(1.2f,2.2f,23.5));
    }
    
}
