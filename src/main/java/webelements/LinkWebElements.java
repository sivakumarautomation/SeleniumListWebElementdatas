package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkWebElements {
	
public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://www.amazon.com/");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		   List<WebElement> Tag = odriver.findElements(By.tagName("a"));
		   System.out.println(Tag.size());
		   
		   for(WebElement ListedTag:Tag) {
				String Label = ListedTag.getText();
				System.out.println(Label);
		   }
		   
		      Thread.sleep(6000);
		      
		      odriver.quit();

}

}
