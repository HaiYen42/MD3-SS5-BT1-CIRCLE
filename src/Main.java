import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double r;
        System.out.println("Enter radius ");
        r= input.nextDouble();
        Circle circle= new Circle(5);
        circle.getRadius();
        circle.getArea();
        System.out.println("Diện tích hình tròn là "+ circle.getArea());
        System.out.println("Bán kính hình tròn là "+ circle.getRadius());
    }
}