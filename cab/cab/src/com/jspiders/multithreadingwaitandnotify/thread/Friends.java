package com.jspiders.multithreadingwaitandnotify.thread;

import com.jspiders.multithreadingwaitandnotify.resource.Cab;

public class Friends extends Thread{
	private Cab cab;
	public Friends(Cab cab) {
		this.cab=cab;
	}
	
	public void run(){
		cab.bookcab(5);
		
	}

}
