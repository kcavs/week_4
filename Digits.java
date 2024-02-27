public class Digits {
    public static void main(String[]args){
        int nums;
        int dig_1;
        int dig_2;
        int dig_3;
        nums=526;
        dig_1=(nums%10);
        dig_2=(((nums%100)-dig_1)/10);
        dig_3=(((nums%1000)-(nums%100))/100);
        System.out.println("the hundreds digit is "+dig_3);
        System.out.println("the tens digit is "+dig_2);
        System.out.println("the ones digit is "+dig_1);

    }
    
}
