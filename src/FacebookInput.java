import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookInput {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://twitter.com");
		String[] str={"one","two","three","four","five","six","seven","eight","NIne","Ten","Eleven","Twelve"};
		List<WebElement> myinput=driver.findElements(By.xpath("//input[@type='password' or @type='text']"));
		System.out.println(myinput.size());
		for(int i=0;i<myinput.size();i++)
		{
			if(myinput.get(i).isDisplayed())
		   {
			myinput.get(i).sendKeys(str[i]);
			}
		}
	}

}
