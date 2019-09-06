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

public class SPLTestSelectionSystem_PrevaylerTest {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_PrevaylerTest(){
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
		SPLTestSelectionSystem_PrevaylerTest system = new SPLTestSelectionSystem_PrevaylerTest();
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
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Prevayler3_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Prevayler3_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Prevayler3_P3 CoverageInfo_c.txt");
		//	File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Prevayler_P4 CoverageInfo_c.txt");
		//	File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\Prevayler_P5 CoverageInfo_c.txt");
			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//Prevayler_P1 CoverageInfo_c.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//Prevayler_P2 CoverageInfo_c.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//Prevayler_P3 CoverageInfo_c.txt
			//	data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//Prevayler_P4 CoverageInfo_c.txt
			//	data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//Prevayler_P5 CoverageInfo_c.txt
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* Prevayler all mutations */
//			listString.add(new String[]{"AbstractPublisher", "SureTransactionWithQuery","PausableClock","StubbornClientReceiverImpl"});
//			listString.add(new String[]{"XStreamSerializer", "Query", "Cool", "PrevaylerTransactionSubject","Prevayler","PersistentJournal","NetworkSessionId","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"XStreamSerializer", "PrevaylerFactory", "StopWatch","TransientJournal","Prevayler","PersistentJournal","NonCloseableOutputStream"});
//			listString.add(new String[]{"Chunk", "PrevalenceTest", "TransactionCapsule","NonCloseableOutputStream"});
//			listString.add(new String[]{"FileLocker", "TransactionTimestamp", "TransactionPublisher", "NullSnapshotManager","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"Clock", "JDBCQuerySubject,CentralPublisher","JDBCScalabilityConnection","StrictTransactionCensor","PrevaylerFactory","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"BrokenClock", "Clock", "SkaringaSerializer","Prevayler","PersistentJournal","NonCloseableOutputStream"});
//			listString.add(new String[]{"StubbornClientReceiverImpl","CentralPublisher","PrevaylerFactory","NetworkSessionId"});
//			listString.add(new String[]{"PrevaylerQuerySubject", "StopWatch","NetworkSessionId"});
//			listString.add(new String[]{"DeepCopier", "DurableOutputStream", "QueryTestRun","Prevayler","PersistentJournal","NonCloseableOutputStream"});
//			listString.add(new String[]{"JDBCTransactionSubject", "PrevalentSystemGuard", "TransactionPublisher","NonCloseableOutputStream","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"JDBCScalabilitySubject", "Clock", "JDBCQuerySubject","Prevayler","PersistentJournal","NonCloseableOutputStream","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"BrokenClock", "PrevaylerQuerySubject", "StopWatch", "PausableClock","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"QueryTestRun", "TransactionSubscriber", "Prevayler","CentralPublisher","PrevaylerFactory"});
//			listString.add(new String[]{"Transaction", "FileManager", "ObjectInputStreamWithClassLoader","CentralPublisher","PrevaylerFactory","NonCloseableOutputStream","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"CentralPublisher", "JDBCQueryConnection", "PrevaylerTransactionSubject","CentralPublisher","PrevaylerFactory"});
//			listString.add(new String[]{"NonCloseableOutputStream"});
//			listString.add(new String[]{"CentralPublisher", "TransactionTestRun", "ScalabilityTestSubject", "MachineClock"});
//			listString.add(new String[]{"JDBCScalabilityConnection", "Prevayler","Prevayler","PersistentJournal","NonCloseableOutputStream","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"PrevalentSystemGuard", "PrevaylerTransactionSubject", "PrevaylerDirectory", "Record"});
//			listString.add(new String[]{"QuerySystem", "TransactionConnection", "TransactionTestRun"});
//			listString.add(new String[]{"PrevaylerDirectory", "BrokenClock","CentralPublisher","PrevaylerFactory","NonCloseableOutputStream"});
//			listString.add(new String[]{"BrokenClock", "PrevaylerTransactionConnection","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"Turn", "QueryTestRun", "QueryConnection", "AbstractPublisher","StrictTransactionCensor","PrevaylerFactory","NonCloseableOutputStream"});
//			listString.add(new String[]{"DeepCopier", "DurableOutputStream","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"TransientJournal", "Query", "Guided","CentralPublisher","PrevaylerFactory","NetworkSessionId"});
//			listString.add(new String[]{"JDBCScalabilityConnection", "Prevayler","StubbornClientReceiverImpl"});
//			listString.add(new String[]{"PrevalentSystemGuard", "FileLocker", "PrevaylerScalabilitySubject","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"Capsule", "RecordIterator", "Record","CentralPublisher","PrevaylerFactory","Prevayler","PersistentJournal","NonCloseableOutputStream"});
//			listString.add(new String[]{"BrokenClock", "PrevaylerTransactionConnection", "ScalabilityTestRun","StubbornClientReceiverImpl","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"Turn", "FileLocker", "Serializer", "JDBCScalabilityConnection","StubbornClientReceiverImpl"});
//			listString.add(new String[]{"PrevaylerQuerySubject", "TransactionSubscriber", "TransactionWithQuery","StubbornClientReceiverImpl","NetworkSessionId"});
//			listString.add(new String[]{"PrevaylerScalabilitySubject", "TransactionPublisher", "TransactionSystem","CentralPublisher","PrevaylerFactory","NonCloseableOutputStream"});
//			listString.add(new String[]{"Prevayler","PersistentJournal","NetworkSessionId","StrictTransactionCensor","PrevaylerFactory"});
//			listString.add(new String[]{"ScalabilitySystem", "JDBCScalabilitySubject","NonCloseableOutputStream","NonCloseableOutputStream"});
//			listString.add(new String[]{"TransactionGuide","StubbornClientReceiverImpl"});
//			listString.add(new String[]{"Journal", "Cool", "TransactionWithQuery","CentralPublisher","PrevaylerFactory","NetworkSessionId","NonCloseableOutputStream"});
//			listString.add(new String[]{"ScalabilitySystem", "GenericSnapshotManager","NonCloseableOutputStream","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"JDBCTransactionSubject", "GenericSnapshotManager", "TestTransaction", "POBox","NonCloseableOutputStream","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"QueryConnection", "AllRecordsReplacement", "CentralPublisher","NonCloseableOutputStream"});
//			listString.add(new String[]{"SkaringaSerializer", "TransactionGuide", "XStreamSerializer","StubbornClientReceiverImpl","NonCloseableOutputStream","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"DurableOutputStream", "QueryTestRun", "NullSnapshotManager","StubbornClientReceiverImpl","NonCloseableOutputStream","LoggingMonitor","Monitor","DurableInputStream","PersistentJournal"});
//			listString.add(new String[]{"PrevaylerDirectory"});
//			listString.add(new String[]{"DeepCopier", "JDBCTransactionSubject", "FileManager","StubbornClientReceiverImpl","NonCloseableOutputStream"});
//			listString.add(new String[]{"PrevaylerQueryConnection", "JavaSerializer", "JDBCTransactionSubject","Prevayler","PersistentJournal"});
//			listString.add(new String[]{"ObjectInputStreamWithClassLoader", "ScalabilitySystem", "JDBCScalabilitySubject","CentralPublisher","PrevaylerFactory","NetworkSessionId"});
//			listString.add(new String[]{"ScalabilityTestRun","JDBCScalabilitySubject","TransactionWithQuery","NonCloseableOutputStream","CentralPublisher","PrevaylerFactory"});
//			listString.add(new String[]{"Chunk", "FileLocker", "DeepCopier","StubbornClientReceiverImpl"});
//			listString.add(new String[]{"Chunking"});
//			listString.add(new String[]{"FileLocker", "POBox", "CentralPublisher","NetworkSessionId"});

			
			/* Prevayler only common mutations */
			
