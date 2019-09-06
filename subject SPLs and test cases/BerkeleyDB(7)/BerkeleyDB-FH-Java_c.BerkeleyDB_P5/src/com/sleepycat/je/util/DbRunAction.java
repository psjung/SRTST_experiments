package com.sleepycat.je.util; 
import java.io.File; 
import java.text.DecimalFormat; 
import com.sleepycat.je.CheckpointConfig; 
import com.sleepycat.je.Cursor; 
import com.sleepycat.je.Database; 
import com.sleepycat.je.DatabaseConfig; 
import com.sleepycat.je.DatabaseEntry; 
import com.sleepycat.je.DatabaseException; 
import com.sleepycat.je.DbInternal; 
import com.sleepycat.je.Environment; 
import com.sleepycat.je.EnvironmentConfig; 
import com.sleepycat.je.EnvironmentMutableConfig; 
import com.sleepycat.je.LockMode; 
import com.sleepycat.je.OperationStatus; 
import com.sleepycat.je.Transaction; 
import com.sleepycat.je.config.EnvironmentParams; 
import com.sleepycat.je.dbi.EnvironmentImpl; 
import com.sleepycat.je.utilint.CmdUtil; 
import de.ovgu.cide.jakutil.*; 
import com.sleepycat.je.StatsConfig; 
public   class  DbRunAction {
	
  private static final int CLEAN=1;

	
  private static final int CHECKPOINT=4;

	
  public static void main(  String[] argv){
    new DbRunAction_main(argv).execute();
  }

	
  private static String getSecs(  long start,  long end){
    return (end - start) / 1000 + " secs";
  }

	
  private static void preload(  Environment env,  String dbName) throws DatabaseException {
    System.out.println("Preload starting");
    Database db=env.openDatabase(null,dbName,null);
    Cursor cursor=db.openCursor(null,null);
    try {
      DatabaseEntry key=new DatabaseEntry();
      DatabaseEntry data=new DatabaseEntry();
      int count=0;
      while (cursor.getNext(key,data,LockMode.DEFAULT) == OperationStatus.SUCCESS) {
        count++;
        if ((count % 50000) == 0) {
          System.out.println(count + "...");
        }
      }
      System.out.println("Preloaded " + count + " records");
    }
  finally {
      cursor.close();
      db.close();
    }
  }

	
  private static void usage(){
    System.out.println("Usage: \n " + CmdUtil.getJavaCommand(DbRunAction.class));
    System.out.println("  -h <environment home> ");
    System.out.println("  -a <clean|compress|evict|checkpoint|removedb>");
    System.out.println("  -ro (read-only - defaults to read-write)");
    System.out.println("  -s <dbName> (for preloading of evict or db remove)");
  }

	
@MethodObject static  class  DbRunAction_main {
		
