package com.sleepycat.je.cleaner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.File;

import org.junit.Test;

import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.dbi.EnvironmentImpl;

public class IntegrationTests {

	@Test
	public void test1() {
		FileSelector fs = new FileSelector();
		FileProcessor fp = new FileProcessor((String) "aa", (EnvironmentImpl) null, (Cleaner) null, (UtilizationProfile) null, fs);
		
		fp.runOrPause(true);
		fp.runOrPause(true);
	    
		assertEquals("aa",fp.getThread().getName());
	}
/*
	@Test
	public void test2() {
		File f = new File("C:\\Users\\soo\\Desktop\\eclipse-java-mars-2-win32-x86_64\\BerkeleyDB-FH-Java");
		try {
			EnvironmentConfig envConfig = new EnvironmentConfig();
			envConfig.setAllowCreate(true);
			envConfig.setTransactional(true);
		    envConfig.setCacheSize(1000000);
			Environment env = new Environment(f, envConfig);;
			assertNotEquals(null, env);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
