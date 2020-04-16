import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Checkbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Udemy\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement chk1 = d.findElement(By.id("checkBoxOption1"));
		//chk1.click();
		//boolean status = chk1.isEnabled();
		//System.out.println(status);
		List<WebElement> all = d.findElements(By.xpath("//input[@type='checkbox']"));
		int total = all.size();
		for(int i=0;i<total;i++)
		{
			WebElement chk = all.get(i);
			chk.click();
			
		}
		System.out.println("total no of check boxes in this page is :"+ total);
	}
}
