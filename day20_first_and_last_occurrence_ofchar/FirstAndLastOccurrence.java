
public class FirstAndLastOccurrence{

    public static int first=-1;
    public static int last=-1;

    public static void findOccurrence(String str,int idx,char element){

        if(idx==str.length()){
            System.out.println("\nFirst Occurrence: "+first);
            System.out.println("Last Occurrence: "+last);
            return;
        }

        char current_char=str.charAt(idx);
             if(current_char == element){
              if(first==-1){
                first=idx;
             }
             else{
                last=idx;
             }
          }
        findOccurrence(str,idx+1,element);

    }
public static void main(String args[]){

String str="akdjlajsljlaalfla";

findOccurrence(str,0,'a');
}

}