			listString.add(new String[]{"AbstractPublisher", "SureTransactionWithQuery","PausableClock"});
			listString.add(new String[]{"XStreamSerializer", "Query", "Cool", "PrevaylerTransactionSubject"});
			listString.add(new String[]{"XStreamSerializer", "PrevaylerFactory", "StopWatch","TransientJournal"});
			listString.add(new String[]{"Chunk", "PrevalenceTest", "TransactionCapsule"});
			listString.add(new String[]{"FileLocker", "TransactionTimestamp", "TransactionPublisher", "NullSnapshotManager"});
			listString.add(new String[]{"Clock", "JDBCQuerySubject,CentralPublisher","JDBCScalabilityConnection"});
			listString.add(new String[]{"BrokenClock", "Clock", "SkaringaSerializer"});
			listString.add(new String[]{""});
			listString.add(new String[]{"PrevaylerQuerySubject", "StopWatch"});
			listString.add(new String[]{"DeepCopier", "DurableOutputStream", "QueryTestRun"});
			listString.add(new String[]{"JDBCTransactionSubject", "PrevalentSystemGuard", "TransactionPublisher"});
			listString.add(new String[]{"JDBCScalabilitySubject", "Clock", "JDBCQuerySubject"});
			listString.add(new String[]{"BrokenClock", "PrevaylerQuerySubject", "StopWatch", "PausableClock"});
			listString.add(new String[]{"QueryTestRun", "TransactionSubscriber", "Prevayler"});
			listString.add(new String[]{"Transaction", "FileManager", "ObjectInputStreamWithClassLoader"});
			listString.add(new String[]{"CentralPublisher", "JDBCQueryConnection", "PrevaylerTransactionSubject"});
			listString.add(new String[]{""});
			listString.add(new String[]{"CentralPublisher", "TransactionTestRun", "ScalabilityTestSubject", "MachineClock"});
			listString.add(new String[]{"JDBCScalabilityConnection", "Prevayler"});
			listString.add(new String[]{"PrevalentSystemGuard", "PrevaylerTransactionSubject", "PrevaylerDirectory", "Record"});
			listString.add(new String[]{"QuerySystem", "TransactionConnection", "TransactionTestRun"});
			listString.add(new String[]{"PrevaylerDirectory", "BrokenClock"});
			listString.add(new String[]{"BrokenClock", "PrevaylerTransactionConnection"});
			listString.add(new String[]{"Turn", "QueryTestRun", "QueryConnection", "AbstractPublisher"});
			listString.add(new String[]{"DeepCopier", "DurableOutputStream"});
			listString.add(new String[]{"TransientJournal", "Query", "Guided"});
			listString.add(new String[]{"JDBCScalabilityConnection", "Prevayler"});
			listString.add(new String[]{"PrevalentSystemGuard", "FileLocker", "PrevaylerScalabilitySubject"});
			listString.add(new String[]{"Capsule", "RecordIterator", "Record"});
			listString.add(new String[]{"BrokenClock", "PrevaylerTransactionConnection", "ScalabilityTestRun"});
			listString.add(new String[]{"Turn", "FileLocker", "Serializer", "JDBCScalabilityConnection"});
			listString.add(new String[]{"PrevaylerQuerySubject", "TransactionSubscriber", "TransactionWithQuery"});
			listString.add(new String[]{"PrevaylerScalabilitySubject", "TransactionPublisher", "TransactionSystem"});
			listString.add(new String[]{""});
			listString.add(new String[]{"ScalabilitySystem", "JDBCScalabilitySubject"});
			listString.add(new String[]{"TransactionGuide"});
			listString.add(new String[]{"Journal", "Cool", "TransactionWithQuery"});
			listString.add(new String[]{"ScalabilitySystem", "GenericSnapshotManager"});
			listString.add(new String[]{"JDBCTransactionSubject", "GenericSnapshotManager", "TestTransaction", "POBox"});
			listString.add(new String[]{"QueryConnection", "AllRecordsReplacement", "CentralPublisher"});
			listString.add(new String[]{"SkaringaSerializer", "TransactionGuide", "XStreamSerializer"});
			listString.add(new String[]{"DurableOutputStream", "QueryTestRun", "NullSnapshotManager"});
			listString.add(new String[]{"PrevaylerDirectory"});
			listString.add(new String[]{"DeepCopier", "JDBCTransactionSubject", "FileManager"});
			listString.add(new String[]{"PrevaylerQueryConnection", "JavaSerializer", "JDBCTransactionSubject"});
			listString.add(new String[]{"ObjectInputStreamWithClassLoader", "ScalabilitySystem", "JDBCScalabilitySubject"});
			listString.add(new String[]{"ScalabilityTestRun","JDBCScalabilitySubject","TransactionWithQuery"});
			listString.add(new String[]{"Chunk", "FileLocker", "DeepCopier"});
			listString.add(new String[]{"Chunking"});
			listString.add(new String[]{"FileLocker", "POBox", "CentralPublisher"});

			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
			
