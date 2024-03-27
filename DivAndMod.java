import java.util.*;
public class DivAndMod {
    public static void main (String[]args){
        int num1;
        int num2;
        Scanner input= new Scanner(System.in);
        System.out.print("enter an integer: ");
        num1=input.nextInt();
        System.out.print("enter another integer: ");
        num2=input.nextInt();
        int ans1=num1/num2;
        int ans2=num1%num2;
        int ans3=num2/num1;
        int ans4=num2%num1;
        System.out.println(num1+"/"+num2+"="+ans1);
        System.out.println(num1+"%"+num2+"="+ans2);
        System.out.println(num2+"/"+num1+"="+ans3);
        System.out.println(num2+"/"+num1+"="+ans4);
    }

    
}
