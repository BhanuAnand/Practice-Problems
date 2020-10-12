package com.aditi.multithreading;

public class InterThreadDemo{
	
	public static void main(String[] args) {
		Number num = new Number();
		new OddNumberProducer(num);
		new EvenNumberProducer(num);
	}
	
}

class Number{
	boolean isOddPrinted = false;
	public synchronized void printOddNumber(int num){
		while(isOddPrinted){
			try{ wait(); }catch(Exception e){}
		}
		System.out.println("odd: "+num);
		isOddPrinted = true;
		notify();
	}
	public synchronized void printEvenNumber(int num){
		while(!isOddPrinted){
			try{ wait(); }catch(Exception e){}
		}
		System.out.println("even: "+num);
		isOddPrinted = false;
		notify();
	}
}

class OddNumberProducer implements Runnable{
	Number num;
	public OddNumberProducer(Number num) {
		super();
		this.num = num;
		Thread t = new Thread(this,"OddNumberProducer");
		t.start();
	}
	@Override
	public void run() {
		while(true){
			for(int i=1; i<=10; i++){
				if(i%2!=0){
					num.printOddNumber(i);
					try{ Thread.sleep(1000); }catch(Exception e){}	
				}
			}
		}
	}
}

class EvenNumberProducer implements Runnable{
	Number num;
	public EvenNumberProducer(Number num) {
		super();
		this.num = num;
		Thread t = new Thread(this,"EvenNumberProducer");
		t.start();
	}
	@Override
	public void run() {
		while(true){
			for(int i=1; i<=10; i++){
				if(i%2==0){
					num.printEvenNumber(i);
					try{ Thread.sleep(500); }catch(Exception e){}	
				}
			}
		}
	}
}

