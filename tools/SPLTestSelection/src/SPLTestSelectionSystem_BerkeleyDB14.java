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

public class SPLTestSelectionSystem_BerkeleyDB14 {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_BerkeleyDB14(){
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
		SPLTestSelectionSystem_BerkeleyDB14 system = new SPLTestSelectionSystem_BerkeleyDB14();
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

			writer.write("\r\n--\r\n");
			writer.write("<Selection Result>" + result.size() +"\r\n" + result.toString() + "\r\n");

			System.out.println("result.txt is created");
			System.out.println("--");
			System.out.println("The number of selected TCs: "+ result.size() + "(" + affectedTCs.size() + ")");

			writer.close();
			//			containmentWriter.close();

			ArrayList<String[]> listString = new ArrayList<String[]>(); 
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P2 CoverageInfo_c.txt");
		//	File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P3 CoverageInfo_c.txt");
		//	File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P4 CoverageInfo_c.txt");
		//	File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P5 CoverageInfo_c.txt");
		//	File f6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P6 CoverageInfo_c.txt");
		//	File f7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P7 CoverageInfo_c.txt");
		//	File f8 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P8 CoverageInfo_c.txt");
		//	File f9 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P9 CoverageInfo_c.txt");
		//	File f10 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P10 CoverageInfo_c.txt");
		//	File f11 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P11 CoverageInfo_c.txt");
		//	File f12 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P12 CoverageInfo_c.txt");
		//	File f13 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P13 CoverageInfo_c.txt");
		//	File f14 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB14_P14 CoverageInfo_c.txt");
			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));
		//		data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f6.getAbsolutePath())));
		//		data.add(Files.readAllLines(Paths.get(f7.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f8.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f9.getAbsolutePath())));
		//		data.add(Files.readAllLines(Paths.get(f10.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f11.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f12.getAbsolutePath())));
		//		data.add(Files.readAllLines(Paths.get(f13.getAbsolutePath())));	
		//		data.add(Files.readAllLines(Paths.get(f14.getAbsolutePath())));	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* BerkeleyDB all mutations */
