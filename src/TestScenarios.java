import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestScenarios {

	@Test(priority=1)
	public void Test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvir\\Downloads\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		Assert.assertTrue(true, "Simple Form Demo");
		driver.findElement(By.linkText("Simple Form Demo")).click();
		String variable =  "Welcome to LambdaTest";
		driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys(variable);
		driver.findElement(By.xpath("//button[@id='showInput']")).click();
		WebElement validate = driver.findElement(By.cssSelector("p[id='message']"));
		//String text = validate.getText();
		//Assert.assertEquals(validate, text);
		System.out.println(validate.getText());
	}
	
	@Test(priority=2)
	public void Test2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvir\\Downloads\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.linkText("Drag & Drop Sliders")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement slider = driver.findElement(By.xpath("(//div[@class='sp__range sp__range-success'])[1]"));
		Actions action = new Actions(driver);
		Actions move = action.dragAndDropBy(slider, 99, 0);
		move.build().perform();
		//String slidervalue = slider.getText();
		//Assert.assertEquals(slider, slidervalue);
		System.out.println(slider.getText());
	}
	

	@Test(priority=3)
	public void Test3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanvir\\Downloads\\chromedriver_win32_2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/selenium-playground/");
		driver.findElement(By.linkText("Input Form Submit")).click();
		driver.findElement(By.cssSelector(".selenium_btn")).click();
	    String fillfield = driver.findElement(By.cssSelector("input[id='name']")).getAttribute("Please fill out this field.");
	    Assert.assertTrue(true, fillfield);
	    driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Tanvi");
	    driver.findElement(By.cssSelector("input[id='inputEmail4']")).sendKeys("tanvibehl23@gmail.com");
	    driver.findElement(By.xpath("//input[@id= 'inputPassword4']")).sendKeys("ret33080");
	    driver.findElement(By.xpath("//input[@id= 'company']")).sendKeys("fcds");
	    driver.findElement(By.xpath("//input[@id= 'websitename']")).sendKeys("abc@gmail.com");
	    WebElement dropdownelement = driver.findElement(By.name("country"));
	    Select dropdown = new Select(dropdownelement);
	    dropdown.selectByVisibleText("United States");
	    driver.findElement(By.name("city")).sendKeys("Ggn");
	    driver.findElement(By.name("address_line1")).sendKeys("123,Gidcndcxk");
	    driver.findElement(By.name("address_line2")).sendKeys("54353,43rvbfcv");
	    driver.findElement(By.id("inputState")).sendKeys("hrcd");
	    driver.findElement(By.id("inputZip")).sendKeys("4324234");
	    driver.findElement(By.cssSelector(".btn.btn-dark")).click();
	    WebElement sucessmessage = driver.findElement(By.cssSelector(".success-msg.hidden"));
	    String msg = sucessmessage.getText();
	    Assert.assertEquals(msg, "Thanks for contacting us, we will get back to you shortly.");
	    
	    
	}
}










