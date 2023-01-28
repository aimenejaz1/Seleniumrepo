package pakage;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class checkbox_test {

	public static void main(String[] args) {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\aiman.ejaz\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 EdgeDriver driver2 = new EdgeDriver();
		 driver2.get("https://tech-fairy.com/selenium-webdriver-paractice-form-with-radio-buttons/");
		 driver2.manage().window().maximize();
		 //Boolean selectState=driver.findElement(By.id("CatID")).isSelected();
		
		//Selecting radio button if it is already not selected
		//if(selectState==false)
		//{
		   driver2.findElement(By.xpath("//input[@id='ElephantID']")).click();

}
}
