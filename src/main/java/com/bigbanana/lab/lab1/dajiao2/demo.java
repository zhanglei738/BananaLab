package com.bigbanana.lab.lab1.dajiao2;

import org.junit.Test;

public class demo extends com.bigbanana.lab.lab1.CalculateSum{


	@Override
	public long sum(Integer... numbers){
		return numbers.length+1;
	}

	@Test
	public void myTest(){
		demo demo = new demo();
		super.test(demo);
	}


}
