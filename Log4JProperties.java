package allPractice;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class Log4JProperties {
	Logger logg=Logger.getLogger(Log4JProperties.class);
	
	public void setUp() {
	PropertyConfigurator.configure("Log4j.properties");
	}
	
	public void applicationLaunch() {
		logg.info("obulesh sirigiri");
		logg.info("log4j properties added successfully");
	}
	
	public static void main(String[] args) {
		Log4JProperties log=new Log4JProperties();
		log.setUp();
		log.applicationLaunch();	
	}	
}
