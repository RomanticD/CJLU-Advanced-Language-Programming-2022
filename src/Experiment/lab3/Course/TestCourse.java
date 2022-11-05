package Experiment.lab3.Course;

import java.util.Scanner;

/**
 * @author 翟俊华
 * @create 2022.3.1
 */
public class TestCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("课程编号: ");
        String courseNumber = scanner.nextLine();

        System.out.print("课程名称: ");
        String courseName = scanner.nextLine();

        System.out.print("课程学分： ");
        int courseCredit = scanner.nextInt();

        BasicInfo NewCourse = new BasicInfo(courseNumber, courseName, courseCredit);
        System.out.println("该课程的名称是： " + NewCourse.getCourse_name());
        System.out.println("该课程的编号是： " + NewCourse.getCourse_number());
        System.out.println("该课程的学分是： " + NewCourse.getCredits());
        System.out.println("该课程的学时数是： " + NewCourse.CalClassHours());
    }
}
