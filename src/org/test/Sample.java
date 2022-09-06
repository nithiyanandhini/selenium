package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
	driver.manage().window().maximize();
	WebElement web = driver.findElement(By.xpath("//a[text()='Sarah Nole']"));
	
	System.out.println(web.getText());
	System.out.println("my branch is nithiya");
	System.out.println("my branch is seetha");
}
}