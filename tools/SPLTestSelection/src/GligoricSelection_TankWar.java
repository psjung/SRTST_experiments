// gligoric 방법을 SPL에 naive 하게 적용

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GligoricSelection_TankWar {
	public static void main(String[] args){
		ArrayList<String[]> listString = new ArrayList<String[]>(); 
		
		long start = System.currentTimeMillis();
		
		File f1 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P1 CoverageInfo.txt");
		File f2 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P2 CoverageInfo.txt");
		File f3 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P3 CoverageInfo.txt");
		File f4 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P4 CoverageInfo.txt");
		File f5 = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\test1\\TankWar_P5 CoverageInfo.txt");

		/* TankWar common + variable mutations */
		listString.add(new String[]{"Menu","GameManager","Tool"});
		listString.add(new String[]{"Wall","Tool", "Maler"});
		listString.add(new String[]{"KeyMonitor","Tool"});
		listString.add(new String[]{"Menu"});
		listString.add(new String[]{"ExplodierenEffekt","Maler"});
		listString.add(new String[]{"MalerZeit","MIDlet"});
		listString.add(new String[]{"Menu","MIDlet","Option", "Missile","Maler"});
		listString.add(new String[]{"Missile"});
		listString.add(new String[]{"Wall","Tool"});
		listString.add(new String[]{"KeyMonitor", "Tool"});
		
		listString.add(new String[]{"KeyMonitor","Menu","MIDlet","GameObject", "Tool"});	
		listString.add(new String[]{"Maler","Tool"});
		listString.add(new String[]{"MapInfo","TankManager","Tool"});
		listString.add(new String[]{"Missile","Tank","Tool","Maler"});
		listString.add(new String[]{"Maler","Missile"});
		listString.add(new String[]{"Menu", "Maler","Tool"});
		listString.add(new String[]{"KeyMonitor","Menu","Tool","Maler"});
		listString.add(new String[]{"Tool","ExplodierenEffekt","InfoPanel","Maler"});
		listString.add(new String[]{"MapInfo","TankManager","Tool","Maler"});
		listString.add(new String[]{"GameObject","MalerZeit","Tool"});
		
		listString.add(new String[]{"Wall","Tool","Maler"});
		listString.add(new String[]{"Wall","Tool","Maler","Missile"});
		listString.add(new String[]{"Tank","Wall","Tool","ExplodierenEffekt","Maler"});
		listString.add(new String[]{"Maler","Missile"});
		listString.add(new String[]{"GameObject","MalerZeit","Maler","Tool"});
		listString.add(new String[]{"Menu","MIDlet","Option","Maler","Tool"});
		listString.add(new String[]{"Missile"});
		listString.add(new String[]{"MapInfo","Tool"});
		listString.add(new String[]{"Maler","Tool"});
		listString.add(new String[]{"Maler","Tool"});
		
		listString.add(new String[]{"Wall","Tool","MIDlet","Maler"});
		listString.add(new String[]{"MapInfo","Missile","Tool","Maler"});
		listString.add(new String[]{"Maler","Tool","Missile"});
		listString.add(new String[]{"Maler","Tool"});
		listString.add(new String[]{"Maler","Missile","InfoPanel","Tool"});
		listString.add(new String[]{"Wall","Tool","Maler"});
		listString.add(new String[]{"GameObject","MalerZeit","Maler","Tool"});
		listString.add(new String[]{"Option","GameObject","Tool"});
		listString.add(new String[]{"Tank","ExplodierenEffekt","KeyMonitor","Missile"});
		listString.add(new String[]{"Wall","Tool"});
		
		listString.add(new String[]{"Missile","Tank","Wall","Tool"});
		listString.add(new String[]{"KeyMonitor","Menu","MIDlet","Maler"});
		listString.add(new String[]{"Tool","ExplodierenEffekt","MalerZeit","Missile"});
		listString.add(new String[]{"Tool","ExplodierenEffekt","Maler"});
		listString.add(new String[]{"GameObject","Maler","Tool"});
		listString.add(new String[]{"Tool"});
		listString.add(new String[]{"ExplodierenEffekt", "Tool", "Maler"});
		listString.add(new String[]{"InfoPanel","KeyMonitor","Option","Missile","Maler"});
		listString.add(new String[]{"Wall","Tool","Maler","Missile"});
		listString.add(new String[]{"Menu","Maler","Tool"});
		
		/* TankWar only common mutations */
	/*	listString.add(new String[]{"Menu","GameManager","Maler","TankManager"});
			listString.add(new String[]{"Wall","Tool","Option","TankManager"});
			listString.add(new String[]{"KeyMonitor","Menu","MIDlet"});
			listString.add(new String[]{"Menu","MIDlet","Option"});
			listString.add(new String[]{"ExplodierenEffekt","InfoPanel","KeyMonitor"});
			listString.add(new String[]{"GameObject","MalerZeit","MIDlet","Option","GameManager"});
			listString.add(new String[]{"Menu","MIDlet","Option","GameManager","GameObject"});
			listString.add(new String[]{"ExplodierenEffekt","InfoPanel","KeyMonitor"});
			listString.add(new String[]{"Wall","Tool","Option","GameManager"});
			listString.add(new String[]{"KeyMonitor","Menu","MIDlet"});
			listString.add(new String[]{"KeyMonitor","Menu","MIDlet","Option","GameManager"});
			listString.add(new String[]{"KeyMonitor","Menu"});
			listString.add(new String[]{"MapInfo","TankManager","Tool","ExplodierenEffekt"});
			listString.add(new String[]{"Missile","Tank","Wall","Tool"});
			listString.add(new String[]{"Maler","Missile","Tank","Wall","Tool","ExplodierenEffekt"});
			listString.add(new String[]{"Menu","MIDlet","Option"});
			listString.add(new String[]{"KeyMonitor","Menu","MalerZeit","MapInfo"});
			listString.add(new String[]{"Tool","ExplodierenEffekt","InfoPanel","KeyMonitor","Menu","MIDlet","Option","GameManager"});
			listString.add(new String[]{"MapInfo","TankManager","Tool","ExplodierenEffekt"});
			listString.add(new String[]{"GameObject","MalerZeit","Tool","ExplodierenEffekt"});
			listString.add(new String[]{"Wall","Tool","ExplodierenEffekt","InfoPanel"});
			listString.add(new String[]{"Wall","Tool","KeyMonitor","TankManager"});
			listString.add(new String[]{"Tank","Wall","Tool","ExplodierenEffekt","InfoPanel","KeyMonitor"});
			listString.add(new String[]{"Maler","Missile","Tool","ExplodierenEffekt"});
			listString.add(new String[]{"GameObject","MalerZeit","MapInfo","TankManager"});
			listString.add(new String[]{"Menu","MIDlet","Option","GameManager","GameObject"});
			listString.add(new String[]{"GameObject","MalerZeit","InfoPanel"});
			listString.add(new String[]{"MapInfo","TankManager","InfoPanel"});
			listString.add(new String[]{"Maler","Missile","Tank"});
			listString.add(new String[]{"KeyMonitor","Menu"});
			listString.add(new String[]{"Wall","Tool","MIDlet","Option","GameManager"});
			listString.add(new String[]{"MapInfo","TankManager","Missile","Tank","Wall","Tool"});
			listString.add(new String[]{"InfoPanel","KeyMonitor"});
			listString.add(new String[]{"KeyMonitor","Menu"});
			listString.add(new String[]{"Maler","Missile","InfoPanel","KeyMonitor","Menu"});
			listString.add(new String[]{"Wall","Tool","MalerZeit","MapInfo"});
			listString.add(new String[]{"GameObject","MalerZeit","Menu","MIDlet"});
			listString.add(new String[]{"Menu","MIDlet","Option","GameManager","GameObject"});
			listString.add(new String[]{"Tank","Wall","Tool","ExplodierenEffekt","InfoPanel","KeyMonitor"});
			listString.add(new String[]{"Wall","Tool","InfoPanel","KeyMonitor","Menu"});
			listString.add(new String[]{"Missile","Tank","Wall","Tool","ExplodierenEffekt","InfoPanel"});
			listString.add(new String[]{"KeyMonitor","Menu","MIDlet","Option","GameManager"});
			listString.add(new String[]{"Tool","ExplodierenEffekt","MalerZeit","MapInfo","TankManager"});
			listString.add(new String[]{"Tool","ExplodierenEffekt","Maler","Missile"});
			listString.add(new String[]{"Maler","Missile","Tank"});
			listString.add(new String[]{"MapInfo","TankManager","Maler","Missile"});
			listString.add(new String[]{"MapInfo","TankManager"});
			listString.add(new String[]{"InfoPanel","KeyMonitor","Option","GameManager","Tank"});
			listString.add(new String[]{"Wall","Tool","Maler","Missile","InfoPanel","KeyMonitor"});
			listString.add(new String[]{"Menu","MIDlet","Option"});
		*/
		List<List<String>> data = new ArrayList<List<String>>();

		try {
			data.add(Files.readAllLines(Paths.get(f1.getAbsolutePath())));	//TankWar_P1 CoverageInfo.txt
			data.add(Files.readAllLines(Paths.get(f2.getAbsolutePath())));	//TankWar_P2 CoverageInfo.txt
			data.add(Files.readAllLines(Paths.get(f3.getAbsolutePath())));	//TankWar_P3 CoverageInfo.txt
			data.add(Files.readAllLines(Paths.get(f4.getAbsolutePath())));	//TankWar_P4 CoverageInfo.txt
			data.add(Files.readAllLines(Paths.get(f5.getAbsolutePath())));	//TankWar_P5 CoverageInfo.txt
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
			System.out.println(HselectedTCs.size());
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
