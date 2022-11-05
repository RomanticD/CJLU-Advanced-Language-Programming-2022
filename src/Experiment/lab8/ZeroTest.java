package Experiment.lab8;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class ZeroTest {
    public static void main(String[] args) {
        int i1 = 1;
        int i0 = 0;

        try {
            System.out.println(i1 / i0);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("除数为零异常处理: ");
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("处理完毕...");

    }
}

