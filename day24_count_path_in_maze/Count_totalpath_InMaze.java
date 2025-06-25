//Count total path in Maze to move from (0,0) to(n,m)

//*Condition */
//only move right side and downward side


public class Count_totalpath_InMaze{


public static int countTotalPath(int i,int j,int n,int m){

if(i==n||j==m){
    return 0;
}

if(i==n-1&&j==m-1){
    return 1;
}

//Move downward
int downpath=countTotalPath(i+1,j,n,m);

//Move right side

int rightpath=countTotalPath( i, j+1, n,m);

return downpath+rightpath;


    }

public static void main(String args[]){

int n=3,m=3;

int totalPath=countTotalPath(0,0,n,m);
System.out.println("\nTotal path: "+totalPath);
}


}