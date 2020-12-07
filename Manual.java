//Data Abstraction
public class Manual extends AbstractorDemo{
    private String engineType = "Manual";
    void turnOn(){
        System.out.println("\nEngine Manual is turn ON!!!");
    }
    void turnOff(){
        System.out.println("Engine Manual is turn OFF!!!");
    }
    void type(){
        System.out.println("Engine Type : "+engineType);
    }
}
