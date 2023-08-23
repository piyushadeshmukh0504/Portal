package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass {

	
public static ChromeDriver driver;
	
	public Properties prop;
	
	public void initializeDriver() throws IOException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Projecttest\\src\\main\\java\\resource\\data.properties");
	
	prop=new Properties();
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))
	
	{
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
	}
	
	else
	{
		System.out.println("Browser is not accessible");
	}
	
	}
	
     @BeforeMethod
     public void launchUrl()throws IOException {
	
	initializeDriver();
	String urlName=prop.getProperty("url");
	driver.get(urlName);
	
    }

	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

