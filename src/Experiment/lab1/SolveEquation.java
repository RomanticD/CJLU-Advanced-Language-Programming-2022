package Experiment.lab1;

import java.util.Scanner;

/**
 * @version 2022.3.1
 * @author 翟俊华
 */
public class SolveEquation {
    public static void main(String[] args) {
        /**
         * This is a program to solve a quadratic equation of one variable
         */
        System.out.println("Enter values for a, b, c(ax^2+bx+c = 0): ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入a：");
        double a = scanner.nextDouble();
        System.out.println("请输入b：");
        double b = scanner.nextDouble();
        System.out.println("请输入c：");
        double c = scanner.nextDouble();
        System.out.println("Calculating...");
        SolveEquation solveEquation = new SolveEquation();
        System.out.println(solveEquation.getResult(a,b,c));
    }
    public String getResult(double a,double b,double c){
        double delta = 0;
        String result ="";
        double x_1=0;
        double x_2=0;
        delta = Math.sqrt(Math.pow(b,2)-4*a*c);
        if (delta<0)
            result="There are no roots!";
        else {
            x_1=((-1)*b + delta)/(2*a);
            x_2=((-1)*b - delta)/(2*a);
            if(x_1==x_2)
                result="有两个相同实数根，x1 = x2 = "+ x_1;
            else {
                result ="有两个实数根，x1 = "+x_1+", "+"x2 = "+x_2;
            }
        }
        return result;
    }
}
