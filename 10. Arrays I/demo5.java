public class demo5{
    public static int find(int arr[],int key){
        for(int i = 0;i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={100,20,30,50,60,60,10};
        int key = 10;
        int result = find(arr,key);
        if(result == -1){
            System.out.println("Value is not  found :");
        }
        else{
            System.out.println("Value Found At :"+result);
        }
    }
}