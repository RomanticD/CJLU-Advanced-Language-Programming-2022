package Experiment.lab9;

import java.util.*;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] names = {"James", "Tom", "Steven", "Alice"};

        //使用ArrayList
        System.out.println("----使用ArrayList----");
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, names);

        System.out.println("完成后的ArrayList:");
        for (String value : list) System.out.println(value + " ");
        System.out.println();

        //使用迭代器来输出姓名
        System.out.println("使用迭代器来输出姓名:");
        Iterator<String> iterator = list.iterator();//声明一个迭代器，来访问list的内容
        //调用iterator的hasNext（）方法判断Collection是否还包含元素
        while (iterator.hasNext()){
            //调用iterator 的next方法获得下一个元素的引用
            String element = iterator.next();
            System.out.println(element + " ");
            if (Objects.equals(element, "Tom"))//如果是Tom，则删除
                iterator.remove();
        }
        System.out.println();

        list.sort(Comparator.comparingInt(String::length));
        System.out.println("排序后的数据( Tom 已删除)： ");

        //使用for each 循环来输出所有姓名，并验证Tom是否被删除
        for(String element:list){
            System.out.println(element);
        }
        System.out.println();

         //使用LinkedList
        System.out.println("----使用LinkedList----");
        System.out.println();
        
        LinkedList<String> linkedList = new LinkedList();
        Collections.addAll(linkedList, names);

        System.out.println("完成后的LinkedList:");
        for (String s : linkedList) System.out.println(s + " ");
        System.out.println();

        //使用迭代器来输出姓名
        System.out.println("使用迭代器来输出姓名:");
        Iterator<String> LinkedIterator = linkedList.iterator();//声明一个迭代器，来访问list的内容
        //调用LinkedIterator的hasNext（）方法判断Collection是否还包含元素
        while (LinkedIterator.hasNext()){
            //调用LinkedIterator 的next方法获得下一个元素的引用
            String element = LinkedIterator.next();
            System.out.println(element + " ");
            if (Objects.equals(element, "Tom"))//如果是Tom，则从删除
                LinkedIterator.remove();
        }
        System.out.println();

        linkedList.sort(Comparator.comparingInt(String::length));
        System.out.println("排序后的数据( Tom 已删除)： ");

        //使用for each 循环来输出所有姓名，并验证Tom是否被删除
        for(String element:linkedList){
            System.out.println(element);
        }
        System.out.println();

        //使用HashMap
        System.out.println("----使用HashMap----");
        System.out.println();

        Map<String,student> pupil = new HashMap<>();
        initStuInfo(pupil);

        //输出所有学生的信息
        for(Map.Entry<String, student> entry : pupil.entrySet()){
            getStuInfo(entry);
        }
        System.out.println("--------------------");
        System.out.println();
        //移除唐僧
        pupil.remove("15H001");

        Object[] values = pupil.values().toArray();
        for(Object v: values){
            System.out.println(v.toString());//通过重写toString方法输出
            System.out.println();
        }
    }

    public static void getStuInfo(Map.Entry<String, student> entry){
        String key = entry.getKey();
        System.out.println("学生ID: " + key);
        student value = entry.getValue();
        System.out.println("学生姓名： " + value.getStudentName());
        System.out.println("学生年龄： " + value.getStudentAge());
        System.out.println();
    }

    public static void initStuInfo(Map<String,student> pupil){
        student stu1 = new student("15H002", "孙悟空", 2000);
        student stu2 = new student("15H001", "唐僧", 40);
        student stu3 = new student("15H003", "猪八戒", 1000);

        pupil.put(stu1.getStudentID(), stu1);
        pupil.put(stu2.getStudentID(), stu2);
        pupil.put(stu3.getStudentID(), stu3);
    }

    //构造的内部类Student
    static class student{
        private String StudentID;
        private String StudentName;
        private int StudentAge;

        public student(){}

        public student(String num, String name, int age){
            StudentID = num;
            StudentName = name;
            StudentAge = age;
        }
        
        public int getStudentAge() {
            return StudentAge;
        }

        public String getStudentName() {
            return StudentName;
        }

        public String getStudentID() {
            return StudentID;
        }

        //重写的toString方法
        @Override
        public String toString() {
            return "student{" +
                    "StudentID='" + StudentID + '\'' +
                    ", StudentName='" + StudentName + '\'' +
                    ", StudentAge=" + StudentAge +
                    '}';
        }
    }
}
