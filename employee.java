import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    private int salary;
    private int allow;

    public void getdetail(){
        Scanner a=new Scanner(System.in);

        System.out.println("Name:");
        name =a.nextLine();
        System.out.println("ID:");
        id=a.nextInt();
        System.out.println("Basic Salary:");
        salary=a.nextInt();
        System.out.println("Allowance:");
        allow=a.nextInt();
    }
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("ID:" +id);
        System.out.println("Basic Salary:" +salary);
        System.out.println("Allowance:" +allow);
    }
}
public class employee{
    public static void main(String[] args) {
        System.out.println("Enter the number of employee:");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        Employee[] e1=new Employee[n];
        
        for (int i=0;i< e1.length;i++){
            e1[i]= new Employee();
            e1[i].getdetail();
            e1[i].display();
        }
        }
}

    

