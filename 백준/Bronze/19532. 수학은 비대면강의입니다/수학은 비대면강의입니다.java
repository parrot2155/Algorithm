import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        int x = (int) ((b*f-e*c)/(b*d-a*e));
        int y = (int) ((a*f-d*c)/(a*e-b*d));

        
        
        System.out.println(x+" "+y);
        
    }
}