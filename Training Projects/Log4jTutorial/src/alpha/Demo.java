package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName()); //import org.apache.logging.log4j.*;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			log.debug("I have clicked on button");
		
			log.info("button is displayed");

			log.error("button is NOT displayed");
			
			log.fatal("button is missing");
			System.out.println("test end");

	}

}
