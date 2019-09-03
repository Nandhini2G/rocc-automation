package Generic;

import org.apache.log4j.Logger;

public interface Auto_const
{
	String chrome_key="webdriver.chrome.driver";
	String chrome_value="./drivers/chromedriver76.exe";
	
	String ROCC_USERLOGIN_URL="https://rocc-jenkins.cloud.pcftest.com/#/idn";
	String ROCC_DEVICELOGIN_URL="https://rocc-jenkins.cloud.pcftest.com/#/devicelogin";
	
	Logger Log = Logger.getLogger(logs.class.getName());
	 
	logs l=new logs();
}