    DbRunAction_main(    String[] argv){
      this.argv=argv;
    }

		
    void execute(){
      recoveryStart=0;
      actionStart=0;
      actionEnd=0;
      try {
        whichArg=0;
        if (argv.length == 0) {
          usage();
          System.exit(1);
        }
        dbName=null;
        doAction=0;
        envHome=".";
        readOnly=false;
        while (whichArg < argv.length) {
          nextArg=argv[whichArg];
          if (nextArg.equals("-h")) {
            whichArg++;
            envHome=CmdUtil.getArg(argv,whichArg);
          }
 else           if (nextArg.equals("-a")) {
            whichArg++;
            action=CmdUtil.getArg(argv,whichArg);
            if (action.equalsIgnoreCase("clean")) {
              doAction=CLEAN;
            }
 else {
              this.hook841();
            }
          }
 else           if (nextArg.equals("-ro")) {
            readOnly=true;
          }
 else           if (nextArg.equals("-s")) {
            dbName=argv[++whichArg];
          }
 else {
            throw new IllegalArgumentException(nextArg + " is not a supported option.");
          }
          whichArg++;
        }
        envConfig=new EnvironmentConfig();
        this.hook848();
        this.hook847();
        this.hook845();
        recoveryStart=System.currentTimeMillis();
        env=new Environment(new File(envHome),envConfig);
        forceConfig=new CheckpointConfig();
        forceConfig.setForce(true);
        actionStart=System.currentTimeMillis();
        if (doAction == CLEAN) {
          while (true) {
            nFiles=env.cleanLog();
            System.out.println("Files cleaned: " + nFiles);
            if (nFiles == 0) {
              break;
            }
          }
          env.checkpoint(forceConfig);
        }
        this.hook840();
        this.hook844();
        if (doAction == CHECKPOINT) {
          env.checkpoint(forceConfig);
        }
        this.hook842();
        this.hook838();
        actionEnd=System.currentTimeMillis();
        env.close();
      }
 catch (      Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
        usage();
        System.exit(1);
      }
 finally {
        f=new DecimalFormat();
        f.setMaximumFractionDigits(2);
        recoveryDuration=actionStart - recoveryStart;
        System.out.println("\nrecovery time = " + f.format(recoveryDuration) + " millis "+ f.format((double)recoveryDuration / 60000)+ " minutes");
        actionDuration=actionEnd - actionStart;
        System.out.println("action time = " + f.format(actionDuration) + " millis "+ f.format(actionDuration / 60000)+ " minutes");
      }
    }

		
    protected String[] argv;

		
    protected long recoveryStart;

		
    protected long actionStart;

		
    protected long actionEnd;

		
    protected int whichArg;

		
    protected String dbName;

		
    protected int doAction;

		
    protected String envHome;

		
    protected boolean readOnly;

		
    protected String nextArg;

		
    protected String action;

		
    protected EnvironmentConfig envConfig;

		
    protected Environment env;

		
    protected CheckpointConfig forceConfig;

		
    protected int nFiles;

		
    protected DatabaseConfig dbConfig;

		
    protected Database db;

		
    protected DecimalFormat f;

		
    protected long recoveryDuration;

		
    protected long actionDuration;

		
     private void  hook838__wrappee__base  () throws Exception {
    }

		
    protected void hook838() throws Exception {
      if (doAction == DBSTATS) {
        dbConfig=new DatabaseConfig();
        dbConfig.setReadOnly(true);
        DbInternal.setUseExistingConfig(dbConfig,true);
        db=env.openDatabase(null,dbName,dbConfig);
        try {
          System.out.println(db.getStats(new StatsConfig()));
        }
  finally {
          db.close();
        }
      }
      hook838__wrappee__base();
    }

		
     private void  hook839__wrappee__base  () throws Exception {
      usage();
      System.exit(1);
    }

		
    protected void hook839() throws Exception {
      if (action.equalsIgnoreCase("dbstats")) {
        doAction=DBSTATS;
      }
 else {
        hook839__wrappee__base();
      }
    }

		
     private void  hook840__wrappee__base  () throws Exception {
    }

		
    protected void hook840() throws Exception {
      if (doAction == COMPRESS) {
        env.compress();
      }
      hook840__wrappee__base();
    }

		
     private void  hook841__wrappee__base  () throws Exception {
      if (action.equalsIgnoreCase("checkpoint")) {
        doAction=CHECKPOINT;
      }
 else {
        this.hook846();
      }
    }

		
    protected void hook841() throws Exception {
      if (action.equalsIgnoreCase("compress")) {
        doAction=COMPRESS;
      }
 else {
        hook841__wrappee__base();
      }
    }

		
     private void  hook842__wrappee__base  () throws Exception {
    }

		
    protected void hook842() throws Exception {
      if (doAction == REMOVEDB) {
        removeAndClean(env,dbName);
      }
      hook842__wrappee__base();
    }

		
     private void  hook843__wrappee__base  () throws Exception {
      this.hook839();
    }

		
    protected void hook843() throws Exception {
      if (action.equalsIgnoreCase("removedb")) {
        doAction=REMOVEDB;
      }
 else {
        hook843__wrappee__base();
      }
    }

		
     private void  hook844__wrappee__base  () throws Exception {
    }

		
    protected void hook844() throws Exception {
      if (doAction == EVICT) {
        preload(env,dbName);
      }
      hook844__wrappee__base();
    }

		
     private void  hook845__wrappee__base  () throws Exception {
    }

		
    protected void hook845() throws Exception {
      if (doAction == EVICT) {
        envConfig.setConfigParam(EnvironmentParams.ENV_RUN_EVICTOR.getName(),"false");
        envConfig.setConfigParam(EnvironmentParams.EVICTOR_CRITICAL_PERCENTAGE.getName(),"1000");
      }
      hook845__wrappee__base();
    }

		
     private void  hook846__wrappee__base  () throws Exception {
      this.hook843();
    }

		
    protected void hook846() throws Exception {
      if (action.equalsIgnoreCase("evict")) {
        doAction=EVICT;
      }
 else {
        hook846__wrappee__base();
      }
    }

		
    protected void hook847() throws Exception {
    }

		
     private void  hook848__wrappee__base  () throws Exception {
    }

		
    protected void hook848() throws Exception {
      envConfig.setConfigParam(EnvironmentParams.JE_LOGGING_CONSOLE.getName(),"true");
      hook848__wrappee__base();
    }


	}

	
  private static final int EVICT=3;

	
  private static void doEvict(  Environment env) throws DatabaseException {
    new DbRunAction_doEvict(env).execute();
  }

	
@MethodObject static  class  DbRunAction_doEvict {
		
