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

public class SPLTestSelectionSystem_BerkeleyDB {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_BerkeleyDB(){
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
		SPLTestSelectionSystem_BerkeleyDB system = new SPLTestSelectionSystem_BerkeleyDB();
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
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB3_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB3_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB3_P3 CoverageInfo_c.txt");
			File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB5_P4 CoverageInfo_c.txt");
			File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB5_P5 CoverageInfo_c.txt");
			File f6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB_P6 CoverageInfo_c.txt");
			File f7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkeleyDB_P7 CoverageInfo_c.txt");
			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//BerKeleyDB_P1 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//BerKeleyDB_P2 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//BerKeleyDB_P3 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//BerKeleyDB_P4 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//BerKeleyDB_P5 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f6.getAbsolutePath())));	//BerKeleyDB_P6 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f7.getAbsolutePath())));	//BerKeleyDB_P7 CoverageInfo.txt
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			/* BerkeleyDB all mutations */
			listString.add(new String[]{"Database", "Transaction", "Txn", "DbTree", "Java5LatchImpl", "Cleaner", "Checkpointer", "EnvironmentImpl", "FSyncManager", "TransactionStats", "CheckpointConfig"});
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
		
			/* BerkeleyDB all mutations (for 3 products) */
//			listString.add(new String[]{"Database", "Transaction", "Txn", "DbTree", "Java5LatchImpl", "Cleaner", "Checkpointer", "EnvironmentImpl"});
//			listString.add(new String[]{"Database", "DbCompat", "DatabaseUtil", "DbInternal", "LockStats", "Checkpointer", "CheckpointerDaemon", "FileManager"});
//			listString.add(new String[]{"FileSummary", "Sequence", "TransactionConfig", "Cursor", "Environment", "OperationStatus", "PreloadStats", "DbInternal", "DeadlockException", "TupleBase"});
//			listString.add(new String[]{"CursorImpl", "DbEnvPool", "PutMode", "DbEnvState", "IN", "Key", "VerifyConfig"});
//			listString.add(new String[]{"CheckpointFileReader", "FileHandle", "LogBuffer", "SearchFileReader", "DumpFileReader", "LogUtils", "LNLogEntry", "DbTree"});
//			listString.add(new String[]{"SingleItemLogEntry", "RecoveryInfo", "RecoveryManager", "BIN", "Node", "DbTree"});
//			listString.add(new String[]{"DIN", "Tree", "TreeStats", "Generation", "Txn"});
//			listString.add(new String[]{"SearchResult", "TrackingInfo", "ChildReference", "TxnEnd", "EnvironmentImpl"});
//			listString.add(new String[]{"AutoTxn", "Lock", "Locker", "LockerFactory", "ThreadLocker", "DbRecover", "ChecksumValidator"});
//			listString.add(new String[]{"DbDump", "DbSpace", "PropUtil", "CmdUtil", "Tracer", "BitMap", "DeamonThread", "Tracer", "ChecksumValidator"});			
//			listString.add(new String[]{"UtfOps", "FastInputStream", "ByteArrayBinding", "RecordNumberBinding", "SerialInput", "SerialOutput", "Tracer" });
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "TupleBase", "DoubleBinding", "LongBinding", "XAEnvironment", "LockMode", "FileCache", "DbTree"});
//			listString.add(new String[]{"GetMode, MemoryBudget", "DatabaseImpl", "LogEntryType", "DumpFileReader", "PrintFileReader", "FileReader", "ChecksumValidator", "EnvironmentStats"});
//			listString.add(new String[]{"Cursor", "JEVersion", "BasicLocker", "BuddyLocker", "LockManager", "LockerFactory", "Tracer", "FileCache"});
//			listString.add(new String[]{"DbEnvPool", "DbEnvState", "INList", "OffsetList", "DbCompat", "MapLN", "TreeLocation", "Evictor", "ChecksumValidator"});
//			listString.add(new String[]{"DatabaseUtil", "JoinConfig", "SecondaryTrigger", "Sequence", "ShortConfigParam", "SortedLSNTreeWalker", "DupCountLN", "Generation", "Key", "Transaction", "Java5LatchImpl"});
//			listString.add(new String[]{"INDeleteInfo", "TreeIterator", "JarMain", "TinyHashSet", "LevelOrderedINMap", "FileManager"});
//			listString.add(new String[]{"ExceptionUnwrapper", "SerialSerialBinding", "UtilizationProfile", "RangeRestartException", "FileSource", "ScavengerFileReader", "Txn", "FileManager"});
//			listString.add(new String[]{"DummyLockManager", "LockUpgrade", "TxnCommit", "WriteLockInfo", "DbLsn", "PropUtil", "Tracer", "DatabaseEntry", "CheckpointConfig", "Checkpointer", "LogBuffer"});
//			listString.add(new String[]{"RootFlusher", "SyncedLockManager", "TxnPrepare", "DbRunAction", "HexFormatter", "EventTracer", "Adler32", "TupleTupleKeyCreator", "ChecksumValidator"});			
//			listString.add(new String[]{"TupleSerialBinding", "TxnCommit", "BIN", "AutoTxn", "Lock", "Locker", "ExceptionUnwrapper", "SerialSerialBinding", "Tree", "CursorImpl", "FileManager"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "Generation", "DbTree", "Tree"});
//			listString.add(new String[]{"TransactionConfig", "Cursor", "TupleSerialBinding", "StoredClassCatalog", "TransactionStats"});
//			listString.add(new String[]{"Database", "DummyLockManager", "JEVersion", "BasicLocker", "BuddyLocker", "Cleaner", "Tree"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "FileManager", "LogBuffer"});
//			listString.add(new String[]{"TxnEnd", "Database", "INList", "OffsetList", "Generation", "EnvironmentImpl", "FSyncManager", "UtilizationProfile"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "UtfOps", "FastInputStream", "Checkpointer", "Txn", "Tree"});
//			listString.add(new String[]{"DummyLockManager", "INList", "OffsetList", "DbSpace", "PropUtil", "FileProcessor", "FileManager"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DummyLockManager", "PutMode", "DbEnvState", "IN", "Key", "DbDump", "DbLoad"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Generation", "IN"});			
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "PutMode", "DbEnvState", "IN", "Key", "FileProcessor"});
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "Tracer"});
//			listString.add(new String[]{"TxnPrepare", "DbRunAction", "HexFormatter", "TxnEnd", "INList", "OffsetList", "FileManager", "Txn"});
//			listString.add(new String[]{"JarMain", "TinyHashSet", "LevelOrderedINMap", "TupleSerialBinding", "StoredClassCatalog", "VerifyConfig"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "DIN", "LogUtils", "LNLogEntry", "LatchStats"});
//			listString.add(new String[]{"DbSpace", "PropUtil", "BasicLocker", "BuddyLocker", "ChecksumValidator", "EnvironmentImpl"});
//			listString.add(new String[]{"DummyLockManager", "Sequence", "TransactionConfig", "EnvironmentStats", "FileManager", "LogBuffer"});
//			listString.add(new String[]{"Database", "JEVersion", "BasicLocker", "BuddyLocker", "EnvironmentStats", "EnvironmentImpl", "FileProcessor"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DbSpace", "PropUtil", "Checkpointer"});	
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "DbSpace", "PropUtil", "FSyncManager"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "FileManager"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "LogBuffer", "FileManager"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "UtfOps", "FastInputStream", "RecoveryManager"});
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "EnvironmentStats"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Sequence", "TransactionConfig", "EnvironmentImpl"});
//			listString.add(new String[]{"DIN", "Generation", "LogUtils", "LNLogEntry"});
//			listString.add(new String[]{"UtfOps", "FastInputStream", "Tree"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker", "LogUtils", "LNLogEntry", "EnvironmentImpl", "FileCache"});
//			listString.add(new String[]{"JoinConfig", "TransactionConfig", "Cursor", "DbSpace", "PropUtil", "DbDump"});

			/* BerkeleyDB only common mutations */
