// gligoric 방법을 SPL에 naive 하게 적용

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GligoricSelection_BerkeleyDB {
	public static void main(String[] args){
		ArrayList<String[]> listString = new ArrayList<String[]>(); 
		
		long start = System.currentTimeMillis();
		
		File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P1 CoverageInfo.txt");
		File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P2 CoverageInfo.txt");
		File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P3 CoverageInfo.txt");
		File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P4 CoverageInfo.txt");
		File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P5 CoverageInfo.txt");
		File f6 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P6 CoverageInfo.txt");
		File f7 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\BerkelyDB_P7 CoverageInfo.txt");

		/* BerkeleyDB common + variable mutations */
		listString.add(new String[]{"Database", "Transaction", "Txn", "DbTree", "Java5LatchImpl", "Cleaner", "Checkpointer", "EnvironmentImpl", "FSyncManager", "TransactionStats", "CheckpointConfig"});
		listString.add(new String[]{"Database", "DbCompat", "DatabaseUtil", "DbInternal", "LockStats", "Checkpointer", "CheckpointerDaemon", "FileManager", "Txn", "LogBuffer" });
		listString.add(new String[]{"FileSummary", "Sequence", "TransactionConfig", "Cursor", "Environment", "OperationStatus", "PreloadStats", "DbInternal", "DeadlockException", "TupleBase"});
		listString.add(new String[]{"CursorImpl", "DbEnvPool", "PutMode", "DbEnvState", "IN", "Key", "VerifyConfig", "LookAheadCache", "Tracer"});
		listString.add(new String[]{"CheckpointFileReader", "FileHandle", "LogBuffer", "SearchFileReader", "DumpFileReader", "LogUtils", "LNLogEntry", "FileManager", "Evictor", "ChecksumValidator", "EnvironmentStats", "FileCache", "DbTree"});
		listString.add(new String[]{"SingleItemLogEntry", "RecoveryInfo", "RecoveryManager", "BIN", "Node", "DbTree"});
		listString.add(new String[]{"DIN", "Tree", "TreeStats", "Generation", "Txn", "LogBuffer"});
		listString.add(new String[]{"SearchResult", "TrackingInfo", "ChildReference", "TxnEnd", "EnvironmentImpl", "TransactionStats", "FileManager", "Evictor", "FileCache"});
		listString.add(new String[]{"AutoTxn", "Lock", "Locker", "LockerFactory", "ThreadLocker", "DbRecover", "DbTree", "ChecksumValidator"});
		listString.add(new String[]{"DbDump", "DbSpace", "PropUtil", "CmdUtil", "Tracer", "BitMap", "DeamonThread", "Checkpointer", "LogBuffer", "FileManager", "Tracer", "ChecksumValidator"});
		listString.add(new String[]{"UtfOps", "FastInputStream", "ByteArrayBinding", "RecordNumberBinding", "SerialInput", "SerialOutput", "LookAheadCache", "Tracer" });
		listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "TupleBase", "DoubleBinding", "LongBinding", "XAEnvironment", "LockMode", "EnvironmentImpl", "CheckpointConfig", "FileManager", "Evictor", "ChecksumValidator", "FileCache", "DbTree"});
		listString.add(new String[]{"GetMode, MemoryBudget", "DatabaseImpl", "LogEntryType", "DumpFileReader", "PrintFileReader", "FileReader", "Txn", "ChecksumValidator", "EnvironmentStats"});
		listString.add(new String[]{"Cursor", "JEVersion", "BasicLocker", "BuddyLocker", "LockManager", "LockerFactory", "VerifyConfig", "FSyncManager", "Tracer", "FileCache"});
		listString.add(new String[]{"DbEnvPool", "DbEnvState", "INList", "OffsetList", "DbCompat", "MapLN", "TreeLocation", "EnvironmentImpl", "Checkpointer", "FileManager", "LogBuffer", "cleaner", "Evictor", "ChecksumValidator"});
		listString.add(new String[]{"DatabaseUtil", "JoinConfig", "SecondaryTrigger", "Sequence", "ShortConfigParam", "SortedLSNTreeWalker", "DupCountLN", "Generation", "Key", "Transaction", "Java5LatchImpl"});
		listString.add(new String[]{"INDeleteInfo", "TreeIterator", "JarMain", "TinyHashSet", "LevelOrderedINMap", "CheckpointConfig", "FileManager"});
		listString.add(new String[]{"ExceptionUnwrapper", "SerialSerialBinding", "UtilizationProfile", "RangeRestartException", "FileSource", "ScavengerFileReader", "Txn", "FileManager"});
		listString.add(new String[]{"DummyLockManager", "LockUpgrade", "TxnCommit", "WriteLockInfo", "DbLsn", "PropUtil", "Tracer", "DatabaseEntry", "CheckpointConfig", "Checkpointer", "LogBuffer"});
		listString.add(new String[]{"RootFlusher", "SyncedLockManager", "TxnPrepare", "DbRunAction", "HexFormatter", "EventTracer", "Adler32", "TupleTupleKeyCreator", "DbTree", "Checkpointer", "EnvironmentImpl", "LookAheadCache", "Evictor", "ChecksumValidator"});
		listString.add(new String[]{"TupleSerialBinding", "TxnCommit", "BIN", "AutoTxn", "Lock", "Locker", "ExceptionUnwrapper", "SerialSerialBinding", "Tree", "CursorImpl", "FileManager", "LogBuffer", "IN", "RecoveryManager", "EnvironmentImpl", "FileProcessor", "Txn", "DbDump", "DbLoad", "Evictor"});
		listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "Generation", "DbTree", "Tree", "CursorImpl", "VerifyConfig", "Tracer"});
		listString.add(new String[]{"TransactionConfig", "Cursor", "TupleSerialBinding", "StoredClassCatalog", "TransactionStats", "FileManager", "LogBuffer", "RecoveryManager", "IN", "FileCache","DbTree"});
		listString.add(new String[]{"Database", "DummyLockManager", "JEVersion", "BasicLocker", "BuddyLocker", "Cleaner", "Tree", "CursorImpl", "EnvironmentImpl", "IN", "Evictor", "UtilizationProfile", "Checkpointer"});
		listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "FileManager", "LogBuffer", "EnvironmentImpl", "FileProcessor", "Txn"});
		listString.add(new String[]{"TxnEnd", "Database", "INList", "OffsetList", "Generation", "EnvironmentImpl", "FSyncManager", "UtilizationProfile", "DbDump", "DbLoad", "IN", "Evictor","Checkpointer"});
		listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "UtfOps", "FastInputStream", "Checkpointer", "Txn", "Tree", "CursorImpl", "RecoveryManager", "EnvironmentImpl"});
		listString.add(new String[]{"DummyLockManager", "INList", "OffsetList", "DbSpace", "PropUtil", "FileProcessor", "FileManager", "LogBuffer", "Txn", "FileCache", "Evictor"});
		listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DummyLockManager", "PutMode", "DbEnvState", "IN", "Key", "DbDump", "DbLoad", "RecoveryManager"});
		listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Generation", "IN", "Evictor", "Checkpointer", "UtilizationProfile"});
		listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "PutMode", "DbEnvState", "IN", "Key", "FileProcessor", "Txn"});
		listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "Tracer", "Evictor", "LookAheadCache", "FileManager", "LogBuffer"});
		listString.add(new String[]{"TxnPrepare", "DbRunAction", "HexFormatter", "TxnEnd", "INList", "OffsetList", "FileManager", "Txn", "EnvironmentStats"});
		listString.add(new String[]{"JarMain", "TinyHashSet", "LevelOrderedINMap", "TupleSerialBinding", "StoredClassCatalog", "VerifyConfig", "ChecksumValidator", "EnvironmentStats"});
		listString.add(new String[]{"Sequence", "TransactionConfig", "DIN", "LogUtils", "LNLogEntry", "LatchStats", "EnvironmentStats", "Tracer"});
		listString.add(new String[]{"DbSpace", "PropUtil", "BasicLocker", "BuddyLocker", "ChecksumValidator", "EnvironmentImpl"});
		listString.add(new String[]{"DummyLockManager", "Sequence", "TransactionConfig", "EnvironmentStats", "FileManager", "LogBuffer"});
		listString.add(new String[]{"Database", "JEVersion", "BasicLocker", "BuddyLocker", "EnvironmentStats", "EnvironmentImpl", "FileProcessor", "Txn", "FileCache"});
		listString.add(new String[]{"BasicLocker", "BuddyLocker", "EnvironmentStats"});
		listString.add(new String[]{"ByteArrayBinding", "RecordNumberBinding", "DbSpace", "PropUtil", "Checkpointer", "DbTree"});
		listString.add(new String[]{"INList", "OffsetList", "DIN", "Generation", "DbSpace", "PropUtil", "FSyncManager", "EnvironmentImpl"});
		listString.add(new String[]{"PutMode", "DbEnvState", "IN", "Key", "FileManager", "RecoveryManager", "DbTree"});
		listString.add(new String[]{"JoinConfig", "JarMain", "TinyHashSet", "LevelOrderedINMap", "LogBuffer", "FileManager", "LookAheadCache", "Evictor"});
		listString.add(new String[]{"Sequence", "TransactionConfig", "UtfOps", "FastInputStream", "RecoveryManager", "IN"});
		listString.add(new String[]{"TupleSerialBinding", "StoredClassCatalog", "EnvironmentStats", "EnvironmentImpl", "UtilizationProfile", "Evictor", "Checkpointer", "IN"});
		listString.add(new String[]{"JEVersion", "BasicLocker", "BuddyLocker", "Sequence", "TransactionConfig", "EnvironmentImpl", "Checkpointer", "DbTree"});
		listString.add(new String[]{"DIN", "Generation", "LogUtils", "LNLogEntry", "FileManager", "LogBuffer", "LatchStats"});
		listString.add(new String[]{"UtfOps", "FastInputStream", "Tree", "CursorImpl", "LookAheadCache", "Evictor"});
		listString.add(new String[]{"BasicLocker", "BuddyLocker", "LogUtils", "LNLogEntry", "EnvironmentImpl", "FileCache"});
		listString.add(new String[]{"JoinConfig", "TransactionConfig", "Cursor", "DbSpace", "PropUtil", "DbDump", "DbLoad"});	
		
		/* BerkeleyDB only common mutations */
	/*	listString.add(new String[]{"Database", "Transaction", "Txn"});
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
		*/
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
		
		
		String TC = null;
		List<String> selectedTCs = new ArrayList<String>();
		
		/////////////////////////////////////////Result based on method level dependency information ////////////////////////////////////
		HashSet<String> tmp = new HashSet<String>();
		int num = 0;
		int id = 1;
		for(String[] changedClasses : listString){
			for(List<String> d : data){
		//		System.out.println(d.size());
				for(String s : d){
					if(s.contains("_ESTest")){
						TC = s;
					}else{
						for(String st : changedClasses){
							if(st.equals(s)){
								String[] sp = TC.split("[<>]")[1].split(": void ");
								selectedTCs.add(sp[0] + "." + sp[1]);		// TC selection
								tmp.add(sp[0] + "." + sp[1]);
							}
						}
					}
				}
				num += tmp.size();
			//	System.out.println(tmp.size());
				tmp.clear();
			}
			
			HashSet<String> HselectedTCs = new HashSet<String>(selectedTCs);
	
//			System.out.println("changed classes: " + id++);
			System.out.println("Selected number of TCs (method level):" + HselectedTCs.size());
		//	System.out.println(num);
			selectedTCs.clear();
			num = 0;
		}
		/*
		selectedTCs.clear();
		HselectedTCs.clear();
		/////////////////////////////////////////Result based on class level dependency information////////////////////////////////////
		ArrayList<String> hs = new ArrayList<String>();
		
		for(List<String> d : data){
			for(String s : d){
				if(s.contains("_ESTest")){
					String[] sp = s.split("[<>]")[1].split(": void ");
					hs.add(sp[0]);
				}
			}
		}
		
		for(List<String> d : data){
			for(String s : d){
				if(s.contains("_ESTest")){
					TC = s;
				}else{
					for(String st : changedClasses){
						if(st.equals(s)){
							String[] sp = TC.split("[<>]")[1].split(": void ");
							HselectedTCs.add(sp[0]);		// TC selection
						}
					}
				}
			}
		}
		
		int n = 0;
		for(String s : hs){
			for(String ss : HselectedTCs){
				if(s.equals(ss)){
					n++;
				}
			}
		}
		System.out.println("Selected number of TCs (class level): " + n);
		*/
		long end = System.currentTimeMillis();
		System.out.println("time: " + (end - start)+" ms");
	}
}
