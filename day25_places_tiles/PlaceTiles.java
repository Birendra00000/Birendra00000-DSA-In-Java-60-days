
public class PlaceTiles{


    public static int palceTiles(int n,int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

//vertically
int verticalCount=palceTiles(n-m,m);

//Horizontally

int horizontalCount=palceTiles(n-1,m);

return verticalCount+horizontalCount;

    }


public static void main(String args[]){

int n=3, m=2;

int totalCount=palceTiles(n,m);
System.out.println("\nTotal places tiles: "+totalCount);

}

}