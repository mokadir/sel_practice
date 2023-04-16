package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	
	WebDriver driver;
	By practiceLink=By.linkText("Practice");
	
	public LandingPage(WebDriver drv){
		
		this.driver=drv;
	}
	
	public WebElement getPracticeLink() {
		
		return driver.findElement(practiceLink);
		//return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(practiceLink));
		
	}

}
