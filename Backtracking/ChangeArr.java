public class ChangeArr {
    public static void ChangeArr(int arr[],int i,int val){
        // Base case
       if (i==arr.length) {
        printArr(arr);
        return;
        }
        
        // Check if the current index is even or odd
        // Recursive case
        arr[i]=val;
        ChangeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;


    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }  
public static void main(String[] args) {
    int arr[]=new int[5];
    ChangeArr(arr,0,1);
    printArr(arr);
    
    }
}
