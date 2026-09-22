import java.util.*;
public class demo3 {
    public static int find(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[]={20,60,80,90,50,10,20};
        int key = 100;
        int result = find(num,key);

        if(result==-1){
            System.out.println("The value is not found");
        }
        else{
            System.out.println("Value Found At "+result+" Index");
        }
    } 
}
