import java.io.File;
import java.util.Arrays;
import java.util.HashSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ImpactedClasses {
	private static HashSet<String> impactedClassList = null;
	
	public static HashSet<String> getImpactedClasses(String impactedCodeFilePath){
		
		System.out.println("reading and parsing -- " + impactedCodeFilePath);
		
		try{
			File TCsFile = new File(impactedCodeFilePath);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(TCsFile);
			doc.getDocumentElement().normalize();
			
			String impactedClass = doc.getFirstChild().getTextContent();
			impactedClass = impactedClass.replace(" ", "");
			impactedClassList = new HashSet<String>(Arrays.asList(impactedClass.split(",")));

		}catch(Exception e){
			e.printStackTrace();
		}

		return impactedClassList;
	}
	
	public static void printImpactedClassList(){
		try{
			SPLTestSelectionSystem_Wiper.writer.write("\r\n--\r\n");
			SPLTestSelectionSystem_Wiper.writer.write("<Impacted Class List>\r\n");
			SPLTestSelectionSystem_Wiper.writer.write(impactedClassList.toString() + "\r\n");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}