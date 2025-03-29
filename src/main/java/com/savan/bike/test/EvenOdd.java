package com.savan.bike.test;

public class EvenOdd {
	
	public static int n=10;
	int count=1;

	public void generateEvenNumber() {
		synchronized(this) {
			while(count<n) {
				while(count%2==1) {
					try {
						wait();
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println("even number thread"+ "--"+count);
				count++;
				notify();
			}
		}
	}
	
public void generateOddNumber() {
	synchronized(this) {
		while(count<n) {
			while(count%2==0) {
				try {
					wait();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.println("odd number thread"+ "--"+count);
			count++;
			notify();
		}
	}
	}
public static void main(String[] args) {
	EvenOdd obj=new EvenOdd();
	EvenThread t1 =new EvenThread(obj);
	OddThread t2 =new OddThread(obj);
	t1.start();
	t2.start();
}

}
