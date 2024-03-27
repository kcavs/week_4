import java.util.*;
public class AccountSetup {
    public static void main(String[]args){
       String name;
       String pass;
       Scanner input=new Scanner(System.in);
       System.out.print("enter your full name: ");
       name=input.nextLine();
       System.out.print("enter your password: ");
       pass=input.nextLine();
       System.out.println("your name is "+name);
       System.out.println("your password is "+pass);

    }
}
