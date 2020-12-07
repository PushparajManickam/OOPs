//Single Inheritance
public class BaseClass {
    String fName, lName;
    int age;
    BaseClass(String fName, String lName, int age){
        this.age    = age;
        this.fName  = fName;
        this.lName  = lName;
    }
    void print(){
        System.out.println("First Name\t: "+fName);
        System.out.println("Last Name\t: "+lName);
        System.out.println("Age\t\t: "+age);
    }
}