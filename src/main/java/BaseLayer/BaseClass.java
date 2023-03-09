package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\kadam\\eclipse-workspace2\\DemoWebShop\\DemoWebShop\\src\\main\\java\\Configuration\\Config.properties");
			prop.load(fis);
		} catch (Exception e) {

		}
	}

	public static void inilitization() {

		String browsername = prop.getProperty("browsername");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kadam\\eclipse-workspace2\\DemoWebShop\\DemoWebShop\\AllDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\kadam\\eclipse-workspace2\\DemoWebShop\\DemoWebShop\\AllDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browsername.equals("opera")) {
			System.setProperty("webdriver.opera.driver",
					"C:\\Users\\kadam\\eclipse-workspace2\\DemoWebShop\\DemoWebShop\\AllDrivers\\operadriver.exe");
			driver = new OperaDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(prop.getProperty("pageLoadTime"))));

		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(prop.getProperty("implicitWait"))));

		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

	}

}
