package Generic;

import org.apache.log4j.xml.DOMConfigurator;



public class logs {
	
	public logs()
	{
		DOMConfigurator.configure("log4j.xml");
	 }
}
