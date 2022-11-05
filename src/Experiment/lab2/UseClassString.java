package Experiment.lab2;

/**
 * @version 2022.3.1
 * @author 翟俊华
 */
public class UseClassString {
    public static void main(String[] args) {
        String strIm = new String(" I am a student. I like Java Language! ");

        System.out.println("*该字符串长度为： "+strIm.length());
        System.out.println();

        System.out.println("*第一个字符是： "+ strIm.subSequence(0,1));
        System.out.println();

        System.out.println("*最后一个字符是： "+ strIm.subSequence(strIm.length()-1,strIm.length()));
        System.out.println();

        System.out.println("*字符串 student 的位置是： " + strIm.indexOf("student"));
        System.out.println();

        System.out.print("*去掉strIm字符串开始和结尾的空格： ");
        System.out.println(strIm.trim());
        System.out.println();

        System.out.println("*打印2-5位置的子串： " + strIm.substring(2,5));
        System.out.println();

        System.out.println("*调用spilt方法: ");
        String[] afterSpilt = strIm.split(" ");
        int i=0;
        for (String s :afterSpilt){
            System.out.println("索引" + i +"： " + s);
            i++;
        }
        System.out.println();

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("*使用StringBuilder类: ");
        for(String s:afterSpilt){

            stringBuilder.append(s);
        }
        String AfterStringBuilder = stringBuilder.toString();
        System.out.println("StringBuilder的字符串为： " + AfterStringBuilder);
        System.out.println();

        System.out.println("*全部转为大写后输出： "+ strIm.toUpperCase());
    }
}
