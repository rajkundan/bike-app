package com.savan.bike.test;

public class EvenThread extends Thread{

	private EvenOdd obj;
	public EvenThread(EvenOdd obj) {
		this.obj=obj;
	}
	@Override
	public void run() {
		obj.generateEvenNumber();
	}

}


