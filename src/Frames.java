
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Udemy\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://the-internet.herokuapp.com/nested_frames");
		d.switchTo().frame(0);
	 WebDriver f2 = d.switchTo().frame(1);
	 WebElement framem = f2.findElement(By.id("content"));
	 String fr1 = framem.getText();
	 System.out.println(fr1);
	
	}

}
