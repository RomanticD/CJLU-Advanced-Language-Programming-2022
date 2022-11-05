package Experiment.lab3;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class UseClassInPackage {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
    }
}
