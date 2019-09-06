package com.sleepycat.je.cleaner; 
import java.util.SortedMap; 
import java.util.TreeMap; 
import com.sleepycat.je.dbi.MemoryBudget; 
import de.ovgu.cide.jakutil.*; 
 
class  LookAheadCache {
	
  private SortedMap map;

	
  private int maxMem;

	
  private int usedMem;

	
  LookAheadCache  (  int lookAheadCacheSize){
    map=new TreeMap();
    maxMem=lookAheadCacheSize;
  
    usedMem=MemoryBudget.TREEMAP_OVERHEAD;
  }

	
  boolean isEmpty(){
    return map.isEmpty();
  }

	
  boolean isFull(){
    return usedMem >= maxMem;
  }

	
  Long nextOffset(){
    return (Long)map.firstKey();
  }

	
  void add(  Long lsnOffset,  LNInfo info){
    map.put(lsnOffset,info);
    usedMem++;
    this.hook166(info);
  }

	
  LNInfo remove(  Long offset){
    LNInfo info=(LNInfo)map.remove(offset);
    if (info != null) {
      this.hook167(info);
    }
    return info;
  }

	
   private void  hook166__wrappee__LookAHEADCache  (  LNInfo info){
  }

	
  protected void hook166(  LNInfo info){
    usedMem+=info.getMemorySize();
    usedMem+=MemoryBudget.TREEMAP_ENTRY_OVERHEAD - 1;
    hook166__wrappee__LookAHEADCache(info);
  }

	
   private void  hook167__wrappee__LookAHEADCache  (  LNInfo info){
  }

	
  protected void hook167(  LNInfo info){
    usedMem--;
    usedMem-=info.getMemorySize();
    usedMem-=MemoryBudget.TREEMAP_ENTRY_OVERHEAD + 1;
    hook167__wrappee__LookAHEADCache(info);
  }


}
