//Basic Class and object
import java.util.Scanner;
public class Bike{
    String Brand;
    String Model;
    int Weight;
    int Cubic_Capacity;
    int Mileage;
    void setBrand(String Brand){
        this.Brand = Brand;
    }
    void setModel(String Model){
        this.Model = Model;
    }
    void setWeight(int Weight){
        this.Weight = Weight;
    }
    void setCubic_Capacity(int Cubic_Capacity){
        this.Cubic_Capacity = Cubic_Capacity;
    }
    void setMileage(int Mileage){
        this.Mileage = Mileage;
    }
    void Show(){
        System.out.println("Brand\t\t\t: "+Brand);
        System.out.println("Model\t\t\t: "+Model);
        System.out.println("Weight\t\t\t: "+Weight);
        System.out.println("Cubic Capacity\t\t: "+Cubic_Capacity);
        System.out.println("Mileage\t\t\t: "+Mileage);
    }
    static Scanner sc = new Scanner(System.in);
    //Main
    public static void main(String[] args) {
    Bike R15 = new Bike();
    String Brand, Model;
    int Weight, Cubic_Capacity, Mileage;
    System.out.println("Enter the Brand : ");
    Brand = sc.nextLine();
    System.out.println("Enter the Model : ");
    Model = sc.nextLine();
    System.out.println("Enter the Weight : ");
    Weight = sc.nextInt();
    System.out.println("Enter the Cubic_Capacity : ");
    Cubic_Capacity = sc.nextInt();
    System.out.println("Enter the Mileage : ");
    Mileage = sc.nextInt();
    R15.setBrand(Brand);
    R15.setModel(Model);
    R15.setWeight(Weight);
    R15.setCubic_Capacity(Cubic_Capacity);
    R15.setMileage(Mileage);
    R15.Show();
}
}