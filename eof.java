import java.util.Scanner;
public class eof{

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        while (a.hasNext()){
            System.out.println ( n + " " + a.nextLine());
            n++;
            
        }
        a.close();
    }
}