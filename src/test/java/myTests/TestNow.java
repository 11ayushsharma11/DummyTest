package myTests;

import org.testng.annotations.Test;

import utils.Property_Utility;

public class TestNow {
	
	@Test
	public void test1()
	{
		System.out.println("Fetching the url");
//		Property_Utility pu = new Property_Utility("./src/test/resources/cred.properties");
		String url = System.getProperty("url");
		System.out.println(url);
		System.out.println("Welcome");
		System.out.println("Editing on Github now.");
	}

}
