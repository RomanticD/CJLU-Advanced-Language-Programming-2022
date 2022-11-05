package Experiment.lab6;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        launch();
    }

    public static void launch(){
        final int LENGTH = 0;
        final int WIDTH = 1;
        final int HEIGHT = 2;
        final int RECTANGLE = 1;
        final int CUBOID = 2;

        Shape shp;//抽象类不能实例化
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("输入1代表长方形，输入2代表长方体,输入其他退出： ");
            int shapeType = scanner.nextInt();

            if (shapeType == RECTANGLE){
                int[] valueArray = initValue(RECTANGLE);
                shp = new Lab6Rect(valueArray[LENGTH], valueArray[WIDTH]);
                getInfo(shp, shapeType);
            }
            else {
                if (shapeType == CUBOID) {
                    int[] valueArray = initValue(CUBOID);
                    shp = new Lab6Cub(valueArray[LENGTH], valueArray[WIDTH], valueArray[HEIGHT]);
                    getInfo(shp, shapeType);
                }
                else System.exit(0);
            }
        }
    }

    public static int[] initValue(int shapeType) {
        int[] valueArray = new int[0];

        if (shapeType == 2) {
            System.out.println("您选择构造长方体");
            valueArray = new int[3];
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
        }

        if (shapeType == 1) {
            System.out.println("您选择构造长方形");
            valueArray = new int[2];
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入长： ");
            int length = scanner.nextInt();
            System.out.print("请输入宽： ");
            int width = scanner.nextInt();
            valueArray[0] = length;
            valueArray[1] = width;
        }

        return valueArray;
    }

    public static void getInfo(Shape shape, int type) {
        if (type == 1) {
            Lab6Rect lab6Rect = (Lab6Rect) shape;
            System.out.println("长方形的面积是： " + lab6Rect.area());
            System.out.println("长方形的周长是： " + lab6Rect.peri());
            System.out.println();
        }
        else {
            Lab6Cub lab6Cub = (Lab6Cub) shape;
            System.out.println("长方体的周长是： " + lab6Cub.peri());
            System.out.println("长方体的表面积是： " + lab6Cub.area());
            System.out.println();
        }
    }
}
