package day10;

public class SelectionSort{

public static void printSlectionSort(int arr[]){
    for(int i=0;i<arr.length;i++){

        System.out.println( i+1+" number is "+ arr[i]+" ");
    }
}


public static void main(String args[]){

    int arr[]={4,1,8,5,10};

    //Selection Sort

    for(int i=0;i<arr.length-1;i++){
        int smallest=i;
        for(int j=i+1 ; j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;
            }
        }
        //swapping
int temp=arr[smallest];
arr[smallest]=arr[i];
arr[i]=temp;
    }

printSlectionSort(arr);
}

}