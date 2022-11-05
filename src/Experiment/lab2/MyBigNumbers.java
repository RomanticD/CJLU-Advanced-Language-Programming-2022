package Experiment.lab2;

import java.math.BigInteger;

/**
 * @version 2022.3.1
 * @author 翟俊华
 */
public class MyBigNumbers {
    public static void main(String[] args) {
        final int MAX_PER_CLASS = 40;
        System.out.println(MAX_PER_CLASS);
        float before = 18.888f;
        int after = (int) before;
        System.out.println(after);
        BigInteger ant = new BigInteger("12345678901234567890");
        System.out.println(ant.multiply(new BigInteger("123")));
    }
}
