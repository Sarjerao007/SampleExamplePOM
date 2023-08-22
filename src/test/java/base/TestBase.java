package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	Properties prop;
	
	public TestBase(){
	String path=System.getProperty("user.dir")+
			"//src//test//resources//configFiles//config.properties";
	prop=new Properties();
	try {
	FileInputStream fin = new FileInputStream(path);
	prop.load(fin);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	public void initialize() {
		

	String strBrowser = prop.getProperty("browser");
	if(strBrowser.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)) ;
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
}
}



