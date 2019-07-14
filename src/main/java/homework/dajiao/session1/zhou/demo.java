package homework.dajiao.session1.zhou;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        int[] nums = {-1,0,5,60};
        int[] sell = sell(nums);
        System.out.println(Arrays.toString(sell));

    }

    public static int[] sell(int[] buyNum){

        int sum = 0;
        if(buyNum == null)
            return new int[0];
        if (buyNum.length == 0)
            return new int[0];
        for (int i=0; i<buyNum.length; i++){
            int temp = buyNum[i];
            try {
                temp = sell0(temp);
            } catch (Exception e) {
                //e.printStackTrace();
                temp = 0;
            }
            buyNum[i] = temp;
            sum += temp;
        }
        System.out.println("小周总共卖出去" + sum + "个");
        return buyNum;


    }

    private static int sell0(int buyNum) throws Exception {
        if (buyNum < 0){
            throw new Exception("不卖了~");
        }

        if (buyNum > 50){
            return 50;
        }

        return buyNum;
    }
}
