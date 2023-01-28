import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class mainclass1 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.edge.driver","C:\\Users\\aiman.ejaz\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 EdgeDriver driver = new EdgeDriver();
		 driver.get("https://demo.guru99.com/test/newtours/register.php");
		 driver.manage().window().maximize();
		 
		 //Selecting value from drop down//
		 
		 Select drop=new Select(driver.findElement(By.name("country")));
		 drop.selectByValue("GERMANY");
		 
		 //Selecting value from menu items//
		System.setProperty("webdriver.edge.driver","C:\\Users\\aiman.ejaz\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 EdgeDriver driver1 = new EdgeDriver();
		 driver1.get("https://demo.guru99.com/Security/SEC_V1/index.php");
		 driver1.manage().window().maximize();
		 driver1.findElement(By.className("dropdown-toggle")).click();
		 driver1.findElement(By.linkText("Login")).click();
		 driver1.close();
		 
		 //Selecting value from drop down//		 
		 System.setProperty("webdriver.edge.driver","C:\\Users\\aiman.ejaz\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 EdgeDriver driver2 = new EdgeDriver();
		 driver2.get("https://tech-fairy.com/selenium-webdriver-paractice-form-with-radio-buttons/");
		 driver2.manage().window().maximize();
		 Boolean selectState=driver2.findElement(By.id("CatID")).isSelected();
			
			//Selecting radio button if it is already not selected
			if(selectState==false)
			{
			   driver2.findElement(By.xpath("//input[@id='CatID']")).click();

		}



}
}
