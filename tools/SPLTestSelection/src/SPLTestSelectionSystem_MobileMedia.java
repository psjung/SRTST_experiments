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

public class SPLTestSelectionSystem_MobileMedia {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_MobileMedia(){
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
		SPLTestSelectionSystem_MobileMedia system = new SPLTestSelectionSystem_MobileMedia();
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
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MobileMedia_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MobileMedia_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MobileMedia_P3 CoverageInfo_c.txt");
			File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MobileMedia_P4 CoverageInfo_c.txt");

			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//MobileMedia_P1 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//MobileMedia_P2 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//MobileMedia_P3 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//MobileMedia_P4 CoverageInfo.txt

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			/* MRR all mutations */
			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "AbstractController", "AlbumController", "MediaController", "MediaController", "AddMediaToAlbum", "AlbumListScreen"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController", "MediaListController", "AlbumController", "VideoCaptureController"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton", "SelectMediaController", "AlbumData", "MediaAccessor", "CaptureVideoScreen", "AlbumListScreen"});
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "MainUIMidlet", "CaptureVideoScreen"});
//			listString.add(new String[]{"AddMediaToAlbum", "AlbumListScreen", "MediaListScreen", "NewLabelScreen", "MediaListScreen", "AlbumListScreen", "MediaController"});
//			listString.add(new String[]{"PasswordScreen", "PlayMediaScreen", "SelectTypeOfMedia", "Constants", "MediaUtil", "CaptureVideoScreen"});
//			listString.add(new String[]{"ImageNotFoundException", "ImagePathNotValidException", "InvalidArrayFormatException", "CaptureVideoScreen", "MediaListScreen", "PlayVideoController"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException", "PersistenceMechanismException"});
//			listString.add(new String[]{"UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging", "SmsReceiverController", "MediaController", "PhotoViewController"});
//			listString.add(new String[]{"SmsReceiverThread", "SmsSenderController", "SmsSenderThread", "PlayVideoScreen", "AlbumData", "AddMediaToAlbum"});
//			
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "NetworkScreen", "SmsMessaging", "VideoCaptureController", "AlbumController"});
//			listString.add(new String[]{"MediaUtil", "ImageNotFoundException", "AddMediaToAlbum", "AlbumListScreen"});
//			listString.add(new String[]{"AlbumController", "BaseController", "MediaListScreen"});
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "ScreenSingleton", "SelectMediaController", "AlbumData", "ImageMediaAccessor"});
//			listString.add(new String[]{"ScreenSingleton", "SelectMediaController", "AlbumData", "AlbumListScreen", "MediaListController"});
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "NetworkScreen", "SmsMessaging", "PhotoViewScreen", "AlbumListScreen"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "PhotoViewController", "NewLabelScreen"});
//			listString.add(new String[]{"AddMediaToAlbum"});
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "MediaController"});
//			listString.add(new String[]{"AlbumController", "BaseController", "CaptureVideoScreen", "AddMediaToAlbum"});
//			
//			listString.add(new String[]{"SmsReceiverController", "SmsReceiverThread", "SmsSenderController", "VideoCaptureController", "AlbumListScreen", "NewLabelScreen"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "PlayMediaScreen", "SelectTypeOfMedia", "SelectMediaController"});
//			listString.add(new String[]{"AlbumController", "BaseController", "MediaUtil", "ImageNotFoundException"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController", "CaptureVideoScreen", "AlbumData", "AddMediaToAlbum", "AlbumListScreen"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException", "CaptureVideoScreen", "PlayVideoScreen"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging", "AddMediaToAlbum"});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor", "AddMediaToAlbum"});
//			listString.add(new String[]{"SmsSenderController", "SmsSenderThread", "MusicPlayController", "ScreenSingleton", "MediaListScreen"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController", "PersistenceMechanismException", "UnavailablePhotoAlbumException", "CaptureVideoScreen", "CaptureVideoScreen", "ImageMediaAccessor", "AddMediaToAlbum", "AlbumListScreen"});
//			listString.add(new String[]{"MediaController", "PhotoViewController", "AddMediaToAlbum"});
//			
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "BaseThread", "AbstractController", "CaptureVideoScreen"});
//			listString.add(new String[]{"BaseThread", "AbstractController", "MediaListScreen", "MediaListScreen"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton", "PlayVideoScreen", "MediaListController"});
//			listString.add(new String[]{"SmsReceiverController", "SmsReceiverThread", "SmsSenderController", "ImageMediaAccessor", "AddMediaToAlbum", "AlbumListScreen"});
//			listString.add(new String[]{"UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging", "PhotoViewScreen", "AddMediaToAlbum", "AlbumController"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException", "CaptureVideoScreen", "AddMediaToAlbum"});
//			listString.add(new String[]{"AlbumData", "MediaAccessor", "MediaData", "PlayVideoScreen", "MediaListScreen", "AlbumData", "AlbumListScreen"});
//			listString.add(new String[]{"AlbumListScreen"});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor", "SelectTypeOfMedia", "Constants"});
//			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "SelectTypeOfMedia", "Constants", "MediaListScreen", "ImageMediaAccessor"});
//			
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "SmsSenderController", "SmsSenderThread", "PersistenceMechanismException", "UnavailablePhotoAlbumException", "VideoCaptureController", "AddMediaToAlbum"});
//			listString.add(new String[]{"AlbumData", "MediaAccessor", "MediaData", "AddMediaToAlbum", "CaptureVideoScreen"});
//			listString.add(new String[]{"PlayMediaScreen", "SelectTypeOfMedia", "ImageMediaAccessor", "AlbumController"});
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "BaseThread", "AbstractController", "AlbumData"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException", "CaptureVideoScreen", "MediaListScreen", "PlayVideoScreen", "MediaListScreen", "VideoMediaAccessor"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton", "MediaListScreen", "AlbumListScreen", "AlbumController"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController"});
//			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging", "MediaListScreen", "AlbumListScreen", "MediaListController"});
//			listString.add(new String[]{"ScreenSingleton", "SelectMediaController", "AlbumData", "CaptureVideoScreen", "PhotoViewController", "AddMediaToAlbum", "AlbumListScreen", "NewLabelScreen"});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor", "MediaListScreen", "AddMediaToAlbum", "AlbumListScreen"});

			
			/* MRR only common mutations */
