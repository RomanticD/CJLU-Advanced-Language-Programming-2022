package Experiment.lab7;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class RectInLab7 implements ShapeCalc,Cloneable{
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入长： ");
        int length = scanner.nextInt();
        System.out.print("请输入宽： ");
        int width = scanner.nextInt();

        ShapeCalc shapeCalc = new RectInLab7(length, width);//优先使用接口而不是类来引用对象
        getInfo(shapeCalc);

        //调用ShapeCalc引用对象，用clone()方法赋给一个新的对象变量clonedShapeCalc
        //利输出clonedShapeCalc的周长和面积，看看是否和shapeCalc输出的周长和面积一样
        ShapeCalc clonedShapeCalc = ((RectInLab7) shapeCalc).clone();//注意需要强制转换且必须要有括号
        System.out.println("下面是克隆对象后的数据: ");
        getInfo(clonedShapeCalc);

        //比较两个对象的周长和面积是否一样
        System.out.println("下面是比较两个对象的周长和面积是否一样: ");
        System.out.println("shapeCalc.peri() == clonedShapeCalc.peri() : " + (shapeCalc.peri() == clonedShapeCalc.peri()));
        System.out.println("shapeCalc.area() == clonedShapeCalc.area() : " + (shapeCalc.area() == clonedShapeCalc.area()));
    }

    protected int length;
    protected int width;
    protected String name;
    
    RectInLab7() {}

    RectInLab7(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void set(int length, int width){
        this.length = length;
        this.width = width;
    }

    public static void getInfo(ShapeCalc shapeCalc) {
        System.out.println("周长是： " + shapeCalc.peri());
        System.out.println("面积是： " + shapeCalc.area());
        System.out.println();
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    //在上面的基础上添加RectInLab7的clone方法
    public RectInLab7 clone() throws CloneNotSupportedException{
        return (RectInLab7) super.clone();
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double peri() {
        return (length + width) * 2;
    }
}
