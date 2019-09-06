package com.sleepycat.je.log;

/** 
 * FileHandleSource is a file source built on top of a cached file handle.
 */
class  FileHandleSource  extends FileSource {
	
  private FileHandle fileHandle;

	
  FileHandleSource(  FileHandle fileHandle,  int readBufferSize,  FileManager fileManager){
    super(fileHandle.getFile(),readBufferSize,fileManager);
    this.fileHandle=fileHandle;
  }


}
