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

public class SPLTestSelectionSystem_VendingMachine {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_VendingMachine(){
		outFile = new File("result.txt");
		conformanceSource = new File("C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/ContainmentChecker/source.txt");
		try {
			writer = new BufferedWriter(new FileWriter(outFile));
			containmentWriter = new BufferedWriter(new FileWriter(conformanceSource));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		affectedProducts = new HashSet<String>();
	}

	public static void main(String args[]) throws IOException{
		SPLTestSelectionSystem_VendingMachine system = new SPLTestSelectionSystem_VendingMachine();
		system.start(args);	
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public void start(String args[]) throws IOException{
		long st = System.currentTimeMillis();

		//code partitioning
		codePartitionTable = CodePartitioner.start(args[Constants.PRODUCT_CODE_FILE_INDEX]);


		//TCs partitioning
		testCasesPartitionTable = TestCasesPartitioner.start(args[Constants.TESTCASE_FILE_INDEX]);

		long et1 = System.currentTimeMillis();
		System.out.println("Partition: " + (et1 - st)+" ms");
		st = System.currentTimeMillis();
		
		//set impacted classes
		impactedClassList = ImpactedClasses.getImpactedClasses(args[Constants.IMPACTED_CLASSES_FILE_INDEX]);

		//print details
		CodePartitioner.printTable();
		TestCasesPartitioner.printTable();
		ImpactedClasses.printImpactedClassList();		

		//get impacted test suite id
//		impactedTestSuiteId = this.getImpactedTestSuite();


		HashMap<String, HashSet<String>> testCases = TestCasesPartitioner.getTestCases();
		int sizeOfTCs_naive = 0;
		HashSet<String> affectedTCs = new HashSet<String>();

		//		affectedProducts.clear();
		//		affectedProducts.add("Prop4J-P1");
		//		affectedProducts.add("Prop4J-P2");

		for(String p : affectedProducts){
			sizeOfTCs_naive += testCases.get(p).size();		//the number of TCs of naive approach
			affectedTCs.addAll(testCases.get(p));			//execution count of naive approach	
		}
		System.out.println("==== "+affectedTCs.size()/64.0);

		HashSet<String> result = new HashSet<String>();

		try{
			//Test case selection
			writer.write("\r\n--\r\n");
			writer.write("<Impacted Test Suite>\r\n");

			/*int executionNumber = 0;
			for(HashSet<String> space : impactedTestSuiteId){
				HashSet<String> impactedTCs = testCasesPartitionTable.get(space);
				if(impactedTCs != null){
					result.addAll(impactedTCs);

					String spaceOnSetFormat = space.toString().replace("[", "{").replace("]", "}");
					writer.write("TS(" + spaceOnSetFormat + ") "+ impactedTCs.size() +"= " + impactedTCs + "\r\n");
					executionNumber = executionNumber + (impactedTCs.size() * space.size());
				}
			}*/


			writer.write("\r\n--\r\n");
			writer.write("<Selection Result>" + result.size() +"\r\n" + result.toString() + "\r\n");

			System.out.println("result.txt is created");
			System.out.println("--");
			System.out.println("The number of selected TCs: "+ result.size() + "(" + affectedTCs.size() + ")");
		//	System.out.println("The number of executions: "+ executionNumber + "(" + sizeOfTCs_naive + ")");


			//			containmentWriter.write(result.toString().replace("[", "").replace("]", ""));

			writer.close();
			//			containmentWriter.close();

			ArrayList<String[]> listString = new ArrayList<String[]>(); 
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\VendingMachineV1_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\VendingMachineV1_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\VendingMachineV1_P3 CoverageInfo_c.txt");
			File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\VendingMachineV1_P4 CoverageInfo_c.txt");

			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));
				data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			/* only common mutations */
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine"});
			
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{""});
			
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{""});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{"Currency"});
			
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{""});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"VendingMachine", "Currency"});
			
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{""});
			listString.add(new String[]{""});
			listString.add(new String[]{"Currency"});
			listString.add(new String[]{"VendingMachine"});
			listString.add(new String[]{""});
			listString.add(new String[]{"VendingMachine", "Currency"});
			listString.add(new String[]{"Currency"});

			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
		
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,5,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,5,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1, 		7))));
			
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(			7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,5,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(			7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,5,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5, 		7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(			7))));
			
			String TC = null;
			HashSet<String> allTestMethods = new HashSet<String>();
			
			
			for(HashSet<String> key : testCasesPartitionTable.keySet()){
				allTestMethods.addAll(testCasesPartitionTable.get(key));
			}
			
			Iterator<HashSet<HashSet<String>>> it = variablePartChanges.iterator();
			HashSet<String> selTestClasses = new HashSet<String>(); 
			for(String[] changedMethods : listString){
				
				for(List<String> d : data){
					for(String s : d){
						if(s.contains("_ESTest")){
							TC = s;
						}else{
							for(String str : changedMethods){
								String tmp = s.substring(s.lastIndexOf(".")+1);
								if(tmp.equals(str)){
									selTestClasses.add(TC);
								}
							}
						}
					}
				}
				for(String tcMethod : allTestMethods){
					for(String selClass : selTestClasses){
						if(tcMethod.contains(selClass)){
							result.add(tcMethod);
						}
					}
				}
				if(it.hasNext()){
					HashSet<HashSet<String>> next = it.next();
					for(HashSet<String> space : next){
						HashSet<String> impactedTCs = testCasesPartitionTable.get(space);
						if(impactedTCs != null){
							result.addAll(impactedTCs);
						}
					}
				}
				System.out.println(result.size());
				//			System.out.println("fianl execution umber: " + executionNumber);
				
	
				selTestClasses.clear();
				result.clear();
			}

			

		}catch(Exception e){
			e.printStackTrace();
		}
		long et2 = System.currentTimeMillis();
		System.out.println("Selection: " + (et2 - st)+" ms");
	}

	public HashSet<HashSet<String>> getImpactedTestSuite(){
		HashSet<HashSet<String>> impactedTestSuiteId = new HashSet<HashSet<String>>(); 

		try{
			writer.write("\r\n--\r\n");
			writer.write("<Affected Space>\r\n");

			for(String s : impactedClassList){
				if(s.equals("")){
					continue;
				}
				Iterator<HashSet<String>> iterator = codePartitionTable.keySet().iterator();

				while (iterator.hasNext()) { 
					HashSet<String> key = (HashSet<String>)iterator.next();

					if(codePartitionTable.get(key).contains(s)){
						affectedProducts.addAll(key);
				
						//POWERSET !!
						//						impactedTestSuiteId.addAll(Util.powerSet(key));

						String spaceOnSetFormat = key.toString().replace("[", "{").replace("]", "}");
						writer.write("Space(" + spaceOnSetFormat + ") - by " + s + "\r\n");
						break;
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return impactedTestSuiteId;
	}

	public HashSet<HashSet<String>> func(ArrayList<Integer> list){
		HashSet<HashSet<String>> ret = new HashSet<HashSet<String>>();

		//for V0
		for(Integer i: list){
			if(i == 1){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P2","VendingMachine_P4"))));
			}
			else if(i == 2){
				
			}
			else if(i == 3){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P2","VendingMachine_P3","VendingMachine_P4"))));
			}
			else if(i == 4){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P2", "VendingMachine_P3"))));
			}
			else if(i == 5){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P1", "VendingMachine_P4"))));
			}
			else if(i == 6){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P1", "VendingMachine_P3"))));
			}
			else if(i == 7){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachine_P1"))));
			}
		}
		
		//for V1
		for(Integer i: list){
			if(i == 1){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P2","VendingMachineV1_P4"))));
			}
			else if(i == 2){
				
			}
			else if(i == 3){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P2","VendingMachineV1_P3","VendingMachineV1_P4"))));
			}
			else if(i == 4){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P2", "VendingMachineV1_P3"))));
			}
			else if(i == 5){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P1", "VendingMachineV1_P4"))));
			}
			else if(i == 6){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P1", "VendingMachineV1_P3"))));
			}
			else if(i == 7){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("VendingMachineV1_P1"))));
			}
		}

		return ret;
	}

}