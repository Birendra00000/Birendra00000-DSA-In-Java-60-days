public class RemoveDublicate {

    public static boolean map[]=new boolean[26];

    public static void removeDublicate(String str,int idx,String newString ){

        if(idx==str.length()){
            System.out.println("\n\nString after removing dublicate characters: "+ newString+ "\n");
            return;
        }

    char currentChar=str.charAt(idx);

    if(map[currentChar-'a']==true){
    removeDublicate(str,idx+1,newString);
}

    else{
    newString+=currentChar;
    map[currentChar-'a']=true;
    removeDublicate(str,idx+1,newString);

}



    }

    public static void main(String args[]){
        String str="aaabbbcccddd";
        removeDublicate(str,0,"");
    }


    
}
