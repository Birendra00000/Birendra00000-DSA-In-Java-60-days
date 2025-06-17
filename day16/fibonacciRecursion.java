package day16;

public class fibonacciRecursion {

    public static void printFab(int a,int b,int n){

        if(n==0){
            return;
        }

    int c=a+b;
    System.out.println(c);
    printFab(b,c,n-1);
    }

    public static void main(String args[]){

        int a=0;
        int b=1;
        System.out.println("\n"+a);
        System.out.println(b);
        int n=7;
        printFab(a,b,n-2);

    }
    
}
