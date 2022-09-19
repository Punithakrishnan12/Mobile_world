import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class signin {
    @Test
    public void signin1() throws InterruptedException
 {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Punithakrishnan.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        String name =  "sd@gmail.com";
        String password = "sd@123";
        landingpage.goTo();
        landingpage.validdetails(name, password);
        driver.quit();
    }
    @Test
    public void signin2() throws InterruptedException
    {
        String name =  "1234@gmail.com";
        String password = "sd@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.invalidusername(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
    @Test
    public void signin3() throws InterruptedException
    {
        String name =  "sd@gmail.com";
        String password = "12345";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.invalidpassword(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
        
    }
    @Test
    public void signin4() throws InterruptedException
    {
        String name =  "";
        String password = "sd@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.emptyusername(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
    @Test
    public void signin5() throws InterruptedException
    {
        String name =  "sd@gmail.com";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.emptypassword(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
    @Test
    public void signin6() throws InterruptedException
    {
        String name =  "";
        String password = "";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.emptyusernamepassword(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
    @Test
    public void signin7() throws InterruptedException
    {
        String name =  "sd";
        String password = "sd@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character2(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
    @Test
    public void signin8() throws InterruptedException
    {
        String name =  "abcdefghijklmnopqrst";
        String password = "sd@123";
        WebDriver driver = new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.character21(name, password);
        String ExpectedURL="Error message should be shown";
        String ActualURL="driver.getCurrentURL";
        Assert.assertEquals(ActualURL, ExpectedURL);
        driver.quit();
    }
}
