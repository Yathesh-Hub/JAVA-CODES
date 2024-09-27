import java.util.Scanner;

public class even{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        System.out.print((num%2==0)?("Even"):("odd"));
        
}
}