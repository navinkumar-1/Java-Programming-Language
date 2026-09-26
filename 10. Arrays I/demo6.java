public class demo6{
    public static int find(String arr[],String key){
        for(int i = 0;i<=arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String arr[]={"navin","Aman","Karan","ajit"};
        String key = "Aman";
        int  result = find(arr,key);  
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}