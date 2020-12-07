//Interface
interface Father{
    public void fatherPrint();
}
interface Mother{
    public void motherPrint();
}
public class Child implements  Father, Mother {
    public void fatherPrint(){
        System.out.println("Father is here!!!");
    }
    public void motherPrint(){
        System.out.println("Mother is here!!!");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.fatherPrint();
    }
}
