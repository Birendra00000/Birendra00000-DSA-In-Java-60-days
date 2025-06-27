
// Find number of ways in which you can invite n people to your party single or in pairs


public class FindNumWays{

public static int calculateWays(int n){

if(n<=1){
    return 1;
}

//Single
int ways1=calculateWays(n-1);

//Pairs

int ways2= (n-1)*calculateWays(n-2);

return ways1+ways2;

}

public static void main(String args[]){

int n=4;
System.out.println("\nNumber of ways are: ");
System.out.println(calculateWays(n));

}

}