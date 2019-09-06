package org.test1.maven;

import java.io.File;
import java.util.HashSet;

public class IsSameNameOfClasses {
	static HashSet<String> hs = new HashSet<String>();
	
	public static void main(String args[]){
		File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro\\src");
		SameNameOfClasses(d1);
	}
	
	public static void SameNameOfClasses(File file){
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				SameNameOfClasses(f);
			}
		}
		
		if(file.getPath().contains(".java") && !file.getPath().contains(".color")){
			boolean notContained = hs.add(file.getName());
			if(!notContained){
				System.out.println(file.getPath());
			}
		}
	}
}