//			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "AbstractController", "AlbumController"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController", "MediaListController"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton", "SelectMediaController", "AlbumData", "MediaAccessor"});
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "MainUIMidlet"});
//			listString.add(new String[]{"AddMediaToAlbum", "AlbumListScreen", "MediaListScreen", "NewLabelScreen"});
//			listString.add(new String[]{"PasswordScreen", "PlayMediaScreen", "SelectTypeOfMedia", "Constants", "MediaUtil"});
//			listString.add(new String[]{"ImageNotFoundException", "ImagePathNotValidException", "InvalidArrayFormatException"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException", "PersistenceMechanismException"});
//			listString.add(new String[]{"UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging", "SmsReceiverController"});
//			listString.add(new String[]{"SmsReceiverThread", "SmsSenderController", "SmsSenderThread"});
//			
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{"MediaUtil", "ImageNotFoundException"});
//			listString.add(new String[]{"AlbumController", "BaseController"});
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "ScreenSingleton", "SelectMediaController", "AlbumData"});
//			listString.add(new String[]{"ScreenSingleton", "SelectMediaController", "AlbumData"});
//			listString.add(new String[]{"MediaData", "MusicAlbumData", "NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{""});
//			listString.add(new String[]{"MediaData", "MusicAlbumData"});
//			listString.add(new String[]{"AlbumController", "BaseController"});
//			
//			listString.add(new String[]{"SmsReceiverController", "SmsReceiverThread", "SmsSenderController"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "PlayMediaScreen", "SelectTypeOfMedia"});
//			listString.add(new String[]{"AlbumController", "BaseController", "MediaUtil", "ImageNotFoundException"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException"});
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor"});
//			listString.add(new String[]{"SmsSenderController", "SmsSenderThread", "MusicPlayController", "ScreenSingleton"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController", "PersistenceMechanismException", "UnavailablePhotoAlbumException"});
//			listString.add(new String[]{""});
//			
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "BaseThread", "AbstractController"});
//			listString.add(new String[]{"BaseThread", "AbstractController"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton"});
//			listString.add(new String[]{"SmsReceiverController", "SmsReceiverThread", "SmsSenderController"});
//			listString.add(new String[]{"UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException"});
//			listString.add(new String[]{"AlbumData", "MediaAccessor", "MediaData"});
//			listString.add(new String[]{""});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor", "SelectTypeOfMedia", "Constants"});
//			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "SelectTypeOfMedia", "Constants"});
//			
//			listString.add(new String[]{"NetworkScreen", "SmsMessaging", "SmsSenderController", "SmsSenderThread", "PersistenceMechanismException", "UnavailablePhotoAlbumException"});
//			listString.add(new String[]{"AlbumData", "MediaAccessor", "MediaData"});
//			listString.add(new String[]{"PlayMediaScreen", "SelectTypeOfMedia"});
//			listString.add(new String[]{"NewLabelScreen", "PasswordScreen", "BaseThread", "AbstractController"});
//			listString.add(new String[]{"InvalidImageDataException", "InvalidImageFormatException", "InvalidPhotoAlbumNameException"});
//			listString.add(new String[]{"MusicPlayController", "ScreenSingleton"});
//			listString.add(new String[]{"BaseController", "ControllerInterface", "MediaController"});
//			listString.add(new String[]{"CoverageInfo", "BaseMessaging", "BaseThread", "UnavailablePhotoAlbumException", "NetworkScreen", "SmsMessaging"});
//			listString.add(new String[]{"ScreenSingleton", "SelectMediaController", "AlbumData"});
//			listString.add(new String[]{"SelectMediaController", "AlbumData", "MediaAccessor"});

			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
		
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,9,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,6,8))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,6,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,8))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,9,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6,8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,5,8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6,8))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,6,8,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,5,8,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,5,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,6,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,9))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,6))));
//			
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,8))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3,4,11))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,9,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,9,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,8,9,10))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,8,9))));
			
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
				
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P2","MobileMedia_P3","MobileMedia_P4")));
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
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P2","MobileMedia_P4"))));
			}
			else if(i == 2){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P3","MobileMedia_P4"))));
			}
			else if(i == 3){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P2","MobileMedia_P4"))));
			}
			else if(i == 4){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P2"))));
			}
			else if(i == 5){
				
			}
			else if(i == 6){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P3"))));
			}
			else if(i == 7){
				
			}
			else if(i == 8){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P2","MobileMedia_P3","MobileMedia_P4"))));
			}
			else if(i == 9){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P3"))));
			}
			else if(i == 10){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P4"))));
			}
			else if(i == 11){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MobileMedia_P1","MobileMedia_P2"))));
			}
		}

		return ret;
	}

}