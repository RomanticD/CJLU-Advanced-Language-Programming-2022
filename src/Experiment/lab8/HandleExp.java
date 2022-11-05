package Experiment.lab8;

public class HandleExp {
    public static void main(String[] args) {
        String output[] = {"The ", "quick ", "brown ", "fox ", "jumped ", "over ", "the ", "lazy ", "dog."};
        int i = 0;
        while (i < 12) {
            try{
                System.out.print(output[i++]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println();
                System.out.println("下标越界异常处理！");
                System.out.println(e.toString());
                break;
            }finally {
                System.out.println("不管怎样都要执行的语句！");
            }
        }
        System.out.println("haha...");
    }
}
