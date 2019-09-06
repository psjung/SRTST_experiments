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

public class SPLTestSelectionSystem_TankWar {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_TankWar(){
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
		SPLTestSelectionSystem_TankWar system = new SPLTestSelectionSystem_TankWar();
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
		impactedTestSuiteId = this.getImpactedTestSuite();


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

			int executionNumber = 0;
			for(HashSet<String> space : impactedTestSuiteId){
				HashSet<String> impactedTCs = testCasesPartitionTable.get(space);
				if(impactedTCs != null){
					result.addAll(impactedTCs);

					String spaceOnSetFormat = space.toString().replace("[", "{").replace("]", "}");
					writer.write("TS(" + spaceOnSetFormat + ") "+ impactedTCs.size() +"= " + impactedTCs + "\r\n");
					executionNumber = executionNumber + (impactedTCs.size() * space.size());
				}
			}


			writer.write("\r\n--\r\n");
			writer.write("<Selection Result>" + result.size() +"\r\n" + result.toString() + "\r\n");

			System.out.println("result.txt is created");
			System.out.println("--");
			System.out.println("The number of selected TCs: "+ result.size() + "(" + affectedTCs.size() + ")");
			System.out.println("The number of executions: "+ executionNumber + "(" + sizeOfTCs_naive + ")");


			//			containmentWriter.write(result.toString().replace("[", "").replace("]", ""));

			writer.close();
			//			containmentWriter.close();

			ArrayList<String[]> listString = new ArrayList<String[]>(); 
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P3 CoverageInfo_c.txt");
			File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P4 CoverageInfo_c.txt");
			File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P5 CoverageInfo_c.txt");
			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//TankWar_P1 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//TankWar_P2 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//TankWar_P3 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//TankWar_P4 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//TankWar_P5 CoverageInfo.txt
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* TankWar all mutations */
//			listString.add(new String[]{"Menu","GameManager"});
//			listString.add(new String[]{"Wall","Tool", "Maler"});
//			listString.add(new String[]{"KeyMonitor"});
//			listString.add(new String[]{"Menu"});
//			listString.add(new String[]{"ExplodierenEffekt","Maler"});
//			listString.add(new String[]{"MalerZeit","MIDlet"});
//			listString.add(new String[]{"Menu","MIDlet","Missile","Maler"});
//			listString.add(new String[]{"Missile"});
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"KeyMonitor", "Tool"});
//			
//			listString.add(new String[]{"KeyMonitor","Menu","Tool"});	
//			listString.add(new String[]{"Maler","Tool"});
//			listString.add(new String[]{"MapInfo","Tool"});
//			listString.add(new String[]{"Missile","Tank","Maler"});
//			listString.add(new String[]{"Maler","Missile"});
//			listString.add(new String[]{"Menu", "Maler","Tool"});
//			listString.add(new String[]{"KeyMonitor","Tool"});
//			listString.add(new String[]{"Tool","ExplodierenEffekt","Maler"});
//			listString.add(new String[]{"MapInfo","TankManager","Tool"});
//			listString.add(new String[]{"MalerZeit","Tool"});
//			
//			listString.add(new String[]{"Wall","Tool","Maler"});
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"Wall","Tool","ExplodierenEffekt"});
//			listString.add(new String[]{"Maler"});
//			listString.add(new String[]{"MalerZeit","Maler"});
//			listString.add(new String[]{"Menu","MIDlet","Tool"});
//			listString.add(new String[]{"Missile"});
//			listString.add(new String[]{"MapInfo","Tool"});
//			listString.add(new String[]{"Maler","Tool"});
//			listString.add(new String[]{"Tool"});
//			
//			listString.add(new String[]{"Wall","Tool","MIDlet"});
//			listString.add(new String[]{"Missile","Tool","Maler"});
//			listString.add(new String[]{"Maler","Tool"});
//			listString.add(new String[]{"Tool"});
//			listString.add(new String[]{"Maler","Missile","Tool"});
//			listString.add(new String[]{"Wall","Tool","Maler"});
//			listString.add(new String[]{"GameObject","MalerZeit","Maler"});
//			listString.add(new String[]{"Option","Tool"});
//			listString.add(new String[]{"Tank","Missile"});
//			listString.add(new String[]{"Wall","Tool"});
//			
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"KeyMonitor","Maler"});
//			listString.add(new String[]{"Tool","ExplodierenEffekt"});
//			listString.add(new String[]{"Tool","Maler"});
//			listString.add(new String[]{"Maler","Tool"});
//			listString.add(new String[]{"Tool"});
//			listString.add(new String[]{"ExplodierenEffekt", "Tool", "Maler"});
//			listString.add(new String[]{"InfoPanel","KeyMonitor","Missile"});
//			listString.add(new String[]{"Tool","Maler"});
//			listString.add(new String[]{"Menu","Maler"});


			
			/* TankWar only common mutations */
			
//			listString.add(new String[]{"Menu","GameManager"});
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"KeyMonitor"});
//			listString.add(new String[]{"Menu"});
//			listString.add(new String[]{"ExplodierenEffekt"});
//			listString.add(new String[]{"MalerZeit","MIDlet"});
//			listString.add(new String[]{"Menu","MIDlet"});
//			listString.add(new String[]{});
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"KeyMonitor"});
			
