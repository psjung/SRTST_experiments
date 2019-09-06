import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class TestsInvoke {
	static File d = new File("C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/BerkeleyDB-FH-Java_c.BerkeleyDB_P1/bin");
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, MalformedURLException{
		
		invokeAllMethods(d);
	} 
	
	public static void invokeAllMethods(File file) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, MalformedURLException{
		
	    if(file.isDirectory()) {
	    	for(File f : file.listFiles()) {
	    		invokeAllMethods(f);
	        }
	    }
	    else if(file.getName().contains("ESTest") && !file.getName().contains("scaffolding")){
	    	
	    	URL url = file.toURI().toURL();
	    	String classPath = url.getPath().substring(url.getPath().indexOf("bin")+4);
	    	classPath = classPath.replace("/", ".");

	    	String name = classPath.substring(0, classPath.lastIndexOf("."));
            if(name.contains("DbLsn")){
            	int i = 0;
            }
            ClassLoader cl = new URLClassLoader(new URL[]{url});	  
            Class c = cl.loadClass(name);
            
            Object o = c.newInstance();
            List<String> ret = new ArrayList<String>();
            
            Method[] methods = c.getDeclaredMethods();
            System.out.println("Path:" + url.toString());
            for(Method m : methods){
            	System.out.println("Testcase:" + c.getSimpleName() + "." + m.getName() + "()");
            	
    			m.invoke(o,null);
    			System.out.println();
            }
	    }

	    
		
//		URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file:///C:/Users/soo/Desktop/eclipse-java-mars-2-win32-x86_64/BerkeleyDB-FH-Java_c.BerkeleyDB_P1/bin")});
		
        //Class c = urlClassLoader.loadClass("com.sleepycat.bind.ByteArrayBinding_ESTest1");

		
		
    //	Class c = Class.forName("com.sleepycat.bind.ByteArrayBinding_ESTest1");
    	
    }
}
