public class pattern7{
    public static void triangle(int row, int count){
        for(int i=1;i<=row;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            //spaces()
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       
        triangle(5,1);
    }    
}   
