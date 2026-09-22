import java.util.*;
public class demo1 {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]={98,97,98};
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("After Updation :");
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