    DbRunAction_doEvict(    Environment env){
      this.env=env;
    }

		
    void execute() throws DatabaseException {
      envImpl=DbInternal.envGetEnvironmentImpl(env);
      this.hook837();
      c=new EnvironmentMutableConfig();
      this.hook836();
      env.setMutableConfig(c);
      start=System.currentTimeMillis();
      env.evictMemory();
      end=System.currentTimeMillis();
      f=new DecimalFormat();
      f.setMaximumFractionDigits(2);
      System.out.println("evict time=" + f.format(end - start));
    }

		
    protected Environment env;

		
    protected EnvironmentImpl envImpl;

		
    protected long cacheUsage;

		
    protected EnvironmentMutableConfig c;

		
    protected long start;

		
    protected long end;

		
    protected DecimalFormat f;

		
     private void  hook836__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook836() throws DatabaseException {
      c.setCacheSize(cacheUsage / 2);
      hook836__wrappee__Evictor();
    }

		
     private void  hook837__wrappee__Evictor  () throws DatabaseException {
    }

		
    protected void hook837() throws DatabaseException {
      cacheUsage=envImpl.getMemoryBudget().getCacheMemoryUsage();
      hook837__wrappee__Evictor();
    }


	}

	
  private static final int REMOVEDB=5;

	
  private static void removeAndClean(  Environment env,  String name) throws DatabaseException {
    long a, b, c, d, e, f;
    Transaction txn=env.beginTransaction(null,null);
    CheckpointConfig force=new CheckpointConfig();
    force.setForce(true);
    a=System.currentTimeMillis();
    env.removeDatabase(txn,name);
    b=System.currentTimeMillis();
    txn.commit();
    c=System.currentTimeMillis();
    int cleanedCount=0;
    while (env.cleanLog() > 0) {
      cleanedCount++;
    }
    d=System.currentTimeMillis();
    System.out.println("cleanedCount=" + cleanedCount);
    e=0;
    f=0;
    if (cleanedCount > 0) {
      e=System.currentTimeMillis();
      env.checkpoint(force);
      f=System.currentTimeMillis();
    }
    System.out.println("Remove of " + name + " remove: "+ getSecs(a,b)+ " commit: "+ getSecs(b,c)+ " clean: "+ getSecs(c,d)+ " checkpoint: "+ getSecs(e,f));
  }

	
  private static final int COMPRESS=2;

	
  private static final int DBSTATS=6;


}
