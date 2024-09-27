import java.util.Scanner;
class cars {
    private String car;
    private String model;
    private int year;
    private double price;

    public void getcardetail(){
        Scanner n =new Scanner(System.in);

        System.out.println("Enter the Car name:");
        car=n.nextLine();
        System.out.println("Enter the Car Model:");
        model=n.nextLine();
        System.out.println("Enter the Car Year:");
        year=n.nextInt();
        System.out.println("Enter the Car price:");
        price=n.nextDouble();
    }
    public void displaydetail(){
        System.out.println("Make: " + car);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
        System.out.println("Price : " + price);
        System.out.println();
    }
}
public class car{
    public static void main(String[] args){
        cars carmake=new cars();

        carmake.getcardetail();
        carmake.displaydetail();


    }
}
