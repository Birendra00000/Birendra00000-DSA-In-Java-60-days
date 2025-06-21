public class IsSorted {

public static boolean findSorted(int arr[],int idx){

    if(idx==arr.length-1){
        return true;
    }

if(arr[idx]<arr[idx+1]){
    return findSorted(arr,idx+1);

}
else{
    return false;
}

}

public static void main(String args[]){

int arr[]={1,2,5};

boolean result=findSorted(arr,0);
 System.out.println("\nIs array sorted? " + result);

}

    
}
