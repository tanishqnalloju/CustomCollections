package epam.pep.CustomCollections;

/**
 * Hello world!
 *
 */

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App{
	
	public static magicList<?> sendList() throws sizeLessThanExpectedException {
		String[] artistNames = {"Julie", "Sofia", "Mila", "Jennifer", "Ariana", "Selena", "Doja", "Dua", "Alessia", "Becky", "Bebe", "Taylor", "Katy"};
    	try {
			magicList<String> artistList = new magicList<String>(artistNames);
			return artistList;
		} catch (sizeLessThanExpectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		Integer[] def = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    	magicList<Integer> defaultList = new magicList<Integer>(def);
    	
    	return defaultList;
	}
	
	public static boolean operateOnList(magicList <?> ml) {
		
		boolean successful = true;
		final Logger logger = LogManager.getLogger(App.class);
		
//		logger.debug("Calling set function");
//		logger.debug("Setting 0th index to 'Noami'", ml.set(0, new String("Noami")));
//		
		logger.debug("Calling get function");
		logger.debug("Getting 0th index", ml.get(0));
		
		logger.debug("Size of list", ml.size());
		logger.debug("Removing 1st index", ml.remove(0));
		
		logger.debug(ml.print());
		logger.debug("Successful");
		
		return successful;
	}
	
	public static void main( String[] args ){
        //Creating a Custom Collection object
    	Integer[] arr = {1, 3, 4, 3, 2};
    	try {
			@SuppressWarnings("unused")
			magicList<Integer> ml = new magicList<Integer>(arr);
		} catch (sizeLessThanExpectedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   	
    	
    }
}
