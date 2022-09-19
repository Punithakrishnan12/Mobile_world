import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class contactus{
	@Test(dataProvider = "datas")
			   public void send(String Username,String Email,String phone,String message) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Punithakrishnan.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
			        WebDriver driver = new ChromeDriver();
			        driver.get("https://mobileworld.banyanpro.com//");
			        Thread.sleep(1000);
			        Landingpage landing = new Landingpage(driver);
			        landing.send(Username, Email, phone, message);
			       }
			@DataProvider
public Object[][] datas() {
				Object[][] data = new Object[5][4];
			       data[0][0] = "sriram";
			       data[0][1] = "sd@gmail.com";
			       data[0][2] = "9892638263";
			       data[0][3] = "trail";
			       
			       data[1][0] = "";
			       data[1][1] = "sd@gmail.com";
			       data[1][2] = "9892638263";
			       data[1][3] = "trail";
			       
			       data[2][0] = "sriram";
			       data[2][1] = "";
			       data[2][2] = "9892638263";
			       data[2][3] = "trail";
			       
			       data[3][0] = "sriram";
			       data[3][1] = "sd@gmail.com";
			       data[3][2] = "";
			       data[3][3] = "trail";
			       
			       data[4][0] = "sriram";
			       data[4][1] = "sdgmail.com";
			       data[4][2] = "9892638263";
			       data[4][3] = "";
			       return data;
			}
			}