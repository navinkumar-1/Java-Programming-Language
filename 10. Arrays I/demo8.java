public class demo8 {
    public static int binary_Search(int num[],int key){
        int start=0, end=num.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }
            else{
                end = mid-1;  
            }
        }
        return -1;        
    }
    public static void main(String args[]){
        int num[]= {10,20,30,50,60,80,90};
        int key = 60;
        System.out.println("The Value Found At :"+binary_Search(num, key));
    }
    
}
