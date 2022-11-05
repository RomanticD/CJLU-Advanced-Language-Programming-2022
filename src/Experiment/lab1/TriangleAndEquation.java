package Experiment.lab1;

import java.util.Scanner;

/**
 * @version 2022.3.1
 * @author 翟俊华
 */
public class TriangleAndEquation {
    public static void main(String[] args) {
        System.out.println("Enter the number of columns to print：");
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        TrianglePrinter(n);
        System.out.println("Enter values for a, b, c  (ax^2+bx+c = 0): ");
        System.out.println("请输入a：");
        double a = scanner.nextDouble();
        System.out.println("请输入b：");
        double b = scanner.nextDouble();
        System.out.println("请输入c：");
        double c = scanner.nextDouble();
        System.out.println("Calculating...");
        getEquationResult(a,b,c);
    }
    public static void TrianglePrinter(int n){
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void getEquationResult(double a,double b,double c){

        String result ="";
        double x_1=0;
        double x_2;
        double delta = Math.pow(b, 2) - 4 * a * c;
        double sqrtDelta = Math.sqrt(delta);
        if (delta <0){
            result="There are no roots!";
        }
        else {
            x_1=((-1)*b + sqrtDelta)/(2*a);
            x_2=((-1)*b - sqrtDelta)/(2*a);
            if(x_1==x_2)
                result="有两个相同实数根，x1 = x2 = "+ x_1;
            else {
                result ="有两个实数根，x1 = "+x_1+", "+"x2 = "+x_2;
            }
        }
        System.out.println(result);
    }
}
