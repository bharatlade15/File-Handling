package com.jspiders.filehandaling.info;

import java.io.File;

public class FileInfoDemo1 {
public static void main(String[] args) {
	File file=new File("Hello.txt");
	if (file.exists()) {
		System.out.println("File name: "+file.getName());
		
		System.out.println("Absolute path: "+file.getAbsolutePath());
		
		System.out.println("File Length: "+file.length());
		
		if (file.canRead()) {
			System.out.println("File is readable");
		} else {
		System.out.println("file is not readable");
		}
		
		if (file.canWrite()) {
			System.out.println("file is writeble");
		} else {
			System.out.println("file is not writeble");
		}
		
		if (file.canExecute()) {
			System.out.println("file is execuable");
		} else {
			System.out.println("file is not executable");
		}
	} else {
		System.out.println("file does not exist.");
	}
}
}
