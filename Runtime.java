//Method overriding
public class Runtime extends Parent{
    void print(){
        System.out.println("Child Class is here!!!");
    }
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Parent childObj = new Runtime();
        parentObj.print();
        childObj.print();
    }
}