//Method Overloading
public class CompileTime {
    int add(){
        int n=22, p=27;
        return n+p;
    }
    int add(int n, int p){
        return n+p;
    }
    int add(int n, int p, int np){
        return n+p+np;
    }
    String add(String n, String p){
        return n+p;
    }
    public static void main(String[] args) {
        CompileTime cTime = new CompileTime();
        System.out.println( cTime.add());
        System.out.println(cTime.add(22, 27));
        System.out.println(cTime.add(27, 27, 2227));
        System.out.println(cTime.add("Nandhini Priya ", "Pushparaj"));
    }
}
