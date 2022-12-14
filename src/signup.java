import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class signup{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
   	System.setProperty("webdriver.chrome.driver","C:\\Users\\Punithakrishnan.m\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
    }
         @Test(dataProvider = "datasets")
         public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
         {
         driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
      
         driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
         Thread.sleep(500);
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
         Thread.sleep(500);
         driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
         Thread.sleep(500);
         driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
         Thread.sleep(500);
         driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
         Thread.sleep(500);
         driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
         Thread.sleep(500);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(500);
         driver.switchTo().alert().accept();
         driver.quit();
    }
         
        
    
    @DataProvider(name = "datasets")
    public Object[][] datasets(){
        Object[][] data = {{"sri","ram","sri@gmail.com","sri@123","1234567898","12/12/2022","qwertyuiopasrifghjkl"},
        					{"abckhdabckabsrikbasab","ram","sri@gmail.com","sri@123","","12/12/2022","qwertyuiopasrifghjkl"},
        					{"sri","ram","sri@gmail.com","sri@123","1234567890","12/12/2022","qwertyuiopasrifghjkl"},
        					{"sri","ram","srigmail.com","sri@123","1234567890","12/12/2022","qwertyuiopasrifghjkl"},
        					{"sri","aabcdefghijklmnopqrs","sri@gmail.com","sri@123","1234567898","12/12/2022","qwertyuiopasrifghjkl"},
        					{"sri","ram","sri@gmail.com","sri@123","1234567898","12/12/2022","qwertyuiopasrifghjkl"},
                            {"sri","sri","sri@gmail","sri","dfghggffd","05/20/2000",""},
                            {"sri","ram","sri@gmail.com","ram@123","123445566666","05/20/2022","hai"},
                            {"sri","ram","@gmail.com","ram@123","123445566666","05/20/2000","hai"},
                            {"sri","ram","sri@gmail.com","s1@","12334444555","05/20/2000","hai"},
                            {"sri","ram","sri@gmail.com","s1@wh33h","12334444555","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s","12334444555","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s1@aw2@!wssssjjj","12334444555","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s1@","12334444555","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s1@","12334444555","05/20/2021","hai"},
                            {"sri","ram","sri@gmail.com","s1@","9870915101","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s1@","12334444555123433","05/20/2022","hai"},
                            {"sri","ram","sri@gmail.com","s1@","12334$%4555","","hai"}};                               
        return data;
        
    }
}
