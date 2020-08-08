package gridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerUITest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//Define Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("chrome");
		//cap.setPlatform(Platform.WINDOWS);		
		//Chrome options definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap); //add capability object

		String hubUrl = "http://192.168.56.1:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options); // Use either options for cap
//		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), cap);// Use either options for cap		
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		System.out.println("Title of page is -->"+ driver.getTitle());
		driver.quit();
	}

}
