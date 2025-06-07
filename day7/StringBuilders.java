package day7;

public class StringBuilders{

public static void main(String args[]){

 StringBuilder strBuilder=new StringBuilder("Ram");
 System.out.println("\n"+strBuilder);

//  For setting a character at String
 strBuilder.setCharAt(0,'M');
 System.out.println("Setting Character: "+strBuilder);

//  For inserting a character at String

 strBuilder.insert(3,'o');
 System.out.println("Insert Character: "+strBuilder);

//  For Deleting the String

 strBuilder.delete(1, 2);
 System.out.println("Deleting the Character: "+strBuilder);

// Pallindrome checking the String
    String original = "madam";
StringBuilder stringBuilders=new StringBuilder(original);

for(int i=0;i<strBuilder.length();i++){

    int front=i;
    int back=stringBuilders.length()-1-i;
    char frontChar=stringBuilders.charAt(front);
    char backChar=stringBuilders.charAt(back);
    stringBuilders.setCharAt(front, backChar);
    stringBuilders.setCharAt(back, frontChar);

}
//  Convert reversed StringBuilder to string
        String reversed = stringBuilders.toString();

        // Compare original and reversed strings directly
        if (original.equals(reversed)) {
            System.out.println("\nThe string \"" + stringBuilders + "\" is a palindrome.");
        } else {
            System.out.println("\nThe string \"" + stringBuilders + "\" is not a palindrome.");
        }
// System.out.println("\nReverse String: "+strBuilder);

}

}