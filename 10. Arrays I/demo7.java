public class demo7 {
    public static int large(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if (smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest Number Is :"+smallest);
        return largest;
    }
    public static void main(String args[]){
        int arr[]={20,30,40,50,60,70,80,90,10,90};
        int result = large(arr);
        System.out.println("Largest NUmber Is :"+result);
    }
    
}
