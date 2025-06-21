
public class MoveXToLast{


public static void moveAllX(String str,int count,String newString,int idx){

    
    
    if(idx==str.length()){
        
        for(int i=0;i<count;i++){
            newString+='x';
        }
        System.out.println("\n\nNew string after moving all X at last is : " +newString+"\n");
        return;
        
    }
    char current_char=str.charAt(idx);

if(current_char=='x'){
count=count+1;
moveAllX(str,count,newString,idx+1);
}

else{
newString=newString+current_char;
moveAllX(str,count,newString,idx+1);
}


}

public static void main(String args[]){
    String str="abxjfjaxxxndkjax";

    moveAllX(str,0,"",0);


}


}