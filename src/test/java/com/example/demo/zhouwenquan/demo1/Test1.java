package com.example.demo.zhouwenquan.demo1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式应用
 * @author zhouw
 *	20180911
 */
public class Test1 {

	public static void main(String[] args) {
		//zuoye();
		//fun01();
		//fun02();
		
	}
	/**
	 * 找出给定字符串中大写字母的位置
	 */
	public static void zuoye() {
		String str = "Alan-Mathison-Touring";
		String regex = "[A-Z]";//这样写貌似有点问题/^[A-Z]+$/，正则我也不常用
		Pattern p = Pattern.compile(regex);//初始化正则
		Matcher m = p.matcher(str);//寻找匹配上的，封装进Matcher里面
		while(m.find()) {//循环遍历
			System.out.println(m.start());//从头开始输出第几个元素
		}
	}
	
	/**
	 *隐藏电话号码中间四位(方法一)
	 */
	public static void fun01() {
		String s="13687651234";
		String sub1=s.substring(0, 3);
		String sub2=s.substring(7,11);
		System.out.println(sub1+"XXXX"+sub2);
	}
	
	/**
	 * 隐藏电话号码中间四位(方法二)
	 */
	public static void fun02() {
		String tel = "18612349630";
		String newTel = tel.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1XXXX$2");
		System.out.println(newTel);
	}
}
