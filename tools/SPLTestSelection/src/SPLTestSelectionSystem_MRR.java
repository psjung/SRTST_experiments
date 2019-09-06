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

public class SPLTestSelectionSystem_MRR {	
	private File outFile, conformanceSource;
	public static BufferedWriter writer, containmentWriter;

	HashMap<HashSet<String>, HashSet<String>> codePartitionTable;
	HashMap<HashSet<String>, HashSet<String>> testCasesPartitionTable;
	HashSet<String> impactedClassList;
	HashSet<HashSet<String>> impactedTestSuiteId;
	HashSet<String> affectedProducts;

	public SPLTestSelectionSystem_MRR(){
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
		SPLTestSelectionSystem_MRR system = new SPLTestSelectionSystem_MRR();
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
			File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MRR3_P1 CoverageInfo_c.txt");
			File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MRR3_P2 CoverageInfo_c.txt");
			File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MRR3_P3 CoverageInfo_c.txt");
		//	File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MRR_P4 CoverageInfo_c.txt");
		//	File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\MRR_P5 CoverageInfo_c.txt");

			

			List<List<String>> data = new ArrayList<List<String>>();
			try {
				data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//MRR_P1 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//MRR_P2 CoverageInfo.txt
				data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//MRR_P3 CoverageInfo.txt
		//		data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//MRR_P4 CoverageInfo.txt
		//		data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//MRR_P5 CoverageInfo.txt

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			/* MRR all mutations */
//			listString.add(new String[]{"CompatibilityRssFeed1", "CompatibilityRssFeed2", "CompatibilityRssFeed3", "CompatibilityRssItem1", "CompatibilityRssItem2"});
//			listString.add(new String[]{"CompatibilityRssItem3", "CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "RssFeed", "RssFeedStore", "Settings"});
//			listString.add(new String[]{"RssItem", "RssItunesFeed", "RssItunesItem", "RssReaderSettings", "RssShortItem", "RssStoreInfo", "AtomFormatParser", "Settings"});
//			listString.add(new String[]{"Controller", "ExtParser", "FeedFormatParser", "FeedListParser", "LineByLineParser", "OpmlParser", "RssFeedParser", "RssFormatParser", "HTMLParser"});
//			listString.add(new String[]{"URLHandler", "AllNewsList", "HelpForm", "ImportFeedsForm", "PromptForm", "PromptList", "PromptMgr", "Settings", "RssReaderMIDlet"});
//			listString.add(new String[]{"RssReaderMIDlet", "Settings", "HTMLAutoLinkParser"});
//			listString.add(new String[]{"SettingsForm", "UiUtil", "ChoiceGroup", "Form", "List", "Settings", "HTMLLinkParser"});
//			listString.add(new String[]{"StringItem", "TextBox", "TextField", "EncodingList", "TestingForm", "TestOutput", "Base64"});
//			listString.add(new String[]{"Base64", "CauseException", "CauseMemoryException", "CauseRecStoreException"});
//			listString.add(new String[]{"CauseException", "CauseMemoryException", "CauseRecStoreException", "CauseRuntimeException", "CompatibilityBase64", "Settings", "URLHandler"});
//			
//			listString.add(new String[]{"EncodingStreamReader", "EncodingUtil", "Settings", "SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common", "HtmlView", "Settings", "RssReaderMIDlet"});
//			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl", "PageMgr", "PositionForm", "Settings", "HelpForm"});
//			listString.add(new String[]{"EncodingStreamReader", "EncodingUtil", "Settings", "SortUtil", "StringUtil", "XmlParser", "AbstractView", "Settings"});
//			listString.add(new String[]{"UTF8ISReader", "ResourceProviderME", "View", "RenderedWord", "BufferedHandler", "ConsoleHandler"});
//			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level", "Logger", "LogManager", "LogRecord", "RecStoreHandler", "SimpleFormatter", "Settings", "RssReaderMIDlet"});
//			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory", "KFileSelector", "KFileSelectorFactory"});
//			listString.add(new String[]{"KFileSelectorImpl", "KFileSelectorKicker", "KFileSelectorMgr", "KViewChild", "KViewParent", "Settings"});
//			listString.add(new String[]{"Settings"});
//			listString.add(new String[]{"RssItem", "RssItunesFeed", "RssItunesItem", "RssReaderSettings", "RssShortItem", "Settings"});
//			listString.add(new String[]{"RssShortItem", "RssStoreInfo", "AtomFormatParser", "Controller", "ExtParser", "Settings", "RssReaderMIDlet"});
//			
//			listString.add(new String[]{"CompatibilityBase64", "EncodingStreamReader", "EncodingUtil"});
//			listString.add(new String[]{"PageCustomItem", "PageImpl", "PageMgr", "CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "RssFeed", "Settings"});
//			listString.add(new String[]{"ChoiceGroup", "Form", "ConsoleHandler", "Formatter", "FormHandler", "Handler", "Level", "Settings"});
//			listString.add(new String[]{"CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "XmlParser", "AbstractView", "Common", "HtmlView", "ImportFeedsForm"});
//			listString.add(new String[]{"AllNewsList", "HelpForm", "RssFeedParser", "RssFormatParser", "URLHandler"});
//			listString.add(new String[]{"View", "RenderedWord", "BufferedHandler", "ConsoleHandler", "Formatter", "FormHandler", "Handler"});
//			listString.add(new String[]{"KFileSelectorKicker", "KFileSelectorMgr", "KViewChild", "Settings", "RssReaderMIDlet"});
//			listString.add(new String[]{"Settings"});
//			listString.add(new String[]{"XmlParser", "AbstractView", "Common", "HtmlView", "PageImpl", "PageMgr", "PositionForm", "UTF8ISReader"});
//			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl", "Settings"});
//			
//			listString.add(new String[]{"LogManager", "LogRecord", "RecStoreHandler", "Page", "PageCanvas", "PageCustomItem", "Settings"});
//			listString.add(new String[]{"Formatter", "FormHandler", "RssReaderMIDlet"});
//			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl", "SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common"});
//			listString.add(new String[]{"CompatibilityRssFeed3", "CompatibilityRssItem1", "Settings"});
//			listString.add(new String[]{"RssFeedParser", "RssFormatParser", "URLHandler", "CompatibilityRssFeed3", "CompatibilityRssItem1"});
//			listString.add(new String[]{"SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common", "RssReaderMIDlet"});
//			listString.add(new String[]{"XmlParser", "AbstractView", "Common", "HtmlView", "AllNewsList", "HelpForm", "RssReaderMIDlet"});
//			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory", "RssReaderMIDlet"});
//			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level", "AtomFormatParser", "Controller", "Settings"});
//			listString.add(new String[]{"LogManager", "LogRecord", "RecStoreHandler", "PageCustomItem", "PageImpl", "PageMgr"});
//			
//			listString.add(new String[]{"LineByLineParser", "OpmlParser", "RssFeedParser", "RssReaderMIDlet"});
//			listString.add(new String[]{"Settings", "RssReaderMIDlet"});
//			listString.add(new String[]{"KFileSelectorKicker", "KFileSelectorMgr", "KViewChild"});
//			listString.add(new String[]{"LineByLineParser", "OpmlParser", "RssFeedParser", "Settings", "SettingsForm", "UiUtil"});
//			listString.add(new String[]{""});
//			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level"});
//			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory"});
//			listString.add(new String[]{"Settings"});
//			listString.add(new String[]{"ChoiceGroup", "Form", "LogManager", "LogRecord", "RecStoreHandler"});
//			listString.add(new String[]{""});
			
			/* MRR only common mutations */
			listString.add(new String[]{"CompatibilityRssFeed1", "CompatibilityRssFeed2", "CompatibilityRssFeed3", "CompatibilityRssItem1", "CompatibilityRssItem2"});
			listString.add(new String[]{"CompatibilityRssItem3", "CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "RssFeed", "RssFeedStore"});
			listString.add(new String[]{"RssItem", "RssItunesFeed", "RssItunesItem", "RssReaderSettings", "RssShortItem", "RssStoreInfo", "AtomFormatParser"});
			listString.add(new String[]{"Controller", "ExtParser", "FeedFormatParser", "FeedListParser", "LineByLineParser", "OpmlParser", "RssFeedParser", "RssFormatParser"});
			listString.add(new String[]{"URLHandler", "AllNewsList", "HelpForm", "ImportFeedsForm", "PromptForm", "PromptList", "PromptMgr"});
			listString.add(new String[]{"RssReaderMIDlet"});
			listString.add(new String[]{"SettingsForm", "UiUtil", "ChoiceGroup", "Form", "List"});
			listString.add(new String[]{"StringItem", "TextBox", "TextField", "EncodingList", "TestingForm", "TestOutput", "Base64"});
			listString.add(new String[]{"Base64", "CauseException", "CauseMemoryException", "CauseRecStoreException"});
			listString.add(new String[]{"CauseException", "CauseMemoryException", "CauseRecStoreException", "CauseRuntimeException", "CompatibilityBase64"});
			listString.add(new String[]{"EncodingStreamReader", "EncodingUtil", "Settings", "SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common", "HtmlView"});
			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl", "PageMgr", "PositionForm"});
			listString.add(new String[]{"EncodingStreamReader", "EncodingUtil", "Settings", "SortUtil", "StringUtil", "XmlParser", "AbstractView"});
			listString.add(new String[]{"UTF8ISReader", "ResourceProviderME", "View", "RenderedWord", "BufferedHandler", "ConsoleHandler"});
			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level", "Logger", "LogManager", "LogRecord", "RecStoreHandler", "SimpleFormatter"});
			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory", "KFileSelector", "KFileSelectorFactory"});
			listString.add(new String[]{"KFileSelectorImpl", "KFileSelectorKicker", "KFileSelectorMgr", "KViewChild", "KViewParent"});
			listString.add(new String[]{""});
			listString.add(new String[]{"RssItem", "RssItunesFeed", "RssItunesItem", "RssReaderSettings", "RssShortItem"});
			listString.add(new String[]{"RssShortItem", "RssStoreInfo", "AtomFormatParser", "Controller", "ExtParser"});
			listString.add(new String[]{"CompatibilityBase64", "EncodingStreamReader", "EncodingUtil"});
			listString.add(new String[]{"PageCustomItem", "PageImpl", "PageMgr", "CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "RssFeed"});
			listString.add(new String[]{"ChoiceGroup", "Form", "ConsoleHandler", "Formatter", "FormHandler", "Handler", "Level"});
			listString.add(new String[]{"CompatibilityRssItunesFeed3", "CompatibilityRssItunesItem3", "XmlParser", "AbstractView", "Common", "HtmlView"});
			listString.add(new String[]{"AllNewsList", "HelpForm", "RssFeedParser", "RssFormatParser", "URLHandler"});
			listString.add(new String[]{"View", "RenderedWord", "BufferedHandler", "ConsoleHandler", "Formatter", "FormHandler", "Handler"});
			listString.add(new String[]{"KFileSelectorKicker", "KFileSelectorMgr", "KViewChild"});
			listString.add(new String[]{""});
			listString.add(new String[]{"XmlParser", "AbstractView", "Common", "HtmlView", "PageImpl", "PageMgr", "PositionForm", "UTF8ISReader"});
			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl"});
			listString.add(new String[]{"LogManager", "LogRecord", "RecStoreHandler", "Page", "PageCanvas", "PageCustomItem"});
			listString.add(new String[]{"Formatter", "FormHandler"});
			listString.add(new String[]{"Page", "PageCanvas", "PageCustomItem", "PageImpl", "SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common"});
			listString.add(new String[]{"CompatibilityRssFeed3", "CompatibilityRssItem1"});
			listString.add(new String[]{"RssFeedParser", "RssFormatParser", "URLHandler", "CompatibilityRssFeed3", "CompatibilityRssItem1"});
			listString.add(new String[]{"SortUtil", "StringUtil", "XmlParser", "AbstractView", "Common"});
			listString.add(new String[]{"XmlParser", "AbstractView", "Common", "HtmlView", "AllNewsList", "HelpForm"});
			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory"});
			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level", "AtomFormatParser", "Controller"});
			listString.add(new String[]{"LogManager", "LogRecord", "RecStoreHandler", "PageCustomItem", "PageImpl", "PageMgr"});
			listString.add(new String[]{"LineByLineParser", "OpmlParser", "RssFeedParser"});
			listString.add(new String[]{""});
			listString.add(new String[]{"KFileSelectorKicker", "KFileSelectorMgr", "KViewChild"});
			listString.add(new String[]{"LineByLineParser", "OpmlParser", "RssFeedParser"});
			listString.add(new String[]{""});
			listString.add(new String[]{"Formatter", "FormHandler", "Handler", "Level"});
			listString.add(new String[]{"FormLoggerMIDlet", "RecStoreLoggerMIDlet", "FileSelectorFactory"});
			listString.add(new String[]{""});
			listString.add(new String[]{"ChoiceGroup", "Form", "LogManager", "LogRecord", "RecStoreHandler"});
			listString.add(new String[]{""});
			
			ArrayList<HashSet<HashSet<String>>> variablePartChanges = new ArrayList<HashSet<HashSet<String>>>();
		
			/* 5 products */
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,8,9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,8,10))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,15,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,7,11,12))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11,12,14,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,11,12))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(12,14,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,6,8,10,11))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4,7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,8,10,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8,12,14,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9,12))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,9,12,14,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,12,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,8,10,12,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6,8,10))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,5,8))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4,6,8,9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(11))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,15,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,7,10))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,7,9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(1,2,3,5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10,15,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(7,9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,6,7,9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(8))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7,11))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,6,8,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(9))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(14,15,16))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,15))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(6,7,8))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,6,7,8,10,11,12))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,9,10))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,6,7))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,7,9,10))));
			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(10))));
			
			/* 3 products */
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4,5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,5,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(2,3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2,3,4))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(5,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList(3,2))));
//			variablePartChanges.add(func(new ArrayList<Integer>(Arrays.asList())));
			
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
				
				HashSet<HashSet<String>> hshs = Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1","MRR_P2","MRR_P3","MRR_P4","MRR_P5")));
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
				
			}
			else if(i == 2){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1","MRR_P3","MRR_P4","MRR_P5"))));
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1","MRR_P3"))));
			}
			else if(i == 3){
				//ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1","MRR_P4","MRR_P5"))));

			}
			else if(i == 4){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P2"))));
			}
			else if(i == 5){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1"))));
			}
			else if(i == 6){
				
			}
			else if(i == 7){
				
			}
			else if(i == 8){
				
			}
			else if(i == 9){
				
			}
			else if(i == 10){
				
			}
			else if(i == 11){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P2","MRR_P4"))));
			}
			else if(i == 12){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P1","MRR_P5"))));
			}
			else if(i == 13){
				
			}
			else if(i == 14){
				
			}
			else if(i == 15){
				ret.addAll(Util.powerSet(new HashSet<String>(Arrays.asList("MRR_P5"))));
			}
			else if(i == 16){
				
			}
		}

		return ret;
	}

}