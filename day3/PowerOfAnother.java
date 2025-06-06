package day3;
import java.util.Scanner; 

public class PowerOfAnother {


    public static void powerCalculate(int base,int power){
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*base;
        }
        System.out.print("\nResult is: "+result);
    }

    public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
System.out.print("\n Enter base number: ");
int base=sc.nextInt();
System.out.print("Enter power number: ");
int power=sc.nextInt();
powerCalculate(base,power);
sc.close();
    }
    
}