			/* 5 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			
			/* 3 products */
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,2,1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,2,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,2,3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			
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
								if(s.equals(str)){
									String[] sp = TC.split("_scaffolding");
									String tcClass = sp[0] + sp[1];
									selTestClasses.add(tcClass);
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
				
				/* find products to be instrumented */
				/*HashSet<HashSet<String>> spaceToBeInstantiation = new HashSet<HashSet<String>>(); 
				for(String str : result){
					for(HashSet<String> key : testCasesPartitionTable.keySet()){
						if(testCasesPartitionTable.get(key).contains(str)){
							spaceToBeInstantiation.add(key);
							break;
						}
					}
				}
				
//				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P01111","Prevayler_P10111","Prevayler_P11011","Prevayler_P11101","Prevayler_P11111")));
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P1","Prevayler_P2","Prevayler_P3","Prevayler_P4","Prevayler_P5")));
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
				}*/
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

		for(Integer i: list){
			if(i == 1){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P2","Prevayler_P3"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P2","Prevayler_P3"))));
			}
			else if(i == 2){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P1","Prevayler_P2"))));
				
			}
			else if(i == 3){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P5", "Prevayler_P4", "Prevayler_P3"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P2","Prevayler_P1"))));
			}
			else if(i == 4){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P3"))));
			}
			else if(i == 5){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("Prevayler_P4"))));
			}
			else if(i == 6){
				
			}
		}

		return ret;
	}

}