package pakage;

import org.openqa.selenium.edge.EdgeDriver;

public class TestingCode {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.edge.driver","C:\\Users\\aiman.ejaz\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		 EdgeDriver driver = new EdgeDriver();
		 driver.get("https://staging.tolkdanmark.dk/recruitment");
		 driver.manage().window().maximize();
}
}