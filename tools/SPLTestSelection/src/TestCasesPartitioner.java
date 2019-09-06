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

public class TestCasesPartitioner {
	private static HashMap<String, HashSet<String>> testCases;
	private static HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable = new HashMap<HashSet<String>, HashSet<String>>();

	public static HashMap<HashSet<String>, HashSet<String>> start(String TCsFilePath){
		testCases = new HashMap<String, HashSet<String>>();

		// get product name (key) - TCs (values) pair 
		testCases = getTestCases(TCsFilePath);
		
		HashSet<String> allTCs = new HashSet<String>();
		Iterator<String> iterator = testCases.keySet().iterator();
		
		// get all test cases (ready for getting TCs partition table)
		int allExecutionsNumber = 0;
		while (iterator.hasNext()) { 
			String key = (String)iterator.next();
			allTCs.addAll(testCases.get(key));
			allExecutionsNumber += testCases.get(key).size();
			System.out.println("Size of TCs for " + key + " = " + testCases.get(key).size());
		}
		System.out.println("allTCs size (domain TCs) = " + allTCs.size());
		System.out.println("allExecution number = " + allExecutionsNumber);

		//get test cases partition table
		for(String c : allTCs){
			iterator = testCases.keySet().iterator();
			HashSet<String> s = new HashSet<String>();

			while (iterator.hasNext()) { 
				String key = (String)iterator.next();

				if(testCases.get(key).contains(c)){
					s.add(key);
				}
			}
			HashSet<String> temp = testCasesPartitionTable.get(s);
			if(temp == null){
				temp = new HashSet<String>();
			}
			temp.add(c);
			testCasesPartitionTable.put(s, temp);
		}
		
		return testCasesPartitionTable;
	}
	
	public static HashMap<String, HashSet<String>> getTestCases(String TCsFilePath){
		HashMap<String, HashSet<String>> testCases = new HashMap<String, HashSet<String>>();
		System.out.println("reading and parsing -- " + TCsFilePath);
		
		try{
			File TCsFile = new File(TCsFilePath);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(TCsFile);
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("Product");
			for(int i = 0; i < list.getLength() ; i ++){
				   Element element = (Element) list.item(i);
				   String csvProductName = getTagValue("name",element);
				   String csvTCs = getTagValue("TestCases",element);
				   csvProductName = csvProductName.replace(" ", "");
				   csvTCs = csvTCs.replace(" ", "");
				   HashSet<String> TCs = new HashSet<String>(Arrays.asList(csvTCs.split(",")));
				   
				   testCases.put(csvProductName, TCs);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return testCases;
	}
	
	private static String getTagValue(String tagName, Element element){
		  NodeList nodeList = element.getElementsByTagName(tagName).item(0).getChildNodes();
		  Node node = nodeList.item(0);
		  return node.getNodeValue();
	}
	
	public static HashMap<String, HashSet<String>> getTestCases(){
		return testCases;
	}
	
	public static void printTable(){
		
		try{
			SPLTestSelectionSystem_Wiper.writer.write("\r\n--\r\n");
			SPLTestSelectionSystem_Wiper.writer.write("<TCs Partition Table>\r\n");
			Util.printHashMap(testCasesPartitionTable, "TS");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}