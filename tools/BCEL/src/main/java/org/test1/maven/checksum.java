package org.test1.maven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;

public class checksum {

	public static void main(String args[]) throws FileNotFoundException, IOException{
		long st = System.currentTimeMillis();
		
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P1\\bin");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P2\\bin");
		checksumCompare(d2);
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P3\\bin");
		checksumCompare(d3);
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MobileMedia_P4\\bin");
		checksumCompare(d4);*/
		
	/*	File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P1\\bin");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P2\\bin");
		checksumCompare(d2);
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P3\\bin");
		checksumCompare(d3);
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P4\\bin");
		checksumCompare(d4);
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\MRR_P5\\bin");
		checksumCompare(d5);*/
		
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P1\\bin");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P2\\bin");
		checksumCompare(d2);
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P3\\bin");
		checksumCompare(d3);
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro4_P4\\bin");
		checksumCompare(d4);
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro_P5\\bin");
		checksumCompare(d5);
		File d6 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Lampiro_P6\\bin");
		checksumCompare(d6);
		*/
		/*File d1 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P1\\bin");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P2\\bin");
		checksumCompare(d2);
		File d3 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P3\\bin");
		checksumCompare(d3);
		File d4 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P4\\bin");
		checksumCompare(d4);
		File d5 = new File("C:\\Users\\soo\\Downloads\\eclipse-java-mars-2-win32-x86_64\\Prevayler_P5\\bin");
		checksumCompare(d5);*/
		
		File d1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P1\\bin\\com");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P2\\bin\\com");
		checksumCompare(d2);
//		File d3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P3\\bin\\com");
//		checksumCompare(d3);
//		File d4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P4\\bin\\com");
//		checksumCompare(d4);
//		File d5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P5\\bin\\com");
//		checksumCompare(d5);
//		File d6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P6\\bin\\com");
//		checksumCompare(d6);
//		File d7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P7\\bin\\com");
//		checksumCompare(d7);
//		File d8 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P8\\bin\\com");
//		checksumCompare(d8);
//		File d9 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P9\\bin\\com");
//		checksumCompare(d9);
//		File d10 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P10\\bin\\com");
//		checksumCompare(d10);
//		File d11 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P11\\bin\\com");
//		checksumCompare(d11);
//		File d12 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P12\\bin\\com");
//		checksumCompare(d12);
//		File d13 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P13\\bin\\com");
//		checksumCompare(d13);
//		File d14 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB14_P14\\bin\\com");
//		checksumCompare(d14);
		
		/*
		File d1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P1\\bin");
		checksumCompare(d1);
		File d2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P2\\bin");
		checksumCompare(d2);
		File d3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P3\\bin");
		checksumCompare(d3);
		File d4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P4\\bin");
		checksumCompare(d4);
		File d5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\TankWar_P5\\bin");
		checksumCompare(d5);
		*/
		
		
		long et1 = System.currentTimeMillis();
		System.out.println("checksum: " + (et1 - st)+" ms");
	}

	public static void checksumCompare(File file) throws FileNotFoundException, IOException{
		if(file.isDirectory()) {
			for(File f : file.listFiles()) {
				checksumCompare(f);
			}
		}
		
		if(!file.getPath().contains("ESTest") && file.getPath().contains(".class")){
	//		if(file.getPath().contains("demo"))
	//			System.out.print(file.getName().substring(0,file.getName().indexOf(".")) + ",");
			String checksum1 = DigestUtils.md5Hex(IOUtils.toByteArray(new FileInputStream(file)));
			String checksum2 = DigestUtils.md5Hex(IOUtils.toByteArray(new FileInputStream(file)));
			if(!checksum1.equals(checksum2)){
				System.out.println("aaa");
			}
		}
	}
}