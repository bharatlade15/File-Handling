package com.jspiders.filehandaling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {
public static void main(String[] args) {
	File file=new File("Hello.txt");
	if (file.exists()) {
		System.out.println("The file already exits.");
	} else {
		try {
			file.createNewFile();
			System.out.println("File Created");
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}
	}
	
}
}
