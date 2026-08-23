import java.rmi.server.SocketSecurityException;

public class prime {
    public static void main(String args[]){
        int num =0;
        boolean Prime = true;
        
        if (num <= 1) {
        Prime = false;
        }

    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
        Prime = false;
     break;
        }
    }

    if (Prime){
        System.out.println("DOne");
        
    }
    else{
        System.out.println("Not Done");
    }
}
    }

}
