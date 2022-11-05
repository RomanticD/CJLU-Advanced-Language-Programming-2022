package Experiment.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 2022.3.1
 * @author 翟俊华
 */
public class ArrayExercise {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("请输入数组大小：");
        Scanner sizeScanner = new Scanner(System.in);
        int size = sizeScanner.nextInt();
        System.out.println("请输入" + size + "个整数： ");
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("请输入数组的第" + i + "个数： ");
            Scanner arrayScanner = new Scanner(System.in);
            array[i] = arrayScanner.nextInt();
        }

        Arrays.sort(array);//对数组进行排序
        File file = new File("D:\\JavaDocuments\\myTest.txt");//文件路径
        PrintWriter out = new PrintWriter(file);
        for(int member:array){
            System.out.print(member + ", ");//将排序结果打印到屏幕
            out.print(member + " ");//写入文件
            out.flush();
        }
    }
}
