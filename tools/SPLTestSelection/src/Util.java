import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Util {
	
/*	public static void getJavaFileListFromDir(HashSet<String> JavaFiles, File dir){
		
		if(dir.isDirectory()) {
            File[] children = dir.listFiles();
            for(File f : children) {
            	getJavaFileListFromDir(JavaFiles,f);
            }
        } else {
        	int pos = dir.getName().lastIndexOf( "." );
			String ext = dir.getName().substring( pos + 1 );
			
			if(ext.equals("java"))
				JavaFiles.add(dir.getPath());
        }

	}
	*/
	public static void getClassesNameFromFile(HashSet<String> classNames, HashSet<String> paths){
		List<String> data = null;

		for(String p : paths){			
			System.out.println("reading and parsing -- " + p);
			try {
				data = Files.readAllLines(Paths.get(p));
			} catch (IOException e) {
				e.printStackTrace();
			}

			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			parser.setResolveBindings(true);
			parser.setSource(data.toString().toCharArray());

			CompilationUnit cu = (CompilationUnit)parser.createAST(null);
			cu.accept(new ASTVisitor(){
				
				public boolean visit(TypeDeclaration type){
					
					classNames.add(type.getName().toString());
					return true;
				}
			});
		}

	}
	
	public static void printHashMap(HashMap map, String prefix){
		Iterator iterator = map.keySet().iterator();
		try{
			while (iterator.hasNext()) {
				Object o = iterator.next();
				if(o instanceof String){
					String key = (String)o;
					SPLTestSelectionSystem_Wiper.writer.write("key = "+key+" / value = "+map.get(key) + "\r\n");  // 출력
				}
				else if(o instanceof HashSet){
					HashSet<String> key = (HashSet)o;

					String keyOnSetFormat = key.toString().replace("[", "{").replace("]", "}");
					HashSet<String> s = (HashSet<String>)map.get(key);
					SPLTestSelectionSystem_Wiper.writer.write("**" + prefix + "("+keyOnSetFormat+") " + s.size() + "= "+map.get(key) + "\r\n");  // 출력
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static <T> HashSet<HashSet<T>> powerSet(HashSet<T> originalSet) {
		HashSet<HashSet<T>> sets = new HashSet<HashSet<T>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<T>());
			return sets;
		}
		List<T> list = new ArrayList<T>(originalSet);
		T head = list.get(0);
		HashSet<T> rest = new HashSet<T>(list.subList(1, list.size())); 
		for (HashSet<T> set : powerSet(rest)) {
			HashSet<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}		
		return sets;
	}

}