//			listString.add(new String[]{"KeyMonitor","Menu"});
//			listString.add(new String[]{});
//			listString.add(new String[]{"MapInfo","Tool"});
//			listString.add(new String[]{"Missile","Tank"});
//			listString.add(new String[]{"Maler","Missile"});
//			listString.add(new String[]{"Menu"});
//			listString.add(new String[]{"KeyMonitor"});
//			listString.add(new String[]{"Tool","ExplodierenEffekt"});
//			listString.add(new String[]{"MapInfo","TankManager","Tool"});
//			listString.add(new String[]{"MalerZeit","Tool"});
			
//			listString.add(new String[]{"Wall","Tool"});			
//			listString.add(new String[]{"Wall","Tool"});
//			listString.add(new String[]{"Wall","Tool","ExplodierenEffekt"});
//			listString.add(new String[]{"Maler"});
//			listString.add(new String[]{"MalerZeit"});
//			listString.add(new String[]{"Menu","MIDlet"});			
//			listString.add(new String[]{"Missile"});
//			listString.add(new String[]{"MapInfo"});
//			listString.add(new String[]{"Maler"});
//			listString.add(new String[]{"KeyMonitor","Menu"});
			
//			listString.add(new String[]{"Wall","Tool","MIDlet"});			
//			listString.add(new String[]{"Missile","Tool"});
//			listString.add(new String[]{});
//			listString.add(new String[]{});
//			listString.add(new String[]{"Maler","Missile"});
//			listString.add(new String[]{"Wall","Tool"});			
//			listString.add(new String[]{"MalerZeit"});
//			listString.add(new String[]{"Option","GameManager"});
//			listString.add(new String[]{"Tank"});
//			listString.add(new String[]{"Wall","Tool"});
			
//			listString.add(new String[]{"Wall","Tool"});			
//			listString.add(new String[]{"KeyMonitor"});
//			listString.add(new String[]{"Tool","ExplodierenEffekt"});
//			listString.add(new String[]{"Tool","Maler"});
//			listString.add(new String[]{});
//			listString.add(new String[]{});
//			listString.add(new String[]{"ExplodierenEffekt"});
//			listString.add(new String[]{"InfoPanel","KeyMonitor"});
//			listString.add(new String[]{"Tool","Maler"});
			listString.add(new String[]{"Menu"});
			


			String TC = null;
			HashSet<String> allTestMethods = new HashSet<String>();
			
			for(HashSet<String> key : testCasesPartitionTable.keySet()){
				allTestMethods.addAll(testCasesPartitionTable.get(key));
			}
			
			HashSet<String> selTestClasses = new HashSet<String>(); 
			for(String[] changedMethods : listString){
				for(List<String> d : data){
					for(String s : d){
						if(s.contains("_ESTest")){
							TC = s;
						}else{
							for(String str : changedMethods){
								if(s.equals(str)){
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
				System.out.println(result.size());
				//			System.out.println("fianl execution umber: " + executionNumber);
				
				/* find products to be instrumented */
				HashSet<HashSet<String>> spaceToBeInstantiation = new HashSet<HashSet<String>>(); 
				for(String str : result){
					for(HashSet<String> key : testCasesPartitionTable.keySet()){
						if(testCasesPartitionTable.get(key).contains(str)){
							spaceToBeInstantiation.add(key);
							break;
						}
					}
				}
				
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P2","TankWar_P3","TankWar_P4","TankWar_P5")));
				for(HashSet<String> hs : hshs){
					HashSet<HashSet<String>> clone = (HashSet<HashSet<String>>) spaceToBeInstantiation.clone();
					HashSet<HashSet<String>> cloneRemove = new HashSet<HashSet<String>>();
					for(String t : hs){
						for(HashSet<String> clonet: clone){
							if(clonet.contains(t)){
								cloneRemove.add(clonet);
							}
						}
						clone.removeAll(cloneRemove);
						cloneRemove.clear();
						if(clone.size() == 0){
							System.out.println(hs.toString() + ": " + hs.size());
							break;
						}
					}
				}
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




//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList())));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList())));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5))));
						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,5))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,5,6,7))));				
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,5,6))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10))));
						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7,10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,9))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList())));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8,10,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(9,10))));
						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,6,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(10,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,5,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2))));
						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,9,10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(2,8,10))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(6,7,8))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,8,9,10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,10))));						
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(5,6,8,11))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(1))));
//						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(7,8,9))));
						impactedTestSuiteId.addAll(func(new ArrayList<Integer>(Arrays.asList(11))));
						
				
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

		for(Integer i: list){
			if(i == 1){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P3","TankWar_P5"))));
			}
			else if(i == 2){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P2","TankWar_P4", "TankWar_P5"))));
			}
			else if(i == 3){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P2","TankWar_P3","TankWar_P4"))));
			}
			else if(i == 4){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P2","TankWar_P3","TankWar_P4","TankWar_P5"))));
			}
			else if(i == 5){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P3","TankWar_P5"))));
			}
			else if(i == 6){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P2","TankWar_P3","TankWar_P5"))));
			}
			else if(i == 7){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P3","TankWar_P4","TankWar_P5"))));
			}
			else if(i == 8){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P2","TankWar_P3"))));
			}
			else if(i == 9){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P4"))));
			}
			else if(i == 10){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P2","TankWar_P3"))));
			}
			else if(i == 11){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("TankWar_P1","TankWar_P2"))));
			}

		}

		return ret;
	}

}