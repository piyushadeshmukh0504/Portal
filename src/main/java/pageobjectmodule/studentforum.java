package pageobjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class studentforum {

	
	
	
public WebDriver driver;
	
	By studentforms = By.xpath("//a[@href=\"https://kcc.aptcoder.in/community/interns-forum/\"]");
	
	By nextbutton  =By.xpath("//div[@class='wpf-navi wpf-navi-topic-top']//a[@class='wpf-next-button'][normalize-space()='Next']");
	
	By prevbutton =By.xpath("(//a[@class='wpf-prev-button'][normalize-space()='Prev'])[1]");
		
	By askques =By.xpath(" (//span[contains(text(),'Ask a question')])[1]");
   
	public studentforum(WebDriver driver2) {
		this.driver=driver2;
	}
	
	
	public WebElement studentformsClick() {
		return driver.findElement(studentforms);
	}
	
	public WebElement nextbuttonClick() {
		return driver.findElement(nextbutton);
	}
	
	public WebElement prevbuttonClick() {
		return driver.findElement(prevbutton);
	}
	
	public WebElement askquesClick() {
		return driver.findElement(askques);
	}	
	
	
}
