


 class Student{

    String name;
    String address;

public  void studentprofile(){

System.out.println(this.name);
System.out.println(this.address);
}
Student(String name, String address){
    this.name=name;
    this.address=address;
}

}

public class Constructor{

    public static void main(String args[]){

        Student S1=new Student("\n"+"Ram","Kathmandu");
        S1.studentprofile();
    }



}