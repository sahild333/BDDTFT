package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() {
	
		prop = new Properties();
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Sahil Duggal\\Desktop\\Java Work Space\\BDDTFTHybrid\\src\\main\\java\\property\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		System.setProperty(prop.getProperty("chromeDriverKey"), prop.getProperty("chromeDriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(prop.getProperty("url"));
	}
	
	public static void tearDown() {
		driver.close();
	}
}
