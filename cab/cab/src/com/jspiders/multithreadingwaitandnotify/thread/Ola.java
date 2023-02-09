package com.jspiders.multithreadingwaitandnotify.thread;

import com.jspiders.multithreadingwaitandnotify.resource.Cab;

public class Ola extends Thread {
	private Cab cab;
	
public Ola(Cab cab) {
	this.cab=cab;
	
}


public void run() {
	cab.searchcab(5);
}

}
