package com.jspiders.filehandaling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {
public static void main(String[] args) {
	File file=new File("CharStream.txt");
	if (file.exists()) {
		try {
			FileReader fileReader=new FileReader(file);
			System.out.println("reading data from file.");
			System.out.println("read() : "+fileReader.read());
			
			Scanner scanner=new Scanner(file);
			System.out.println("scanner output.");
			
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
				
			}
			scanner.close();
			fileReader.close();
		}
		 catch (FileNotFoundException e) {
			 System.out.println("file not found.");
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

		
	} else {
		System.out.println("file does not exist.");
	}
}
}
