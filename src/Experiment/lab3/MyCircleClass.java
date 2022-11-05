package Experiment.lab3;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class MyCircleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //调用无参构造器
        System.out.println("Enter a value r for cir1");
        Double R1 = scanner.nextDouble();
        MyCircleClass cir1 = new MyCircleClass();
        cir1.setR(R1);
        cir1.setName("use无参构造(cir1)");
        System.out.println("圆 " + cir1.getName() + "的半径为： " + cir1.getR());
        System.out.println("圆 " + cir1.getName() + "的面积为： " + cir1.area());
        System.out.println("圆 " + cir1.getName() + "的周长为： " + cir1.perimeter());

        //调用有参数构造器
        System.out.println("Enter a value r for cir2");
        Double R2 = scanner.nextDouble();
        MyCircleClass cir2 = new MyCircleClass("use有参构造(cir2)");
        cir2.setR(R2);
        System.out.println("圆 " + cir2.getName() + "的半径为： " + cir2.getR());
        System.out.println("圆 " + cir2.getName() + "的面积为： " + cir2.area());
        System.out.println("圆 " + cir2.getName() + "的周长为： " + cir2.perimeter());
    }

    double R;
    String name;

    public MyCircleClass(){}

    public MyCircleClass(String name){
        this.name = name;
    }

    public double getR() {
        return R;
    }

    public void setR(double R) {
        this.R = R;
    }

    public void setName(String name){
        this.name=name;
    }

    public double area(){
        return (Math.PI * Math.pow(R,2));
    }

    public double perimeter(){
        return (Math.PI * 2 * R);
    }

    public String getName(){
        return name;
    }
}
