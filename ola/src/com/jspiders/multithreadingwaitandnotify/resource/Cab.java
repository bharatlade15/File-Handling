package com.jspiders.multithreadingwaitandnotify.resource;

public class Cab {
int availablecab;
	
	public  synchronized void bookcab(int bookcab) {
		System.out.println("Booking "+ bookcab+" cabs");
		
		
		
		if (bookcab>availablecab) {
			System.out.println(bookcab+" cab is not available");
			System.out.println("please wait another cab is seachring...");
			
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		availablecab-=bookcab;
		System.out.println("booking of "+bookcab+" cabs is booked successful.");
		
	}
	
	public synchronized void searchcab(int searchcab) {
		System.out.println("Searching "+searchcab+" cabs");
		availablecab+=searchcab;
		System.out.println(availablecab+" cabs available");
		this.notify();
		
	}

}
