import java.util.Scanner;
public class DivisionExample{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int numerator;
        int denominator;
        try {
            System.out.println("enter numerator");
            numerator = sc.nextInt();
            System.out.println("enter denominator");
            denominator = sc.nextInt();



            float result = (float)numerator/denominator;
            System.out.println("result" + result);
         } catch (ArithmeticException e) {
            System.out.println("Errer+ enter division not equal to zero");
         }
    }
}            
            

         
        
    