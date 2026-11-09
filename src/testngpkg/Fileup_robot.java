package testngpkg;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fileup_robot {

	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
	}
	@Test
	public void fileup_mthd() throws Exception
	{
		WebElement btn=driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
		btn.click();
		fileUpload("C:\\Users\\MyLap\\Downloads\\GREEN MARK - Sheet1.pdf");
	}
	
	private void fileUpload(String p) throws Exception {
		
		//set/store file path in to the clipboard
		StringSelection strobj = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);
		
		Robot rob = new Robot();
		rob.delay(3000);
		
		rob.keyPress(KeyEvent.VK_CONTROL); //vk-virtual key
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		rob.delay(2000);
		System.out.println("File uploaded successfully");

	}
}
