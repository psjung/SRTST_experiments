package org.test1.maven;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class countNumOfCommonClasses {
	static HashSet<String> whole = new HashSet<String>();
	static HashSet<String> src = new HashSet<String>();
	static LinkedHashSet<String> dst = new LinkedHashSet<String>();
	
	public static void main(String args[]) throws FileNotFoundException, IOException{
		
		long st = System.currentTimeMillis();
		
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P1\\bin");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P2\\bin");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P3\\bin");
		getCommonClasses(src, d3);
		dst.clear();
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P4\\bin");
		getCommonClasses(src, d4);
		dst.clear();
		*/
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P1\\bin");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P2\\bin");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P3\\bin");
		getCommonClasses(src, d3);
		dst.clear();
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P4\\bin");
		getCommonClasses(src, d4);
		dst.clear();
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P5\\bin");
		getCommonClasses(src, d5);
		dst.clear();*/
		
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P1\\bin");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P2\\bin");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P3\\bin");
		getCommonClasses(src, d3);
		dst.clear();
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P4\\bin");
		getCommonClasses(src, d4);
		dst.clear();
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro_P5\\bin");
		getCommonClasses(src, d5);
		dst.clear();
		File d6 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro_P6\\bin");
		getCommonClasses(src, d6);
		dst.clear();*/
		
		
	/*	File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler3_P1\\bin");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler3_P2\\bin");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler3_P3\\bin");
		getCommonClasses(src, d3);
		dst.clear();
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P4\\bin");
		getCommonClasses(src, d4);
		dst.clear();
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P5\\bin");
		getCommonClasses(src, d5);
		dst.clear();*/
		
		
		/*
		File d1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P1\\bin");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P2\\bin");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P3\\bin");
		getCommonClasses(src, d3);
		dst.clear();
		File d4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P4\\bin");
		getCommonClasses(src, d4);
		dst.clear();
		File d5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P5\\bin");
		getCommonClasses(src, d5);
		dst.clear();*/
		 
		File d1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB3_P1\\bin\\com");
		getFiles(d1);
		src = (HashSet<String>) dst.clone();
		dst.clear();
		
		File d2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB3_P2\\bin\\com");
		getCommonClasses(src, d2);
		dst.clear();
		File d3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB3_P3\\bin\\com");
		getCommonClasses(src, d3);
		dst.clear();
//		File d4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB_P4\\bin\\com");
//		getCommonClasses(src, d4);
//		dst.clear();
//		File d5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB_P5\\bin\\com");
//		getCommonClasses(src, d5);
//		dst.clear();
//		File d6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P6\\bin\\com");
//		getCommonClasses(src, d6);
//		dst.clear();
//		File d7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P7\\bin\\com");
//		getCommonClasses(src, d7);
//		dst.clear();
//		File d8 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P8\\bin\\com");
//		getCommonClasses(src, d8);
//		dst.clear();
//		File d9 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P9\\bin\\com");
//		getCommonClasses(src, d9);
//		dst.clear();
//		File d10 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P10\\bin\\com");
//		getCommonClasses(src, d10);
//		dst.clear();
//		File d11 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P11\\bin\\com");
//		getCommonClasses(src, d11);
//		dst.clear();
//		File d12 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P12\\bin\\com");
//		getCommonClasses(src, d12);
//		dst.clear();
//		File d13 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P13\\bin\\com");
//		getCommonClasses(src, d13);
//		dst.clear();
//		File d14 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P14\\bin\\com");
//		getCommonClasses(src, d14);
//		dst.clear();
		
		

		System.out.println("whole classes: "+ whole.size());
		System.out.println("common classes: "+ src.size());
		for(String common : src){
			System.out.print(common.split("[.]")[0] + ", ");
		}
	}

	public static void getFiles(File file) throws FileNotFoundException, IOException{
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				getFiles(f);
			}
		}
		else if(file.getAbsolutePath().contains(".class") && !file.getName().contains("ESTest")){
			whole.add(file.getName());
			dst.add(file.getName());
		}
	}
	
	public static void getCommonClasses(HashSet<String> src, File f) throws FileNotFoundException, IOException{
		getFiles(f);
		HashSet<String> tmp = new HashSet<String>();
		for(String to : src){
			if(!dst.contains(to)){
				tmp.add(to);				
			}
		}
		src.removeAll(tmp);
	}
}