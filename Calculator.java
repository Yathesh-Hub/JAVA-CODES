
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 10);
        System.out.println("add(5, 10) = " + result1); 

        int result2 = calculator.add(1, 2, 3);
        System.out.println("add(1, 2, 3) = " + result2); 
        
        double result3 = calculator.add(4.5, 5.5);
        System.out.println("add(4.5, 5.5) = " + result3); 
    }
}
