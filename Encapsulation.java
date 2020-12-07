//Student.java
public class Encapsulation{
    public static void main(String[] args) {
        Student s = new Student();
        s.setiD(36);
        s.setName("Pushparaj");
        System.out.println("Roll Number : "+s.getiD());
        System.out.println("Name : "+s.getString());
    }
}