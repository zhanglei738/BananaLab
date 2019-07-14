package homework.sweet.session1;

import java.util.Arrays;

public class BuyWatermelon {
    public static void main(String[] args) {
        int[] testNum1 = {-2,0,2,30,51,100};
//        int[] testNum2 = {};
//        int[] testNum3 = new int[10];

        int[] resultArray1 = sell(testNum1);
        System.out.println(Arrays.toString(resultArray1));
    }

    public static int[] sell(int[] buyNum){
        int count = 0;
        if (buyNum.length == 0) return new int[0];
        if (buyNum == null) return new int[0];

        for (int i = 0; i < buyNum.length; i++) {
            int currentNum = buyNum[i];
            int tmpResult = 0;
            try {
               tmpResult = sell0(currentNum);
            } catch (Exception e) {
                tmpResult = 0;
                e.printStackTrace();
            }
            buyNum[i] = tmpResult;
            count += tmpResult;
        }

        System.out.println("testNum1 一共卖出：" + count + " 个西瓜。");
        return  buyNum;
    }

    public static int sell0(int tmp) throws Exception{
        if (tmp < 0){
            throw new Exception("数量不合格");
        }
        if (tmp > 50) {
            tmp = 50;
        }
        return tmp;
    }
}
