package com.littlewhite.lab.lab1.xb;

import org.junit.Test;

public class demo extends com.littlewhite.lab.lab1.CalculateSum{


	@Override
	public long sum(Integer... numbers){
		return numbers.length;
	}

	@Test
	public void myTest(){
		demo demo = new demo();
		super.test(demo);
	}

}
