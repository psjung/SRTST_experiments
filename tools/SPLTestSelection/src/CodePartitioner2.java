import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class CodePartitioner2 {
	private static HashMap<String, HashSet<String>> products;
	private static HashMap<HashSet<String>, HashSet<String>> codePartitionTable = new HashMap<HashSet<String>, HashSet<String>>();
	
	public static HashMap<HashSet<String>, HashSet<String>> start(String codeFilePath) throws IOException{
		long st = System.currentTimeMillis();
		products = new HashMap<String, HashSet<String>>();
		
		// get product name (key) - classes name (values) pair 
		products = getCodeElements(codeFilePath);
		
		HashSet<String> allClasses = new HashSet<String>();
		Iterator<String> iterator = products.keySet().iterator();
		
		// get all classes (ready for getting code partition table)
		while (iterator.hasNext()) { 
			String key = (String)iterator.next();
			allClasses.addAll(products.get(key));
		}
		
		//get code partition table
		for(String c : allClasses){
			iterator = products.keySet().iterator();
			HashSet<String> s = new HashSet<String>();
			
			while (iterator.hasNext()) { 
				String key = (String)iterator.next();
				
				if(products.get(key).contains(c)){
					s.add(key);
				}
			}
			HashSet<String> temp = codePartitionTable.get(s);
			if(temp == null){
				temp = new HashSet<String>();
			}
			temp.add(c);
			codePartitionTable.put(s, temp);
		}
		long et1 = System.currentTimeMillis();
		System.out.println("Step 1a, 1b: " + (et1 - st)+" ms");
		
		return codePartitionTable;
	}
	
	public static HashMap<String, HashSet<String>> getCodeElements(String codeFilePath) throws IOException{
		HashMap<String, HashSet<String>> code = new HashMap<String, HashSet<String>>();
		System.out.println("reading and parsing -- " + codeFilePath);
		
		File file1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P1.config");
		File file2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P2.config");
		File file3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P3.config");
		File file4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P4.config");
		File file5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P5.config");
		File file6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P6.config");
		File file7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java\\configs\\BerkeleyDB_P7.config");
		
		code.put("BerkeleyDB_P1", new HashSet<String>(Files.readAllLines(Paths.get(file1.getAbsolutePath()))));
		code.put("BerkeleyDB_P2", new HashSet<String>(Files.readAllLines(Paths.get(file2.getAbsolutePath()))));
		code.put("BerkeleyDB_P3", new HashSet<String>(Files.readAllLines(Paths.get(file3.getAbsolutePath()))));
		code.put("BerkeleyDB_P4", new HashSet<String>(Files.readAllLines(Paths.get(file4.getAbsolutePath()))));
		code.put("BerkeleyDB_P5", new HashSet<String>(Files.readAllLines(Paths.get(file5.getAbsolutePath()))));
		code.put("BerkeleyDB_P6", new HashSet<String>(Files.readAllLines(Paths.get(file6.getAbsolutePath()))));
		code.put("BerkeleyDB_P7", new HashSet<String>(Files.readAllLines(Paths.get(file7.getAbsolutePath()))));
		
		return code;
	}
}