//			listString.add(new String[]{"Database", "Transaction", "Txn"});
//			listString.add(new String[]{"Database", "DbCompat", "DatabaseUtil", "DbInternal", "LockStats"});
//			listString.add(new String[]{"FileSummary", "Sequence", "TransactionConfig", "Cursor", "Environment", "OperationStatus", "PreloadStats", "DbInternal", "DeadlockException", "TupleBase"});
//			listString.add(new String[]{"CursorImpl", "DbEnvPool", "PutMode", "DbEnvState", "IN", "Key"});
//			listString.add(new String[]{"CheckpointFileReader", "FileHandle", "LogBuffer", "SearchFileReader", "DumpFileReader", "LogUtils", "LNLogEntry"});
//			listString.add(new String[]{"SingleItemLogEntry", "RecoveryInfo", "RecoveryManager", "BIN", "Node"});
//			listString.add(new String[]{"DIN", "Tree", "TreeStats", "Generation"});
//			listString.add(new String[]{"SearchResult", "TrackingInfo", "ChildReference", "TxnEnd"});
//			listString.add(new String[]{"AutoTxn", "Lock", "Locker", "LockerFactory", "ThreadLocker", "DbRecover"});
//			listString.add(new String[]{"DbDump", "DbSpace", "PropUtil", "CmdUtil", "Tracer", "BitMap", "DeamonThread"});
//			
//			listString.add(new String[]{"UtfOps", "FastInputStream", "ByteArrayBinding", "RecordNumberBinding", "SerialInput", "SerialOutput"});
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "TupleBase", "DoubleBinding", "LongBinding", "XAEnvironment", "LockMode"});
//			listString.add(new String[]{"GetMode, MemoryBudget", "DatabaseImpl", "LogEntryType", "DumpFileReader", "PrintFileReader", "FileReader"});
//			listString.add(new String[]{"Cursor", "JEVersion", "BasicLocker", "BuddyLocker", "LockManager", "LockerFactory"});
//			listString.add(new String[]{"DbEnvPool", "DbEnvState", "INList", "OffsetList", "DbCompat", "MapLN", "TreeLocation"});
//			listString.add(new String[]{"DatabaseUtil", "JoinConfig", "SecondaryTrigger", "Sequence", "ShortConfigParam", "SortedLSNTreeWalker", "DupCountLN", "Generation", "Key", "Transaction"});
//			listString.add(new String[]{"INDeleteInfo", "TreeIterator", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
//			listString.add(new String[]{"ExceptionUnwrapper", "SerialSerialBinding", "UtilizationProfile", "RangeRestartException", "FileSource", "ScavengerFileReader"});
//			listString.add(new String[]{"DummyLockManager", "LockUpgrade", "TxnCommit", "WriteLockInfo", "DbLsn", "PropUtil", "Tracer", "DatabaseEntry"});
//			listString.add(new String[]{"RootFlusher", "SyncedLockManager", "TxnPrepare", "DbRunAction", "HexFormatter", "EventTracer", "Adler32", "TupleTupleKeyCreator"});
//			
//			listString.add(new String[]{"TupleSerialBinding", "TxnCommit", "BIN", "AutoTxn", "Lock", "Locker", "ExceptionUnwrapper", "SerialSerialBinding"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "Generation"});
//			listString.add(new String[]{"TransactionConfig", "Cursor", "TupleSerialBinding", "StoredClassCatalog"});
//			listString.add(new String[]{"Database", "DummyLockManager", "JEVersion", "BasicLocker", "BuddyLocker"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
//			listString.add(new String[]{"TxnEnd", "Database", "INList", "OffsetList", "Generation"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "UtfOps", "FastInputStream"});
//			listString.add(new String[]{"DummyLockManager", "INList", "OffsetList", "DbSpace", "PropUtil"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DummyLockManager", "PutMode", "DbEnvState", "IN", "Key"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Generation"});
//			
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "PutMode", "DbEnvState", "IN", "Key"});
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation"});
//			listString.add(new String[]{"TxnPrepare", "DbRunAction", "HexFormatter", "TxnEnd", "INList", "OffsetList"});
//			listString.add(new String[]{"JarMain", "TinyHashSet", "LevelOrderedINMap", "TupleSerialBinding", "StoredClassCatalog"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "DIN", "LogUtils", "LNLogEntry"});
//			listString.add(new String[]{"DbSpace", "PropUtil", "BasicLocker", "BuddyLocker"});
//			listString.add(new String[]{"DummyLockManager", "Sequence", "TransactionConfig"});
//			listString.add(new String[]{"Database", "JEVersion", "BasicLocker", "BuddyLocker"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker"});
//			listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DbSpace", "PropUtil"});
//			
//			listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "DbSpace", "PropUtil"});
//			listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key"});
//			listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap"});
//			listString.add(new String[]{"Sequence", "TransactionConfig", "UtfOps", "FastInputStream"});
//			listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog"});
//			listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Sequence", "TransactionConfig"});
//			listString.add(new String[]{"DIN", "Generation", "LogUtils", "LNLogEntry"});
//			listString.add(new String[]{"UtfOps", "FastInputStream"});
//			listString.add(new String[]{"BasicLocker", "BuddyLocker", "LogUtils", "LNLogEntry"});
//			listString.add(new String[]{"JoinConfig", "TransactionConfig", "Cursor", "DbSpace", "PropUtil"});

			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
			
			/* 7 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3,5,6,7,8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,11,13,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,18,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15,20,21,22,27,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,8,15,20,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,14,15,19,21,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,9,11,20,21,27,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,21,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,17,19,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,10,11,14,18,20,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,10,14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,18,20,21))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,23,24,25,26,30,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,16,17,19))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,23,24,27,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,16,25,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(23,25,26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7,30,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,13,16,24,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,23,26,27,28))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24,30))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(26))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(18,19,20,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,15,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(17,21,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,19,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(21,25))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,23))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,25,26,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,24,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,15,18,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(24))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(22,25,31))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,6,29))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,15,22))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(16,18,20))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(25,27))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(30))));
			
			/* 5 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15,4,14,10,13))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,10,13,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,3,2,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,8,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,12,8,11,2,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,10,3,2,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,2,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,3,11,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,10,12,4,3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,14,12))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,4,3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,6,9,7,11,5,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,11,3,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,6,9,8,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,11,7,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,5,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,13,11,12,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,6,11,8,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,11,3,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(13,8,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,7))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,7,11,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,9,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,8,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,7,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(15,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,8,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,4,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));

			/* 3 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,1,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
			
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
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6"))));
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
			}
			else if(i == 2){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P7"))));
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3"))));
			}
			else if(i == 3){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6", "P7"))));
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 4){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P4","P5","P6","P7"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
			}
			else if(i == 5){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5","P6", "P7"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 6){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P1"))));
			}
			else if(i == 7){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
			}
			else if(i == 8){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P7","P4","P5","P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
			}
			else if(i == 9){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
			}
			else if(i == 10){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P5","P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P4"))));
			}
			else if(i == 11){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P7"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
			}
			else if(i == 12){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5","P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5"))));
			}
			else if(i == 13){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P4","P5","P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5","P4"))));
			}
			else if(i == 14){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P5","P6"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P3","P4"))));
			}
			else if(i == 15){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4","P7"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P5"))));
			}
			else if(i == 16){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P7"))));
			}
			else if(i == 17){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P7"))));
			}
			else if(i == 18){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5","P6"))));
			}
			else if(i == 19){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4","P6"))));
			}
			else if(i == 20){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P6"))));
			}
			else if(i == 21){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P7"))));
			}
			else if(i == 22){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4","P5"))));
			}
			else if(i == 23){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P1","P2","P3","P6"))));
			}
			else if(i == 24){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P5"))));
			}
			else if(i == 25){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P5"))));
			}
			else if(i == 26){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3","P4"))));
			}
			else if(i == 27){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P3","P4"))));
			}
			else if(i == 28){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P5"))));
			}
			else if(i == 29){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P4"))));
			}
			else if(i == 30){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2","P3"))));
			}
			else if(i == 31){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("P2"))));
			}
		}

		return ret;
	}

}