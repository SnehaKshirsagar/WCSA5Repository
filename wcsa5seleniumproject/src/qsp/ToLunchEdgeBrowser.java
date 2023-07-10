package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLunchEdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Edge.driver","./drivers/msedge.exe");
		
	  new EdgeDriver();

	}

}
