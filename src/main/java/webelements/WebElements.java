package webelements; //package//

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements { //class//
	
	public static void main(String[] args) throws InterruptedException { //Main//
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://www.amazon.com/");
		odriver.manage().deleteAllCookies();
		odriver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		     List<WebElement> allwebelement = odriver.findElements(By.xpath("//*"));
		     System.out.println(allwebelement.size());
		     
		     //for(WebElement variable: already declared list object//
		     for(WebElement list:allwebelement) {
		    	 
		    	   String elementlisted = list.getText();
		    	   System.out.println(elementlisted);
		     }
		
		     Thread.sleep(6000);
		      
		      odriver.quit();
		
	}

}
