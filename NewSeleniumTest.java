import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewSeleniumTest {
public static void main(String a[]) {
int code = 0;
String URL_output = a[0];
System.out.println(URL_output);
//String baseURL = "http://34.221.243.81:9000/";
System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
chromeOptions.addArguments("--no-sandbox");
WebDriver driver = new ChromeDriver(chromeOptions);
driver.get(URL_output);

driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).clear();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Thomas");
	driver.findElement(By.xpath("//input[@id='lastName']")).clear();
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Jefferson");
	driver.findElement(By.xpath("//input[@id='address']")).clear();
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("456 Clark Street");
	driver.findElement(By.xpath("//input[@id='city']")).clear();
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Chicago");
	driver.findElement(By.xpath("//input[@id='telephone']")).clear();
	driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("3452987654");
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	System.out.println("user addition successful !");

driver.navigate().to(URL_output);
driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
WebElement Owner = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]"));
String outputValue = Owner.getText();
if(outputValue.contains("Yashaswini Jefferson")) {
	System.out.println("Owner Found");
}else {
	System.out.println("Owner not found");
           code = 2;
}
	
	driver.quit();
System.exit(code);
}

}

