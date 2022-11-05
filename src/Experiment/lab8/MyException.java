package Experiment.lab8;

public class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }

    static int Multiply(int n, int m) throws MyException {
        int re;
        re = m * n;
        if (re > 1000) throw new MyException("m * n 的结果 re = " + re + " ，超过了1000！");
        return re;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Multiply(100, 20));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
