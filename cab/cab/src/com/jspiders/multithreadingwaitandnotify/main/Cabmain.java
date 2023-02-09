package com.jspiders.multithreadingwaitandnotify.main;

import com.jspiders.multithreadingwaitandnotify.resource.Cab;
import com.jspiders.multithreadingwaitandnotify.thread.Friends;
import com.jspiders.multithreadingwaitandnotify.thread.Ola;

public class Cabmain {
	public static void main(String[] args) {
		Cab cab=new Cab();
		
		Friends friends=new Friends(cab);
		Ola ola=new Ola(cab);
		
		friends.start();
	    ola.start();
				
	}

}
