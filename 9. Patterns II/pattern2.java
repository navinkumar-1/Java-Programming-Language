public class pattern2 {
    public static void triangle(int row){
        for(int i=1;i<=row;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //for next line 
            System.out.println();
        }
    }
    public static void main(String args[]){
        triangle(5);
    }
    
}
