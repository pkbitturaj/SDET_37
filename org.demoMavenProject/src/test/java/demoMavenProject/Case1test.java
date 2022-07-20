package demoMavenProject;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Case1test {
	@Test
	public void testTc1( ) {
		Reporter.log("hello selenium",true);

	}
	@Test
	public void testTc2() {
		Reporter.log("hello pankaj ok",true);
		
	}
	public void car() {
		Reporter.log("yellow car" ,true);

	}
}
