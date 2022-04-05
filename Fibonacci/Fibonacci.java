package com.valerio.cursojava.Fibonacci;

public class Fibonacci {
	static int first = 1;
	static int second = 1;
	static int next;

	public static void main(String[] args) {

		System.out.println(first);
		System.out.println(second);

		while (next < 50) {
			next = first + second;
			first = second;
			second = next;
			System.out.println(next);
		}
	}
}
