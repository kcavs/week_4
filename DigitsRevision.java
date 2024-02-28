import java.util.*;
public class DigitsRevision {
    public static void main(String[]args){
        int nums;
        int dig_1;
        int dig_2;
        int dig_3;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a 3-digit number: ");
        nums= input.nextInt();
        dig_1=(nums%10);
        dig_2=(((nums%100)-dig_1)/10);
        dig_3=((nums%1000)/100);
        System.out.println("the hundreds digit is "+dig_3);
        System.out.println("the tens digit is "+dig_2);
        System.out.println("the ones digit is "+dig_1);
    }
    
}
