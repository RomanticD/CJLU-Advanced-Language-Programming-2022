package Experiment.lab5;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class RectTest {
    public static void main(String[] args) {
        init();
    }

    public static void getInfo(Lab5Cub lab5Cub, String name) {
        System.out.println(name + "的表面积是： " + lab5Cub.area());
        System.out.println(name + "的体积是： " + lab5Cub.vol());
        System.out.println();
    }

    public static void getInfo(Lab5Rect lab5Rect, String name) {
        System.out.println(name + "的表面积是： " + lab5Rect.area());
        System.out.println(name + "的体积是： " + lab5Rect.peri());
        System.out.println();
    }

    public static int[] initValue() {
        int[] valueArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入长： ");
        int length = scanner.nextInt();
        System.out.print("请输入宽： ");
        int width = scanner.nextInt();
        System.out.print("请输入高： ");
        int height = scanner.nextInt();
        valueArray[0] = length;
        valueArray[1] = width;
        valueArray[2] = height;
        return valueArray;
    }

    public static void init(){
        final int LENGTH = 0;
        final int WIDTH = 1;
        final int HEIGHT = 2;
        int[] valueArray = initValue();

        //调用无参构造器构造长方体
        Lab5Cub lab5Cub1 = new Lab5Cub();
        lab5Cub1.set(valueArray[LENGTH], valueArray[WIDTH], valueArray[HEIGHT]);
        getInfo(lab5Cub1,"cub1");


        //调用有参构造器构造长方体
        Lab5Cub lab5Cub2 = new Lab5Cub(valueArray[LENGTH], valueArray[WIDTH], valueArray[HEIGHT]);
        getInfo(lab5Cub2,"cub2");

        System.err.println("尝试求出长方体的周长： " + lab5Cub2.peri() + " (Wrong)");//Wrong
        System.out.println();

        //构造长方形对象
        Lab5Rect rc1 = new Lab5Rect(valueArray[LENGTH], valueArray[WIDTH]);
        getInfo(rc1,"rc1");
    }
}

