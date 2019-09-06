import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

import com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed1;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed2;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssFeed3;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssItem1;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssItem2;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssItem3;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesFeed3;
import com.substanceofcode.rssreader.businessentities.CompatibilityRssItunesItem3;
import com.substanceofcode.rssreader.businessentities.RssFeed;
import com.substanceofcode.rssreader.businessentities.RssFeedStore;
import com.substanceofcode.rssreader.businessentities.RssItem;
import com.substanceofcode.rssreader.businessentities.RssItunesFeed;
import com.substanceofcode.rssreader.businessentities.RssItunesItem;
import com.substanceofcode.rssreader.businessentities.RssReaderSettings;
import com.substanceofcode.rssreader.businessentities.RssShortItem;
import com.substanceofcode.rssreader.businessentities.RssStoreInfo;

public class SourceElementExtractor {
	public static void main(String args[]){
		List<String> result = new ArrayList<String>();
		
		result.addAll(allMethods(CompatibilityRssFeed1.class));
        result.addAll(allMethods(CompatibilityRssFeed2.class));
        result.addAll(allMethods(CompatibilityRssFeed3.class));
        result.addAll(allMethods(CompatibilityRssItem1.class));
        result.addAll(allMethods(CompatibilityRssItem2.class));
        result.addAll(allMethods(CompatibilityRssItem3.class));
        result.addAll(allMethods(CompatibilityRssItunesFeed3.class));
        result.addAll(allMethods(CompatibilityRssItunesItem3.class));
        result.addAll(allMethods(RssFeed.class));
        result.addAll(allMethods(RssFeedStore.class));
        result.addAll(allMethods(RssItem.class));
        result.addAll(allMethods(RssItunesFeed.class));
        result.addAll(allMethods(RssItunesItem.class));
        result.addAll(allMethods(RssReaderSettings.class));
        result.addAll(allMethods(RssShortItem.class));
        result.addAll(allMethods(RssStoreInfo.class));
        
        System.out.println(result);
	}
	public static List<String> allMethods(Class target){
    	Class c = target;
        List<String> ret = new ArrayList<String>();
        
        Field[] fields = c.getDeclaredFields();
        for(Field f : fields){
        	ret.add(c.getSimpleName() + "." + f.getName());
        }
        
        Constructor[] constructors = c.getDeclaredConstructors();
        for(Constructor cons : constructors){
        	String constName = cons.getName();
        	String constSimpleName = constName.substring(cons.getName().lastIndexOf(".")+1, constName.length());
        	String signature = c.getSimpleName() + "." + constSimpleName + "(";
        	Parameter[] parameters = cons.getParameters();
        	for(Parameter param : parameters){
        		if(param == parameters[parameters.length-1]){
        			signature += param.getParameterizedType().getTypeName();
        		}else{
        			signature += param.getParameterizedType().getTypeName() +" ";
        		}
        		
        	}
        	signature += ")";
        	ret.add(signature);
        }
        
        Method[] methods = c.getDeclaredMethods();
        for(Method m : methods){
        	String signature = c.getSimpleName() + "." + m.getName() + "(";
        	Parameter[] parameters = m.getParameters();
        	for(Parameter param : parameters){
        		if(param == parameters[parameters.length-1]){
        			signature += param.getParameterizedType().getTypeName();
        		}else{
        			signature += param.getParameterizedType().getTypeName() +" ";
        		}
        		
        	}
        	signature += ")";
        	ret.add(signature);
        }
        return ret;
    }
}
