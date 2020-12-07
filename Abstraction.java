public class Abstraction {
    public static void main(String[] args) {
        AbstractorDemo aDemo1 = new Automatical();
        AbstractorDemo aDemo2 = new Manual();
        //Demo 1
        aDemo1.turnOn();
        aDemo1.turnOff();
        aDemo1.type();
        //Demo 2
        aDemo2.turnOn();
        aDemo2.turnOff();
        aDemo2.type();
    }
}
