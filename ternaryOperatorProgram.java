package OnlineClassTestAcademy;

import java.util.Scanner;

public class ternaryOperatorProgram {
   public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter score Value: ");
       int score = scanner.nextInt();

       String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

       System.out.println(grade);
   }
}
