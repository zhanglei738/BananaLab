package com.bigbanana.lab.lab1;

import org.junit.Assert;
import org.junit.Test;

public class CalculateSum {


	/**
	 * 给定一个Integer 数组，计算这个数组的和
	 * @param numbers
	 * @return
	 */
	public static long sum(Integer... numbers){
		return Long.MAX_VALUE;
	}



	@Test
	public void test(){
		Integer[] test1 = null;
		Assert.assertEquals(sum(test1),0L);

		Integer[] test2 = new Integer[2];
		test2[1] = 10;
		Assert.assertEquals(sum(test2),10L);


		Integer[] test3 = new Integer[2];
		test2[0] = Integer.MAX_VALUE;
		test2[1] = 10;
		Assert.assertEquals(sum(test2),Long.valueOf(Integer.MAX_VALUE+10).longValue());








	}


}
