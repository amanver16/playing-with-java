package com.aman.solid.dancing;

public class DancingApp {

	public static void main(String[] args) {
		
		Dancer dancer = new Dancer();
		System.out.println("Dancer is saying : ");
		System.out.println(dancer.eat());
		System.out.println(dancer.dance());

		NonDancer nonDancer = new NonDancer();
		System.out.println("Non Dancer is saying : ");
		System.out.println(nonDancer.eat());
		System.out.println(nonDancer.dontDance());

	}
}
