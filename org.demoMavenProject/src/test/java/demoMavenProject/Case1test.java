package demoMavenProject;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Case1test {
	

	@Test
	public void testTc1( ) {
		String Browser=System.getProperty("browser");
		String Url = System.getProperty("url");
		System.out.println(Browser+","+Url);
		
		Reporter.log("hello selenium",true);

	}
	@Test
	public void testTc2() {
		Reporter.log("hello pankaj ok",true);
		
	}
	
}
	