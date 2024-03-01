import java.util.*;
public class GradeAve {
    public static void main(String[]args){
        double grade1;
        double grade2;
        double grade3;
        double grade4;
        double grade5;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first grade: ");
        grade1= input.nextInt();
        System.out.print("enter your second grade: ");
        grade2= input.nextInt();
        System.out.print("enter your third grade: ");
        grade3= input.nextInt();
        System.out.print("enter your fourth grade: ");
        grade4= input.nextInt();
        System.out.print("enter your fith grade: ");
        grade5= input.nextInt();
        average=((grade1+grade2+grade3+grade4+grade5)/5.0);
        System.out.println("the average of your grades is: "+average);

    }
}
