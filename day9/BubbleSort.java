package day9;

public class BubbleSort{


 public static void printArray(int arr[]){
        for(int i=0;i<  arr.length;i++){
            System.out.print("      "+arr[i]+" ");
        }
    }

public static void main(String[] args) {
        
    //Bubble sorting 
int arr[]={1,5,2,9,7,10};
//sorting
for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
//Swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp; 
        }

}


}

printArray(arr);
}

}