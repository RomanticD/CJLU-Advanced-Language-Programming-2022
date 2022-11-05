package Experiment.lab4;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class Student {
    public static void main(String[] args) {
        init();
    }

    private String stuNum;
    private String stuName;
    private int stuAge;
    private static int total;

    //初始化块
    {
        stuNum = "s000";
        stuName = "我是谁";
        stuAge = 22;
        total = 40;
    }

    public Student(){}
    
    public Student(String num, String name, int age){
        stuNum = num;
        stuName = name;
        stuAge = age;
    }

    //添加的两个方法
    public void changeValue(int stuAge){stuAge = 111;}
    public void changeValue(Student s){s.stuAge = 222;}

    public static void PrintStuIfo(Student stu) {
        System.out.println(stu.stuName + " 学生的学号为：" + stu.getStuNum());
        System.out.println(stu.stuName + " 学生的姓名为：" + stu.getStuName());
        System.out.println(stu.stuName + " 学生的年龄为：" + stu.getStuAge());
        System.out.println(stu.stuName + "班的班级总人数为： " + getTotal());
        System.out.println();
    }

    public static void callByClassAndName() {
        System.out.println("用 类名.方法 输出班级总人数为： " + Student.getTotal());
        System.out.println();
    }

    public static void valueOfAge(Student stuToBeChanged, Student stuChangedTo, int newAge, int type) {
        if (type == 1){
            System.out.println("调用了changeValue(int stuAge)方法，改变" + stuToBeChanged.getStuName() + "的年龄");
            stuToBeChanged.changeValue(newAge);

            if(stuToBeChanged.getStuAge() == 20)
                System.out.println("newAge的值仍是20");
            else
                System.out.println("newAge的值不是20！");
            System.out.println();
        }
        if (type == 2){
            System.out.println("调用了changeValue(student s)方法，改变" + stuToBeChanged.getStuName() + "的年龄");
            stuToBeChanged.changeValue(stuChangedTo);

            if(stuToBeChanged.getStuAge() == 222)
                System.out.println("st2.StuAge不是50！" + "st2.StuAge现在等于 " + stuToBeChanged.getStuAge());
            else
                System.out.println("st2.StuAge仍是50!");
            System.out.println();
        }
    }

    public static void init(){
        Student st1 = new Student("s001", "孙悟空", 500);
        setTotal(40);
        PrintStuIfo(st1);

        Student st2 = new Student("s002", "唐僧", 50);
        setTotal(35);
        PrintStuIfo(st2);

        //再次输出st1的相关信息
        PrintStuIfo(st1);

        //用 类名.方法 输出班级总人数
        callByClassAndName();

        //声明一个int newAge = 20,调用changeValue方法,把newAge当作参数传入，再打印输出这个newAge, 看看值是不是原来的20
        int newAge = 20;
        valueOfAge(st1, null, newAge, 1);
        valueOfAge(st1, st2, newAge, 2);

        //调用无参构造创建stu3实例并输出相关信息
        Student stu3 = new Student();
        PrintStuIfo(stu3);
    }

    //班级人数为静态方法，因为班级人数无需通过学生实例调用
    public static void setTotal(int total) {
        Student.total = total;
    }

    public int getStuAge() {
        return stuAge;
    }

    public static int getTotal() {
        return total;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuNum() {
        return stuNum;
    }

}
