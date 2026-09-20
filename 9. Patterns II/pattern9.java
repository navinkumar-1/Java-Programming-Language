public class pattern9 {
    public static void triangle(int row){
        // Upper Half
        for (int i = 1; i <= row; i++) {

            // Left Triangle (Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // Right Triangle (Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

  
        for (int i = row; i >= 1; i--) {

            // Left Triangle (Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // Right Triangle (Stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]){
        triangle(6);
    }    
}   
