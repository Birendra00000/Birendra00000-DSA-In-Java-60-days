package day6;

public class Strings {

    public static void main(String args[]){
        //Concatenation the string
        String firstName="Birendra";
        String lastName="Bhusal";
        String fullName=firstName+lastName;
        System.out.println("\nLength of Name:"+fullName.length());

//For printing the character of FullName

for(int i=0;i<fullName.length();i++){
    System.out.println(fullName.charAt(i));
}


//For comparing the strings
String name1="Ram";
String name2="Ram";

if(name1.compareTo(name2)==0){
    System.out.print("Strings are equal");
}
else{
    System.out.print("Strings are not equal");

}
}

}

