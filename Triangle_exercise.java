package OnlineClassTestAcademy;

import java.util.Scanner;

public class Triangle_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a == b) && (a == c) && (b == c)) {
            System.out.println("Triangle is equilateral");
        } else if (a == b && (a != c) && (b != c)||a == c && (a != b) && (c != b)||c == b && (a != b) && (a != c)){
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is scalene");
        }
    }
}
