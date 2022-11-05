package Experiment.lab1;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class MyTrianglePrinter {
    public static void main(String[] args) {
        System.out.println("Enter a number for n： ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("*");
        System.out.println();
        }
    }
}
