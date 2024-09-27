import java.util.Scanner;
public class div {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the upper limit:");
        int n=a.nextInt();
        System.out.print("Enter the divisor:");
        int d=a.nextInt();

        for(int i=1;i<=n;i++){
            if(i%d==0){
                System.out.print("The first number divisible by " +d+ " is " +i);
                break;
            }
        }
    }
}
