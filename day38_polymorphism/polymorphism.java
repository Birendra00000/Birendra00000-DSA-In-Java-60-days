
class Student{

    String name;
    int age;

    public void getStudentInfo(String name , int age){
        System.out.println("\nName :"+ name +" "+"Age :" + age);
    }


    public void getStudentInfo(String name ){
        System.out.println(name );
    }

    public void getStudentInfo( int age){
        System.out.println( age);
    }


}

public class polymorphism{

public static void main(String args[]){

    Student S1 =new Student();
    S1.name="Big Bang";
    S1.age=20;

    S1.getStudentInfo(S1.name,S1.age);

}

}