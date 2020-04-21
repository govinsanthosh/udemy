

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Udemy\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		d.manage().window().maximize();
		d.findElement(By.id("FromTag")).sendKeys("che"+ Keys.ENTER);
		d.findElement(By.id("ToTag")).sendKeys("ban"+ Keys.ENTER);
		d.findElement(By.xpath("//i[@class='icon ir datePicker']")).click();
		d.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		WebElement adults = d.findElement(By.id("Adults"));
		Select s=new Select(adults);
		s.selectByVisibleText("2");
		WebElement child = d.findElement(By.id("Childrens"));
		Select s1=new Select(child);
		s1.selectByVisibleText("1");
		WebElement Infants = d.findElement(By.id("Infants"));
		Select s3=new Select(Infants);
		s3.selectByVisibleText("0");
		WebElement more = d.findElement(By.xpath("(//a[@href='javascript:void(0);'])[7]"));
		more.click();
		WebElement classs = d.findElement(By.id("Class"));
		Select s4=new Select(classs);
		s4.selectByVisibleText("Business");
		WebElement flight = d.findElement(By.id("AirlineAutocomplete"));
		flight.sendKeys("indego");
		System.out.println(flight.getAttribute("value"));
		WebElement submit = d.findElement(By.id("SearchBtn"));
		submit.click();
		WebElement error = d.findElement(By.id("homeErrorMessage"));
		String msg = error.getText();
		System.out.println(msg);
		System.out.println("govinsanthosh");
		System.out.println("updated bowya");
		System.out.println("update by santhosh");
	}
}
