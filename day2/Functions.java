import java.util.Scanner; 
public class Functions{
 
 public static void printName(String name){
     System.out.println("Your name is " + name);
     return;
 }

 public static int sumTwoNumber(int num1,int num2){
     int sum=num1+num2;
     System.out.println("The sum of two number is"+sum);
     return sum;
 }


public static void calculateFactorial(int number){
    int factorial=1;
    for(int i=number;i>=1;i--){
        factorial=factorial*i;
    }
    System.out.println("Factorial is "+factorial);
}

public static void main(String[] args){
Scanner sc=new Scanner (System.in);
 System.out.print("\nEnter your name: "); 
 String name=sc.nextLine();
 printName(name);

 System.out.print("\nEnter first Number: "); 
 int num1=sc.nextInt();
 System.out.print("\nEnter second Number: "); 
 int num2=sc.nextInt();

 sumTwoNumber(num1,num2);
System.out.print("\nEnter  Number: "); 

int factorial=sc.nextInt();
calculateFactorial(factorial);

 sc.close(); 

    }

}




