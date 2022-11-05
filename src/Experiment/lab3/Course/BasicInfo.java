package Experiment.lab3.Course;

/**
 * @author 翟俊华
 * @create 2022.3.1
 */
public class BasicInfo {
    String Course_number;
    String Course_name;
    int credits;

    BasicInfo(){}

    BasicInfo(String course_number, String course_name, int credits){
        this.Course_name=course_name;
        this.Course_number=course_number;
        this.credits=credits;
    }

    public String getCourse_number() {
        return Course_number;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourse_name() {
        return Course_name;
    }

    public void setCourse_number(String course_number){
        this.Course_number=course_number;
    }

    public void setCourse_name(String course_name) {
        Course_name = course_name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int CalClassHours(){
        return credits * 16;
    }
}
