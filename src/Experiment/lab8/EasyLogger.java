package Experiment.lab8;

import java.util.logging.Logger;

/**
 * @author 翟俊华
 * @version 2022.3.1
 */
public class EasyLogger {
    public static void main(String[] args) {
        Logger.getGlobal().info("您执行了从1加到100的操作， 结果是：" + cumulative(100)  );
    }
    public static int cumulative(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            result += i;
        }
        return result;
    }
}
