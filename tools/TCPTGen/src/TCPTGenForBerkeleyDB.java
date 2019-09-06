import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TCPTGenForBerkeleyDB {
	static List<File> files;		//global
	static int notGeneratedAnyTestCount = 0;
	
	public static void main(String[] args) throws IOException{
		long st = System.currentTimeMillis();
		File outFile;
		BufferedWriter writer;
		outFile = new File("C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/SPLTestSelection/BerkeleyDB3_TCs.xml");
		writer = new BufferedWriter(new FileWriter(outFile));

		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
		writer.write("<SPL>\r\n");

		List<String> TCs = new ArrayList<String>();

		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>P1</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("BerkeleyDB3_P1", "evosuite-tests1"));
		TCs.addAll(allTCs("BerkeleyDB3_P1", "evosuite-tests2"));
		TCs.addAll(allTCs("BerkeleyDB3_P1", "evosuite-tests3"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();

		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>P2</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("BerkeleyDB3_P2", "evosuite-tests1"));
		TCs.addAll(allTCs("BerkeleyDB3_P2", "evosuite-tests2"));
		TCs.addAll(allTCs("BerkeleyDB3_P2", "evosuite-tests3"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();
		
		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>P3</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("BerkeleyDB3_P3", "evosuite-tests1"));
		TCs.addAll(allTCs("BerkeleyDB3_P3", "evosuite-tests2"));
		TCs.addAll(allTCs("BerkeleyDB3_P3", "evosuite-tests3"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();
		
		writer.write("</SPL>");

		writer.close();
		
		System.out.println("done !!");
		
		long et1 = System.currentTimeMillis();
		System.out.println("Step 1a, 1b: " + (et1 - st)+" ms");
	}

	public static List<String> allTCs(String projectName, String packName){
		List<String> ret = new ArrayList<String>();
		files = new ArrayList<File>();

		String path = "C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\"+ projectName + "\\" + packName;
		
		subDirList(path);
//		File dir = new File(path);

//		File[] files = dir.listFiles();
		List<String> data;

		for(File f : files){
			String fName = "";
			String CanPath = f.getPath();
			String sp = CanPath.replace("\\", ".");
			String ssp[] = sp.split("[.]");
			
			fName = ssp[7];
			for(int i = 8; i<ssp.length; i++){
				if(ssp[i].equals("java"))
					break;
				fName += "." + ssp[i];
			}
			
			try {
				data = Files.readAllLines(Paths.get(f.getAbsolutePath()));
				data.removeIf(i->{return !(i.contains("public void test") || i.contains("public void notGeneratedAnyTest"));});

				for(String methodSig : data){
					if(methodSig.contains("public void test")){
						methodSig = methodSig.trim();
						String[] words = methodSig.split(" ");
						ret.add(packName + "." + fName + "." + words[2]);
						//ret.add(fName + "." + words[2]);	//in case of 7 products *****************************
					}else if(methodSig.contains("public void notGeneratedAnyTest")){
						notGeneratedAnyTestCount++;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		files.clear();
		//		    	System.out.println(ret.size());
		return ret;
	}
	
	public static void subDirList(String source){
		File dir = new File(source); 
		File[] fileList = dir.listFiles(); 
		try{
			for(int i = 0 ; i < fileList.length ; i++){
				File file = fileList[i]; 
				if(file.isFile()){
					files.add(file);
				}else if(file.isDirectory()){
					subDirList(file.getCanonicalPath().toString()); 
				}
			}
		}catch(IOException e){	
		}
	}
}