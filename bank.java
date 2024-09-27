import java.util.Scanner;
public class bank {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter Current balance:");
        int a= s.nextInt();

        System.out.print("Enter Withdrawel amount:");
        int b=s.nextInt();

        if(b>a){
            System.out.print("Error: Insufficient balance");
        }
        else{
            System.out.print("Withdrawal successful. New balance:"+(a-b));
        }
}

}
