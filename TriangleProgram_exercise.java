package OnlineClassTestAcademy;


public class TriangleProgram_exercise {
    public static void main(String[]args){

        int a= 12;
        int b= 12;
        int c= 12;

        String result= (a==b && b==c)?(a==b && a!=c)?"equilateral":"isosceles": ((a!=b && b!=c)? "scalene":"None");
        System.out.println("triangle is"+result);



    }
}
