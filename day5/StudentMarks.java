package day5;

public class StudentMarks {
      public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 78, 92}, 
            {76, 88, 85, 80},
            {90, 91, 92, 89} 
        };

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + " Marks: ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(+marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
