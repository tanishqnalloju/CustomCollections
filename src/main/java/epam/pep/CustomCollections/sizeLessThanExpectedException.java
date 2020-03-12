package epam.pep.CustomCollections;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@SuppressWarnings("serial")
class sizeLessThanExpectedException extends Exception{
	private static final Logger logger = LogManager.getLogger(sizeLessThanExpectedException.class);
	
    sizeLessThanExpectedException(String message){
        super(message);
        logger.error(message);
    }
}