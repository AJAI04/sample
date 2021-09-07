package testsample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static WebDriver driver;
public static WebDriver launchBrowser(String browsername) {
	switch(browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	return driver;
	
}
public static void launchUrl(String url) {
	driver.get(url);
	driver.manage().window().maximize();

}
public static void main(String[] args) {
	launchBrowser(null);
	launchUrl("");
	System.out.println(driver);
}
}

