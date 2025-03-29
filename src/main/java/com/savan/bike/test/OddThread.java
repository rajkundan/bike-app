package com.savan.bike.test;

public class OddThread extends Thread{

	private EvenOdd obj;
	public OddThread(EvenOdd obj) {
		this.obj=obj;
	}
	
	public void run() {
		obj.generateOddNumber();
	}

}
