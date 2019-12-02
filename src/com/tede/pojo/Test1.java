package com.tede.pojo;

public class Test1 {

	public static void main(String[] args) {
		int a = 23;
		int b = 23;
		change(a); // 这里需要注意的就是值传递和引用传递。
		System.out.println(a);
//		System.out.println(b);
		Person p = new Person();
		change(p);
		System.out.println(p);
//		p.setId(1);
//		p.setAge(23);
//		p.setUsername("张安");
	}

	private static void change(Person p) {
		p.setId(1);
		p.setAge(23);
		p.setUsername("张安");
		
		
	}

	public static int change(int a) {
		a = 78;
//		b = 78;
//		int c = a + b;
//		return c;
		return a;
		
	}
}
