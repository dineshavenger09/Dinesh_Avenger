package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");
		EdgeDriver f=new EdgeDriver();
}
	

}