//			listString.add(new String[]{"Database", "Transaction", "Txn", "DbTree", "Java5LatchImpl", "Cleaner", "Checkpointer", "EnvironmentImpl", "FSyncManager", "TransactionStats", "CheckpointConfig"});
//			listString.add(new String[]{"Database", "DbCompat", "DatabaseUtil", "DbInternal", "LockStats", "Checkpointer", "CheckpointerDaemon", "FileManager", "Txn", "LogBuffer" });
//			listString.add(new String[]{"FileSummary", "Sequence", "TransactionConfig", "Cursor", "Environment", "OperationStatus", "PreloadStats", "DbInternal", "DeadlockException", "TupleBase"});
//			listString.add(new String[]{"CursorImpl", "DbEnvPool", "PutMode", "DbEnvState", "IN", "Key", "VerifyConfig", "LookAheadCache", "Tracer"});
//			listString.add(new String[]{"CheckpointFileReader", "FileHandle", "LogBuffer", "SearchFileReader", "DumpFileReader", "LogUtils", "LNLogEntry", "FileManager", "Evictor", "ChecksumValidator", "EnvironmentStats", "FileCache", "DbTree"});
//			listString.add(new String[]{"SingleItemLogEntry", "RecoveryInfo", "RecoveryManager", "BIN", "Node", "DbTree"});
//			listString.add(new String[]{"DIN", "Tree", "TreeStats", "Generation", "Txn", "LogBuffer"});
//			listString.add(new String[]{"SearchResult", "TrackingInfo", "ChildReference", "TxnEnd", "EnvironmentImpl", "TransactionStats", "FileManager", "Evictor", "FileCache"});
//			listString.add(new String[]{"AutoTxn", "Lock", "Locker", "LockerFactory", "ThreadLocker", "DbRecover", "DbTree", "ChecksumValidator"});
//			listString.add(new String[]{"DbDump", "DbSpace", "PropUtil", "CmdUtil", "Tracer", "BitMap", "DeamonThread", "Checkpointer", "LogBuffer", "FileManager", "Tracer", "ChecksumValidator"});			
//			listString.add(new String[]{"UtfOps", "FastInputStream", "ByteArrayBinding", "RecordNumberBinding", "SerialInput", "SerialOutput", "LookAheadCache", "Tracer" });
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "TupleBase", "DoubleBinding", "LongBinding", "XAEnvironment", "LockMode", "EnvironmentImpl", "CheckpointConfig", "FileManager", "Evictor", "ChecksumValidator", "FileCache", "DbTree"});
//			listString.add(new String[]{"GetMode, MemoryBudget", "DatabaseImpl", "LogEntryType", "DumpFileReader", "PrintFileReader", "FileReader", "Txn", "ChecksumValidator", "EnvironmentStats"});
//			listString.add(new String[]{"Cursor", "JEVersion", "BasicLocker", "BuddyLocker", "LockManager", "LockerFactory", "VerifyConfig", "FSyncManager", "Tracer", "FileCache"});
//			listString.add(new String[]{"DbEnvPool", "DbEnvState", "INList", "OffsetList", "DbCompat", "MapLN", "TreeLocation", "EnvironmentImpl", "Checkpointer", "FileManager", "LogBuffer", "cleaner", "Evictor", "ChecksumValidator"});
//			listString.add(new String[]{"DatabaseUtil", "JoinConfig", "SecondaryTrigger", "Sequence", "ShortConfigParam", "SortedLSNTreeWalker", "DupCountLN", "Generation", "Key", "Transaction", "Java5LatchImpl"});
//			listString.add(new String[]{"INDeleteInfo", "TreeIterator", "JarMain", "TinyHashSet", "LevelOrderedINMap", "CheckpointConfig", "FileManager"});
//			listString.add(new String[]{"ExceptionUnwrapper", "SerialSerialBinding", "UtilizationProfile", "RangeRestartException", "FileSource", "ScavengerFileReader", "Txn", "FileManager"});
//			listString.add(new String[]{"DummyLockManager", "LockUpgrade", "TxnCommit", "WriteLockInfo", "DbLsn", "PropUtil", "Tracer", "DatabaseEntry", "CheckpointConfig", "Checkpointer", "LogBuffer"});
//			listString.add(new String[]{"RootFlusher", "SyncedLockManager", "TxnPrepare", "DbRunAction", "HexFormatter", "EventTracer", "Adler32", "TupleTupleKeyCreator", "DbTree", "Checkpointer", "EnvironmentImpl", "LookAheadCache", "Evictor", "ChecksumValidator"});			
//			listString.add(new String[]{"TupleSerialBinding", "TxnCommit", "BIN", "AutoTxn", "Lock", "Locker", "ExceptionUnwrapper", "SerialSerialBinding", "Tree", "CursorImpl", "FileManager", "LogBuffer", "IN", "RecoveryManager", "EnvironmentImpl", "FileProcessor", "Txn", "DbDump", "DbLoad", "Evictor"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "Generation", "DbTree", "Tree", "CursorImpl", "VerifyConfig", "Tracer"});
//			listString.add(new String[]{"TransactionConfig", "Cursor", "TupleSerialBinding", "StoredClassCatalog", "TransactionStats", "FileManager", "LogBuffer", "RecoveryManager", "IN", "FileCache","DbTree"});
//			listString.add(new String[]{"Database", "DummyLockManager", "JEVersion", "BasicLocker", "BuddyLocker", "Cleaner", "Tree", "CursorImpl", "EnvironmentImpl", "IN", "Evictor", "UtilizationProfile", "Checkpointer"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "FileManager", "LogBuffer", "EnvironmentImpl", "FileProcessor", "Txn"});
//			listString.add(new String[]{"TxnEnd", "Database", "INList", "OffsetList", "Generation", "EnvironmentImpl", "FSyncManager", "UtilizationProfile", "DbDump", "DbLoad", "IN", "Evictor","Checkpointer"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "UtfOps", "FastInputStream", "Checkpointer", "Txn", "Tree", "CursorImpl", "RecoveryManager", "EnvironmentImpl"});
//			listString.add(new String[]{"DummyLockManager", "INList", "OffsetList", "DbSpace", "PropUtil", "FileProcessor", "FileManager", "LogBuffer", "Txn", "FileCache", "Evictor"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DummyLockManager", "PutMode", "DbEnvState", "IN", "Key", "DbDump", "DbLoad", "RecoveryManager"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Generation", "IN", "Evictor", "Checkpointer", "UtilizationProfile"});			
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "PutMode", "DbEnvState", "IN", "Key", "FileProcessor", "Txn"});
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "Tracer", "Evictor", "LookAheadCache", "FileManager", "LogBuffer"});
//			listString.add(new String[]{"TxnPrepare", "DbRunAction", "HexFormatter", "TxnEnd", "INList", "OffsetList", "FileManager", "Txn", "EnvironmentStats"});
//			listString.add(new String[]{"JarMain", "TinyHashSet", "LevelOrderedINMap", "TupleSerialBinding", "StoredClassCatalog", "VerifyConfig", "ChecksumValidator", "EnvironmentStats"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "DIN", "LogUtils", "LNLogEntry", "LatchStats", "EnvironmentStats", "Tracer"});
//			listString.add(new String[]{"DbSpace", "PropUtil", "BasicLocker", "BuddyLocker", "ChecksumValidator", "EnvironmentImpl"});
//			listString.add(new String[]{"DummyLockManager", "Sequence", "TransactionConfig", "EnvironmentStats", "FileManager", "LogBuffer"});
//			listString.add(new String[]{"Database", "JEVersion", "BasicLocker", "BuddyLocker", "EnvironmentStats", "EnvironmentImpl", "FileProcessor", "Txn", "FileCache"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker", "EnvironmentStats"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DbSpace", "PropUtil", "Checkpointer", "DbTree"});	
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "DbSpace", "PropUtil", "FSyncManager", "EnvironmentImpl"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "FileManager", "RecoveryManager", "DbTree"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "LogBuffer", "FileManager", "LookAheadCache", "Evictor"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "UtfOps", "FastInputStream", "RecoveryManager", "IN"});
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "EnvironmentStats", "EnvironmentImpl", "UtilizationProfile", "Evictor", "Checkpointer", "IN"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Sequence", "TransactionConfig", "EnvironmentImpl", "Checkpointer", "DbTree"});
//			listString.add(new String[]{"DIN", "Generation", "LogUtils", "LNLogEntry", "FileManager", "LogBuffer", "LatchStats"});
//			listString.add(new String[]{"UtfOps", "FastInputStream", "Tree", "CursorImpl", "LookAheadCache", "Evictor"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker", "LogUtils", "LNLogEntry", "EnvironmentImpl", "FileCache"});
//			listString.add(new String[]{"JoinConfig", "TransactionConfig", "Cursor", "DbSpace", "PropUtil", "DbDump", "DbLoad"});
			
		
			/* BerkeleyDB only common mutations */
			listString.add(new String[]{"Database", "Transaction", "Txn"});
			listString.add(new String[]{"Database", "DbCompat", "DatabaseUtil", "DbInternal", "LockStats"});
			listString.add(new String[]{"FileSummary", "Sequence", "TransactionConfig", "Cursor", "Environment", "OperationStatus", "PreloadStats", "DbInternal", "DeadlockException", "TupleBase"});
			listString.add(new String[]{"CursorImpl", "DbEnvPool", "PutMode", "DbEnvState", "IN", "Key"});
			listString.add(new String[]{"CheckpointFileReader", "FileHandle", "LogBuffer", "SearchFileReader", "DumpFileReader", "LogUtils", "LNLogEntry"});
			listString.add(new String[]{"SingleItemLogEntry", "RecoveryInfo", "RecoveryManager", "BIN", "Node"});
			listString.add(new String[]{"DIN", "Tree", "TreeStats", "Generation"});
			listString.add(new String[]{"SearchResult", "TrackingInfo", "ChildReference", "TxnEnd"});
			listString.add(new String[]{"AutoTxn", "Lock", "Locker", "LockerFactory", "ThreadLocker", "DbRecover"});
			listString.add(new String[]{"DbDump", "DbSpace", "PropUtil", "CmdUtil", "Tracer", "BitMap", "DeamonThread"});
			
			listString.add(new String[]{"UtfOps", "FastInputStream", "ByteArrayBinding", "RecordNumberBinding", "SerialInput", "SerialOutput"});
			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "TupleBase", "DoubleBinding", "LongBinding", "XAEnvironment", "LockMode"});
			listString.add(new String[]{"GetMode, MemoryBudget", "DatabaseImpl", "LogEntryType", "DumpFileReader", "PrintFileReader", "FileReader"});
			listString.add(new String[]{"Cursor", "JEVersion", "BasicLocker", "BuddyLocker", "LockManager", "LockerFactory"});
			listString.add(new String[]{"DbEnvPool", "DbEnvState", "INList", "OffsetList", "DbCompat", "MapLN", "TreeLocation"});
			listString.add(new String[]{"DatabaseUtil", "JoinConfig", "SecondaryTrigger", "Sequence", "ShortConfigParam", "SortedLSNTreeWalker", "DupCountLN", "Generation", "Key", "Transaction"});
			listString.add(new String[]{"INDeleteInfo", "TreeIterator", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
			listString.add(new String[]{"ExceptionUnwrapper", "SerialSerialBinding", "UtilizationProfile", "RangeRestartException", "FileSource", "ScavengerFileReader"});
			listString.add(new String[]{"DummyLockManager", "LockUpgrade", "TxnCommit", "WriteLockInfo", "DbLsn", "PropUtil", "Tracer", "DatabaseEntry"});
			listString.add(new String[]{"RootFlusher", "SyncedLockManager", "TxnPrepare", "DbRunAction", "HexFormatter", "EventTracer", "Adler32", "TupleTupleKeyCreator"});
			
			listString.add(new String[]{"TupleSerialBinding", "TxnCommit", "BIN", "AutoTxn", "Lock", "Locker", "ExceptionUnwrapper", "SerialSerialBinding"});
			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "Generation"});
			listString.add(new String[]{"TransactionConfig", "Cursor", "TupleSerialBinding", "StoredClassCatalog"});
			listString.add(new String[]{"Database", "DummyLockManager", "JEVersion", "BasicLocker", "BuddyLocker"});
			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
			listString.add(new String[]{"TxnEnd", "Database", "INList", "OffsetList", "Generation"});
			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "UtfOps", "FastInputStream"});
			listString.add(new String[]{"DummyLockManager", "INList", "OffsetList", "DbSpace", "PropUtil"});
			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DummyLockManager", "PutMode", "DbEnvState", "IN", "Key"});
			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Generation"});
			
			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "PutMode", "DbEnvState", "IN", "Key"});
			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation"});
			listString.add(new String[]{"TxnPrepare", "DbRunAction", "HexFormatter", "TxnEnd", "INList", "OffsetList"});
			listString.add(new String[]{"JarMain", "TinyHashSet", "LevelOrderedINMap", "TupleSerialBinding", "StoredClassCatalog"});
			listString.add(new String[]{"Sequence", "TransactionConfig", "DIN", "LogUtils", "LNLogEntry"});
			listString.add(new String[]{"DbSpace", "PropUtil", "BasicLocker", "BuddyLocker"});
			listString.add(new String[]{"DummyLockManager", "Sequence", "TransactionConfig"});
			listString.add(new String[]{"Database", "JEVersion", "BasicLocker", "BuddyLocker"});
			listString.add(new String[]{"BasicLocker", "BuddyLocker"});
			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DbSpace", "PropUtil"});
			
			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "DbSpace", "PropUtil"});
			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key"});
			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
			listString.add(new String[]{"Sequence", "TransactionConfig", "UtfOps", "FastInputStream"});
			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog"});
			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Sequence", "TransactionConfig"});
			listString.add(new String[]{"DIN", "Generation", "LogUtils", "LNLogEntry"});
			listString.add(new String[]{"UtfOps", "FastInputStream"});
			listString.add(new String[]{"BasicLocker", "BuddyLocker", "LogUtils", "LNLogEntry"});
			listString.add(new String[]{"JoinConfig", "TransactionConfig", "Cursor", "DbSpace", "PropUtil"});

			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
			
			/* 14 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(58,13,24,6,10,2,53,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,18,9,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31,4,51))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(59,5,12,14,11,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(39,53,59,15,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,8,59,51,12,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,51))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,7,18,5,12,11,45))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,32,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,31,51,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(39,42,18,8,4,5,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(58))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,59))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,36,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,10,25,15,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(49,40,23,35,50,16,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,49,31,51))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(53,56,23,21,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,49,35,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(40,35,50))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(39,2,16,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,38,49,23,35))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,40,50,11,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,16))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(50))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,51,5,56))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,59,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31,12,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,51,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,35))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,40))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,35,50,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(52))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,23,28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,59,4,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,35,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,10,45))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,59,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(49,25,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(35,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16))));
			
			/* 13 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,18,36,10,16,2,53,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(35,17,14,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,11,49))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,9,13,12,8,24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,53,4,19,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,39))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(46,6,4,49,13,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,39))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,5,17,9,13,8,42))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,29,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,28,49,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,46,17,6,11,9,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,17))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,35,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,16,30,19,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(50,38,21,34,55,15,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,50,28,49))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(53,54,21,26,24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,50,34,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(38,34,55))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,2,15,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(46,36,50,21,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,38,55,8,30))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(55))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,49,9,54))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(44,4,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,13,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,49,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,38))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,34,55,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(51))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,21,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,4,11,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,34,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,16,42))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,4,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(50,30,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15))));
			
			/* 12 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,14,42,17,23,3,2,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,13,21,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26,15,47))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,16,12,8,10,30))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(38))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(40,2,7,18,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,37))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,4,7,47,12,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34,37))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,9,13,16,12,10,45))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,27,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,26,47,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(40,41,13,4,15,16,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,41,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,23,34,18,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(51,36,22,31,1,19,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,51,26,47))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,50,22,32,30))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,51,31,28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,31,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(40,3,19,35))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,42,51,22,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,36,1,10,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34,47,16,50))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,7,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26,12,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,47,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,36))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,31,1,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(53))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,22,38))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,7,15,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,31,28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,23,45))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,7,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(51,34,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19))));
			
			/* 11 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,40,30,38,48,4,3,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,25,2,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(46,41,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,39,24,32,22,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,3,18,33,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(47,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,12,18,29,24,44))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(48,21,25,39,24,22,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,47,44))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,46,29,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,20,25,12,41,39,24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,20,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,48,8,33,47))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,10,37,5,14,34,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,43,46,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,42,37,6,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(40,43,5,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,5,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,4,34,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,30,43,37,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,10,14,22,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,29,39,42))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,18,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(46,24,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,29,44))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(44,5,14,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(48,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,37,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,18,41,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(44,5,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(38,48,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,18,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,8,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34))));
			
			/* 10 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,37,29,35,47,2,1,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,33,11,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(45,38,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,36,23,43,21,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,1,17,41,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,10,17,27,23,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(47,20,33,36,23,21,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,45,27,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,28,33,10,38,36,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,17))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,28,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,47,6,41,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,8,34,3,12,31,24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,42,45,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,40,34,4,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,42,3,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,3,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,2,31,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,29,42,34,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33,8,12,21,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,27,36,40))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,17,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(45,23,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,27,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,3,12,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(47,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33,34,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,17,38,41))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,3,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(35,47,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,17,43))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,6,41))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31))));
			
			/* 9 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,37,42,1,14,16,17,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,32,21,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,38,40))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,35,34,5,31,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,17,18,7,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,13,18,40,34,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,27,32,35,34,31,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,8,40,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,43,32,13,38,35,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,32))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,43,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,14,9,7,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,19,33,3,15,29,36))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,41,8,40))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,39,33,4,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,41,3,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,3,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,16,29,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(43,42,41,33,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,19,15,31,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,40,35,39))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(42,18,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,34,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,40,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(34,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3,15,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,16))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,33,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,18,38,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,14,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,18,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(41,9,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29))));
			
			/* 8 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,32,17,24,27,16,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,30,36,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,11,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(28,7,31,6,4,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,16,28,7,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,14,28,34,31,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,26,30,7,31,4,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,8,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(27,10,34,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,37,30,14,11,7,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26,30))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26,37,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,24,11,7,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(35,33,5,3,15,2,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,35,10,34))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,12,5,4,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(32,35,3,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(33,3,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,27,2,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(37,36,35,5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,33,15,4,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,34,7,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(36,28,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,31,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,34,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,33))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,3,15,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30,5,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,28,11,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,3,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,24,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29,28,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(35,11,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			
			/* 6 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,4,21,14,16,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,9,19,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,12,17))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,11,2,9,7,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,7,11,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,18,7,17,2,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,9,11,2,7,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,1,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,3,17,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,9,18,12,11,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,20,18))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,12,11,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,15,8,6,10,5,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,10,3,17))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,15,8,7,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,10,6,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15,6,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,5,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(20,19,10,8,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,15,10,7,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,17,11,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(19,7,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,17,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,6,10,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,8,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,7,12,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,6,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,7,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,12,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
			
			/* 4 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,8,7,3,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,3,5,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,4,8,2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3,2,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,3,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,3,4,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,7,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,6,2,1,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,8,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,2,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,1,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,4,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,5,8,2,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,8,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,7,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,1,8,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,7,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			
			/* 2 products */
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			
			String TC = null;
			HashSet<String> allTestMethods = new HashSet<String>();
			
			
			for(HashSet<String> key : testCasesPartitionTable.keySet()){
				allTestMethods.addAll(testCasesPartitionTable.get(key));
			}
			
			Iterator<HashSet<HashSet<String>>> it = variablePartChanges.iterator();
			HashSet<String> selTestClasses = new HashSet<String>(); 
			for(String[] changedClassess : listString){
				for(List<String> d : data){
					for(String s : d){
						if(s.contains("_ESTest")){
							TC = s;
						}else{
							for(String str : changedClassess){
								String tmp = s.substring(s.lastIndexOf(".")+1);
								
								if(tmp.equals(str)){
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
			/*	HashSet<HashSet<String>> spaceToBeInstantiation = new HashSet<HashSet<String>>(); 
				for(String str : result){
					for(HashSet<String> key : testCasesPartitionTable.keySet()){
						if(testCasesPartitionTable.get(key).contains(str)){
							spaceToBeInstantiation.add(key);
							break;
						}
					}
				}
				HashSet<String> optimal = new HashSet<String>(Arrays.asList("P1","P2","P3","P4"));
				
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4")));
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
							if(optimal.size() > hs.size())
								optimal = hs;
							//System.out.println(hs.toString() + ": " + hs.size());
							break;
						}
					}
				}
				//System.out.println(optimal.toString() + ": ");
				System.out.println(optimal.size());
				optimal = new HashSet<String>(Arrays.asList("P1","P2","P3","P4"));
				*/
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
		HashSet<HashSet<String>> ret1 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret2 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret3 = new HashSet<HashSet<String>>();
		HashSet<HashSet<String>> ret4 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret5 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret6 = new HashSet<HashSet<String>>();
		HashSet<HashSet<String>> ret7 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret8 = new HashSet<HashSet<String>>();		HashSet<HashSet<String>> ret9 = new HashSet<HashSet<String>>();
		HashSet<HashSet<String>> ret10 = new HashSet<HashSet<String>>();	HashSet<HashSet<String>> ret11 = new HashSet<HashSet<String>>();	HashSet<HashSet<String>> ret12 = new HashSet<HashSet<String>>();
		HashSet<HashSet<String>> ret13 = new HashSet<HashSet<String>>();	HashSet<HashSet<String>> ret14 = new HashSet<HashSet<String>>();
		

		for(Integer i: list){
			if(i == 1){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P10","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P8","P9","P10","P11","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P2","P3","P4","P8"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P4","P5","P6","P7","P8","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret3.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret2.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
			}
			else if(i == 2){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P2","P4","P5","P6","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
				ret3.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
				ret2.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2"))));
			}
			else if(i == 3){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P8","P9","P10","P11","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P8","P9","P10","P11","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret3.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 4){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P9","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 5){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P9","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P10","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P2","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4"))));
			}
			else if(i == 6){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P9","P10","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P11","P2","P3","P4","P5","P6","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P1"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3"))));
			}
			else if(i == 7){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P10","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P10","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
			}
			else if(i == 8){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9","P10","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P11","P4","P5","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P4","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
			}
			else if(i == 9){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P9","P10","P11","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P9","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
				ret4.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4"))));
			}
			else if(i == 10){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P9","P10","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P9","P10","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P4"))));
			}
			else if(i == 11){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9","P10","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P9","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
			}
			else if(i == 12){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8","P10","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10","P11","P12"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5"))));
			}
			else if(i == 13){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8","P12","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P4","P5","P7"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P2","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7","P8","P10"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5","P4"))));
			}
			else if(i == 14){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10","P11","P12"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P9","P10","P11","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P5","P7","P8"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P3","P4"))));
			}
			else if(i == 15){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P10","P11","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P5","P6","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6"))));
				ret5.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5"))));
			}
			else if(i == 16){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P9","P10","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P4","P6","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
			}
			else if(i == 17){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P9","P10","P11","P12","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7","P11"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P2","P3","P4","P5","P6","P7","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6"))));
			}
			else if(i == 18){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7","P11"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8","P12"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P4","P6","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P10"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
			}
			else if(i == 19){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P10","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P10","P11"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6"))));
			}
			else if(i == 20){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P4","P5","P6","P8","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7","P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6"))));
			}
			else if(i == 21){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P11","P2","P4","P5","P6","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6"))));
			}
			else if(i == 22){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7","P8","P10","P11","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5"))));
				ret6.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6"))));
			}
			else if(i == 23){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P7","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6"))));
			}
			else if(i == 24){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P7","P8","P10","P11","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P8","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8","P10"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
			}
			else if(i == 25){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P10","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P4","P5","P7"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
			}
			else if(i == 26){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8","P12","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
			}
			else if(i == 27){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P7"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
			}
			else if(i == 28){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P12","P14","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P5","P8"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P2","P3","P4","P5","P6","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
			}
			else if(i == 29){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P11"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P4","P5","P6","P7","P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
			}
			else if(i == 30){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P4","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 31){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8"))));
				ret7.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
			}
			else if(i == 32){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P11"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P8","P12"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P4","P5","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
			}
			else if(i == 33){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P4","P6","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8"))));
			}
			else if(i == 34){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7","P8","P9","P10","P11","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7","P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8"))));
			}
			else if(i == 35){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8","P10","P11","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P11","P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8"))));
			}
			else if(i == 36){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8","P10","P11","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P8","P9"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 37){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8","P10","P14}"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7","P8","P9","P10","P11","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret8.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8"))));
			}
			else if(i == 38){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10","P12","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P4"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P9","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P9"))));
			}
			
			else if(i == 39){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P10","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P8","P9","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
			}
			else if(i == 40){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P8","P9","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P8","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7","P8"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8"))));
			}
			else if(i == 41){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10","P12","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P4","P5","P6","P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8"))));
			}
			else if(i == 42){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8","P10","P11","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P2","P4","P5","P6","P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 43){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10"))));
				ret9.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8"))));
			}
			else if(i == 44){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8","P10","P12"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P1","P11","P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 45){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P12"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7","P10"))));
			}
			else if(i == 46){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6","P8","P10","P11"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7","P10"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
			}
			else if(i == 47){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8","P10"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P11","P3","P7"))));
				ret10.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P9","P10"))));
			}
			else if(i == 48){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9","P12"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P9"))));
				ret11.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P9","P10"))));
			}
			else if(i == 49){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8","P10"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12"))));
			}
			else if(i == 50){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
			}
			else if(i == 51){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6","P8","P10"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P8","P9","P10","P11","P12","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7","P8"))));
			}
			else if(i == 52){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P7","P8","P9","P10","P11","P12","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 53){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7","P10","P13","P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6","P7","P10","P13"))));
				ret12.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P12","P11","P2","P3","P4","P5","P6","P7","P8","P9","P10"))));
			}
			else if(i == 54){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P14"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
			}
			else if(i == 55){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P13"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P8","P12","P13"))));
			}
			else if(i == 56){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6","P9"))));
				ret13.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 57){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6","P8"))));
			}
			else if(i == 58){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6","P8","P9","P10","P11","P12","P13","P14"))));
			}
			else if(i == 59){
				ret14.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7","P9","P13","P14"))));
			}
		}

		return ret2;
	}
}