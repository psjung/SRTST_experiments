import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TCPTGenForWiper {
	static List<File> files;		//global
	static int notGeneratedAnyTestCount = 0;
	
	public static void main(String[] args) throws IOException{
		File outFile;
		BufferedWriter writer;
		outFile = new File("C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/SPLTestSelection/Wiper_TCs.xml");
		writer = new BufferedWriter(new FileWriter(outFile));

		writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
		writer.write("<SPL>\r\n");

		List<String> TCs = new ArrayList<String>();

		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>Wiper_P1</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("Wiper_P1", "evosuite-tests"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();

		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>Wiper_P2</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("Wiper_P2", "evosuite-tests"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();

		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>Wiper_P3</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("Wiper_P3", "evosuite-tests"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();
		
		writer.write("\t<Product>\r\n");
		writer.write("\t\t<name>Wiper_P4</name>\r\n");
		writer.write("\t\t<TestCases>");
		TCs.addAll(allTCs("Wiper_P4", "evosuite-tests"));
		writer.write(TCs.toString().replace("[", "").replace("]", ""));

		writer.write("</TestCases>\r\n");
		writer.write("\t</Product>\r\n");
		TCs.clear();
		
		writer.write("</SPL>");

		writer.close();
		
		System.out.println("done !!");
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