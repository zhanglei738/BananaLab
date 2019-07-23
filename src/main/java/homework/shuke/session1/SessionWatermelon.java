package homework.shuke.session1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static homework.shuke.session1.Utils.MAX;
import static homework.shuke.session1.Utils.MIN;
import static homework.shuke.session1.Utils.NAME;

/**
 * Created on 2019/7/21 9:41 AM
 *
 * @author shuke
 * @version 0.1
 **/
public class SessionWatermelon {
    private static Logger logger = LoggerFactory.getLogger(SessionWatermelon.class);


    //all sell
    public static int[] sell(int[] buyNum) {
        if (buyNum == null) {
            return new int[0];
        }

        int total = 0;
        int cur;
        int num;

        //售卖计划，遍历数组，调用sell0方法
        int[] sell = new int[buyNum.length];
        for (int i = 0; i < buyNum.length; i++) {
            cur = buyNum[i];
            try {
                num = sell0(cur);
            } catch (Exception e) {
                num = 0;
            }

            sell[i] = num;
            total += num;
        }

        System.out.println(String.format("%s总共卖出去%d个。", NAME, total));
        return sell;
    }

    //sell0
    private static int sell0(int buyNum) throws Exception {
        if (buyNum < MIN) {
            logger.warn("客户想要购买{}个西瓜，现有西瓜库存低于{}", buyNum, MIN);
        }
        if (buyNum > MAX) {
            logger.warn("客户需要购买{}个西瓜，超过当前库存值{}", buyNum, MAX);
            return MAX;
        }
        return buyNum;
    }
    // print Array
    private static void print(int[] arr) {
        //判断arr是否为空 是的话直接return
        if(null==arr){
            System.out.println("无售卖计划");
            return;
        }


        StringBuilder res = new StringBuilder().append('[');
        for (int i = 0; i <arr.length ; i++) {
            res.append(arr[i]).append(",");
        }
        //删除最后一个字符
        res.deleteCharAt(res.length()-1);
        res.append(']');
        System.out.println(res);
    }
    //main
    public static void main(String[] args) {
        int[] arr = {-7, 0, 10, 100};
        int[] sell = sell(arr);
        print(sell);
    }
}