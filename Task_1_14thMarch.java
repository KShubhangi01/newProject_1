package OnlineClassTestAcademy;

public class Task_1_14thMarch {
    public static void main(String[]args){
        int a= 12;
        int b= 13;
        int c= 14;
        System.out.println("Value 1:"+a  + "Value 2:"+b  + "Value 3:"+c );   //Print all values> Task1
        System.out.println("Value 1:"+a);
        System.out.println("Value 2:"+b);
        System.out.println("Value 3:"+c);

        int maxvalue= (a>b)? a:b;                         // Calculate max number with ternary operator> Task2
        System.out.println("maximum value is:"+maxvalue);

        String result= (b%2==0)? "even":"odd";    // Calculate even or odd number> Task3
        System.out.println("Value"+b+"is"+result);
    }
}
