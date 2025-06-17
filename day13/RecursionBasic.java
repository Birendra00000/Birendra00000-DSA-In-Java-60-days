package day13;

public class RecursionBasic {
 
public static void printNumber(int num){

if(num==0){
    return ;
}

System.out.println(num);
printNumber(num-1);

    }

public static void main(String args[]){
    int num=10;
    printNumber(num);
}

}
