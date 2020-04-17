import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandy\\eclipse-workspace\\Udemy\\exe\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://the-internet.herokuapp.com/windows");
		d.findElement(By.xpath("//a[@href='/windows/new']")).click();
		Set<String> parent = d.getWindowHandles();
		Iterator<String> it = parent.iterator();
		String parent1 = it.next();
		String child = it.next();
		d.switchTo().window(child);
		System.out.println(d.findElement(By.tagName("h3")).getText());
		d.switchTo().window(parent1);
		System.out.println(d.findElement(By.tagName("h3")).getText());
	}
}
