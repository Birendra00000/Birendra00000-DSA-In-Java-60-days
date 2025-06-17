package day14;

public class NaturalNumSum {
    
public static void printSum(int i,int num,int sum){
if(i==num){
    sum=sum+i;
    System.out.println("\n Sum of Natural Number is: "+sum);
    return;
}
sum+=i;

printSum(i+1,num,sum);

}

public static void main(String args[]){

    printSum(0,10,0);
}

}
