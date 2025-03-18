package OnlineClassTestAcademy;

import java.util.Scanner;

public class Task_1_practice {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Value 1: ");
        int value1 = scanner.nextInt();
        System.out.println("Enter Value 2: ");
        int value2 = scanner.nextInt();
        System.out.println("Enter Value 3: ");
        int value3 = scanner.nextInt();

        System.out.println("Value 1:"+value1); // print all values> Task1
        System.out.println("Value 2:"+value2);
        System.out.println("Value 3:"+value3);

        int maxvalue= (value1>value2)? value1:value2; // Calculate max number with ternary operator> Task2
        System.out.println("maximum value is:"+maxvalue);

        String result= (value1%2==0)? "even":"odd";    // Calculate even or odd number> Task3
        System.out.println("Value"+value1+"is"+result);




    }
}
