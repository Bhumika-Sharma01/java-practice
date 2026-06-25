import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the length");
       int l = sc.nextInt();
       System.out.println("enter the breath");
       int w = sc.nextInt();
       int area = l*w;
       System.out.println("enter the area of rectangle="+ area);
    }
}