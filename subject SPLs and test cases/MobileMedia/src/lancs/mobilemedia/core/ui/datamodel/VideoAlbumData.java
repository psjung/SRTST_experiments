// #ifdef includeVideo
// [NC] Added in the scenario 08
package lancs.mobilemedia.core.ui.datamodel;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import lancs.mobilemedia.lib.exceptions.ImageNotFoundException;
import lancs.mobilemedia.lib.exceptions.PersistenceMechanismException;

public class VideoAlbumData extends AlbumData{
	
	public VideoAlbumData() {
		mediaAccessor = new VideoMediaAccessor(this);
	}
	
	public InputStream getVideoFromRecordStore(String recordStore, String musicName) throws ImageNotFoundException, PersistenceMechanismException {
		MediaData mediaInfo = null;
		mediaInfo = mediaAccessor.getMediaInfo(musicName);
		//Find the record ID and store name of the image to retrieve
		int mediaId = mediaInfo.getForeignRecordId();
		String album = mediaInfo.getParentAlbumName();
		//Now, load the image (on demand) from RMS and cache it in the hashtable
		byte[] musicData = (mediaAccessor).loadMediaBytesFromRMS(album, mediaId);
		return new ByteArrayInputStream(musicData);

	}
}
//#endif
