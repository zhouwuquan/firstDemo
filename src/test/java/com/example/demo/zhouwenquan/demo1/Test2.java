package com.example.demo.zhouwenquan.demo1;

import java.util.Calendar;

import org.junit.Test;

/**
 * 
 * @author zhouw
 *	date 20180912
 */
public class Test2 {
	
	/**
	 * 设计一个程序，分别计算现在距离你的出生日期的年份，月份和天数
	 */
	@Test
	public void fun01() {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c2.set(1990, 3, 12);
		int year = c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
		int month = c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH);
		int day = c1.get(Calendar.DAY_OF_MONTH) - c2.get(Calendar.DAY_OF_MONTH);
		System.out.println("年："+year+" 月："+month+" 日："+day);
	}
	
	/**
	 * 设计一个程序，计算1-100的和，并输出该计算过程的耗时
	 */
	@Test
	public void fun02() {
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("1-100的和为："+sum);
		System.out.println("耗时为："+(end-start));
	}
}
