package com.Maven_Projects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Project_Baseclass extends Baseclass{
public static void main(String[] args) throws InterruptedException, IOException {
	getBrowser("chrome");
	url("http://automationpractice.com/index.php");
	implicitwait(30);
	WebElement Signin = driver.findElement(By.xpath("//a[@class='login']"));
	getactions("click", Signin);
	clickOptions(Signin);
	WebElement email = driver.findElement(By.id("email"));
	inputvalues(email, "velanvelli@gmail.com");
	WebElement password = driver.findElement(By.id("passwd"));
	inputvalues(password, "Velan@1995");
	WebElement email_signin = driver.findElement(By.xpath("//input[@id='passwd']//following::button[1]"));
	clickOptions(email_signin);
	WebElement tshirt = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]//following::a[text()='T-shirts']"));
	clickOptions(tshirt);
	WebElement scroll = driver.findElement(By.xpath("//span[text()='More']"));
	sleep(3000);
	scrollelements(scroll);
	WebElement image = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
	clickOptions(image);
	WebElement frames = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	frame("webelement", null, null, frames);
	WebElement cart = driver.findElement(By.name("Submit"));
	clickOptions(cart);
	frame("default", null, null, null);
	sleep(3000);
	WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	clickOptions(checkout);
	WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	clickOptions(checkout2);
	WebElement address = driver.findElement(By.name("processAddress"));
	clickOptions(address);
	sleep(3000);
	WebElement byname = driver.findElement(By.name("cgv"));
	clickOptions(byname);
	WebElement process = driver.findElement(By.name("processCarrier"));
	clickOptions(process);
	WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
	clickOptions(payment);
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	clickOptions(submit);
	WebElement last = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a"));
	scrollrange(last);
	screenshot("C:\\Users\\Admin\\eclipse-workspace\\Maven_Projects\\Screenshot\\Base-Project.png");

}

}

