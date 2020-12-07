public class Constructor {
    String name;
    int age;
    Constructor(){
        System.out.println("This is Default Constructor");
    }
    Constructor(String name){
        this.name = name;
        System.out.println("Name : "+name);
    }
    Constructor(String name, int age){
        this.name = name;
        this.age  = age;
        System.out.println("Name : "+name+" Age : "+age);
    }
    //Copy Constructor
    Constructor(Constructor myConstructor){
        name    = myConstructor.name;
        age     = myConstructor.age;
    }
    void Show(){
        System.out.println("Name : "+name+" Age : "+age);
    }

    public static void main(String[] s) {
        new Constructor();

    }
}
