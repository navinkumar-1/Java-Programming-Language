public class pattern4{
        public static void pyramid(int row){
        for(int i=1;i<=row;i++){
            //space
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }
    public static void triangle(int row){
        for(int i=1;i<=row;i++){
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //first straight pyramid
        pyramid(5);
        //second opposite pyramid
        triangle(5);
    }
}