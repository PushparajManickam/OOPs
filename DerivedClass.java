//Single Inheritance
public class DerivedClass extends BaseClass {
    String eMail, passWord;
    DerivedClass(String fName, String lName, int age, String eMail, String passWord) {
        super(fName, lName, age);
        this.eMail      = eMail;
        this.passWord   = passWord;
    }
    void print(){
        super.print();
        System.out.println("Email\t\t: "+ eMail);
        System.out.println("PassWprd\t: "+ passWord);
    }
}
