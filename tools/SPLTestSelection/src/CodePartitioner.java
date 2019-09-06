import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class CodePartitioner {
	private static HashMap<String, HashSet<String>> products;
	private static HashMap<HashSet<String>, HashSet<String>> codePartitionTable = new HashMap<HashSet<String>, HashSet<String>>();
	
	public static HashMap<HashSet<String>, HashSet<String>> start(String codeFilePath){
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
		return codePartitionTable;
	}
	
	public static HashMap<String, HashSet<String>> getCodeElements(String codeFilePath){
		HashMap<String, HashSet<String>> code = new HashMap<String, HashSet<String>>();
		System.out.println("reading and parsing -- " + codeFilePath);
		
		try{
			File codeElementFile = new File(codeFilePath);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(codeElementFile);
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("Product");
			for(int i = 0; i < list.getLength() ; i ++){
				   Element element = (Element) list.item(i);
				   String csvProductName = getTagValue("name",element);
				   String csvElement = getTagValue("Code",element);
				   csvProductName = csvProductName.replace(" ", "");
				   csvElement = csvElement.replace(" ", "");
				   HashSet<String> codeElement = new HashSet<String>(Arrays.asList(csvElement.split(",")));
				   
				   code.put(csvProductName, codeElement);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return code;
	}
	
	private static String getTagValue(String tagName, Element element){
		  NodeList nodeList = element.getElementsByTagName(tagName).item(0).getChildNodes();
		  Node node = nodeList.item(0);
		  return node.getNodeValue();
	}
	
	public static void printTable(){
		try{
			SPLTestSelectionSystem_Wiper.writer.write("<Code Partition Table>\r\n");
			Util.printHashMap(codePartitionTable, "Space");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}