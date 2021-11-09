package phpTravelsAutomationTask;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class PhpTravels extends Base {
	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		navigateUrl("https://www.phptravels.net/");
		
		click(By.xpath("//button[@id='tours-tab']"));
		
//		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"tours_city\"]")));
//		select.selectByVisibleText("Legoland Malaysia Day Pass");

		click(By.xpath("//*[@id='select2-tours_city-container']"));
		
		sendKeys(By.xpath("/html/body/span/span/span[1]/input"), "Auro");
		
		click(By.xpath("//ul[@id=\"select2-tours_city-results\"]//li[2]"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form[@id='tours-search']//input[@id='date']")).click();
		
		// 11/12/2021
		
		click(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[3]"));
		
		click(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[2]/td[7]"));
		
		click(By.xpath("//form[@id='tours-search']//a"));
		
		click(By.xpath("//*[@id='tours-search']/div/div/div[3]/div/div/div/div/div[1]/div/div/div[2]"));
		
		click(By.xpath("//form[@id='tours-search']//button"));
		
		Thread.sleep(2000);
	}
}
