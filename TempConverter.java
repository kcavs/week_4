import java.util.*;
public class TempConverter {
    public static void main(String[]args){
        double F;
        double celsius;
        Scanner input= new Scanner(System.in);
        System.out.print("enter the fahrenheit tempurature: ");
        F= input.nextInt();
        celsius= (5.0/9.0*(F-32.0));
        System.out.println(celsius);
    }
    
}
