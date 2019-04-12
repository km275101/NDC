package defineStep;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class StepExplaination {

	WebDriver driver;
	
	@Given("^users login page$")
	public void users_login_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\kamlesh.maurya\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 System.out.println("Opening chrome browser");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.irctc.co.in");
		 System.out.println("Opening irctc");
		 driver.close();
		 driver.quit();
		 System.out.println("Closing the browser");
	}
}
