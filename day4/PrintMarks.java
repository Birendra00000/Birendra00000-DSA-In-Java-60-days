package day4;


public class PrintMarks{

public static void main(String args[]){

int[] marks=new int [3];
marks[0]=89;
marks[1]=69;
marks[2]=88;

// System.out.println("\n"+marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);

for(int i=0;i<3;i++){
    System.out.print("\n"+marks[i]);
}

}

}