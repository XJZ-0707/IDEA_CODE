package com.day16.java2;

public class ReturnExceptionDemo {
	static void methodA() {
		try {
			System.out.println("进入方法A");// 1
			throw new RuntimeException("制造异常"); // 3
		} finally {
			System.out.println("用A方法的finally");// 2
		}
	}

	static void methodB() {
		try {
			System.out.println("进入方法B"); //4
			return;
		} finally {
			System.out.println("调用B方法的finally");//5
		}
	}

	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		methodB();
	}
}
