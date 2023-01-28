package classDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.edge.EdgeDriver;


public class FirstClassDemo
{
	
	
	
	public static WebDriver driver;

	public static WebDriver browser(WebDriver driver,String inp_url,String title) throws InterruptedException 
	{
		
		
		
		//WebDriver driver=new EdgeDriver();
		
		driver.get(inp_url);
		String url=driver.getCurrentUrl();
		if(url.equals("https://staging./rekruttering"))
		{
			System.out.println("Valid URL");
		}
		else 
		{
			System.out.println("Not a valid URL");
		}
		
		System.out.println("Page title is : " + driver.getTitle());
		if(driver.getTitle().equals(title))
		{
			System.out.println("Valid title");
		}
		//if(title.equals("google"))
		//{
		//	System.out.println("Valid title");
			
		//}
		else 
		{
			System.out.println("Not a valid title");
		}
		//System.out.println(url);//printing URL using default function
		
		//String title=driver.getTitle();
		//System.out.println(title);//printing title by default function.
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-danger.text-center[data-toggle='modal']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[ contains (text(), �Videre� ) ]")).click();
		System.out.println("Test completed successfully");
		return driver;
	}
	
	public static void basic(WebDriver driver) throws InterruptedException
	{
		Naming_convention obj=new Naming_convention("Aimen Ejaz","pkdk@gmail.com","Kildehaven 2","4100");
		System.out.println(driver);
		driver.findElement(By.xpath("//input[@id='Fullname']")).sendKeys(obj.Username);
     	driver.findElement(By.xpath("//span[normalize-space()='Mand']")).click();
     	Thread.sleep(1000);
     	driver.findElement(By.xpath("//input[@id='Address']")).sendKeys(obj.address);
     	driver.findElement(By.cssSelector("#PostalCode")).sendKeys(obj.Postal_code);
     	driver.findElement(By.xpath("//input[@id='City']")).click();
     	driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys(obj.email);
     	driver.findElement(By.xpath("//input[@id='phone_no']")).sendKeys("11110000");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
     	Erfaring(driver);
		
	}
	public static void Erfaring(WebDriver driver) throws InterruptedException
	{
     	//driver.findElement(By.cssSelector("label[for='previous_experience']")).click();
		//Naming_convention obj=new Naming_convention("post");
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("(//label[@for='previous_experience'])[1]")).click();
     	driver.findElement(By.xpath("//input[@id='CompanyName']")).sendKeys(Naming_file.Company_name);
     	driver.findElement(By.xpath("//input[@id='ExpFrom']")).click();
        driver.findElement(By.id("StillingName")).sendKeys(Naming_file.Position);
		Thread.sleep(2000);
		
		
		//driver.findElement(By.id("ExpFrom")).sendKeys("21Mar2021".ToString("ddd, dd.MM.yyyy",CultureInfo.CreateSpecificCulture("en-US")));
		
		driver.findElement(By.id("ExpFrom")).sendKeys("10Jan");
		WebElement fromDate = driver.findElement(By.id("ExpFrom"));
		fromDate.sendKeys(Keys.TAB);
		driver.findElement(By.id("ExpFrom")).sendKeys("2021");
		
		driver.findElement(By.id("ExpTo")).sendKeys("22Mar");
		WebElement toDate = driver.findElement(By.id("ExpTo"));
		toDate.sendKeys(Keys.TAB);
		driver.findElement(By.id("ExpTo")).sendKeys("2022");
		driver.findElement(By.id("ExpTo"));
		
		//Thread.sleep(2000);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class,'align-items: center;')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(1000);
	}
	
	public void Uddanelse(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.id("CertiName")).sendKeys("Matric");
		Thread.sleep(1000);
		
		driver.findElement(By.id("CertiFrom")).sendKeys("10Jan");
		WebElement fromCertiDate = driver.findElement(By.id("CertiFrom"));
		fromCertiDate.sendKeys(Keys.TAB);
		driver.findElement(By.id("CertiFrom")).sendKeys("2001");
		
		driver.findElement(By.id("CertiTo")).sendKeys("10Dec");
		WebElement CertiTo = driver.findElement(By.id("CertiTo"));
		CertiTo.sendKeys(Keys.TAB);
		driver.findElement(By.id("CertiTo")).sendKeys("2002");
		
		Thread.sleep(1000);
		WebElement upload_file = driver.findElement(By.id("CertiFile"));
		upload_file.sendKeys("C:\\sample2.doc");
		driver.findElement(By.cssSelector("div[class='btn btn-lg btn-outline-success text-center']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Automation\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Automation\\msedgedriver.exe");
		WebDriver driver=new ChromeDriver();
		String inp_url="https://staging.tolkdanmark.dk/rekruttering";
		
		//String title=driver.getTitle();
		String title="Tolkdanmark | Rekruttering";
		driver =browser(driver,inp_url,title);
		Thread.sleep(2000);
		basic(driver);//To call static function
		FirstClassDemo obj=new FirstClassDemo();//to call non-static function
		obj.Uddanelse(driver);
		Thread.sleep(2000);
		//driver.switchTo().newWindow(WindowType.WINDOW);


	}
	

}
