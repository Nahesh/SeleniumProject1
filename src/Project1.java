import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

/*
 * Project1
 * Version information : 2023-03 (4.27.0)
 * 1 July 2023
 * Author Name : Mahesh Bhapkar
 * Copyright notice
 */
public class Project1 {
	String path= "C:\\Users\\H379379\\Desktop\\SeleniumJars";
	Workbook wb;
	Sheet sh;
	int numrow;
	//initialization of chrome driver
	public static WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Initilize() {
		//Defining chrome property & path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\H379379\\Desktop\\SeleniumJars\\chromedriver_win32\\chromedriver.exe");
		//maximizing the window
		driver.manage().window().maximize(); 
		driver.get("https://www.webmath.com/index.html");	// opening the url 
		//clicking the trig & calculus
 		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/div/div/div[7]/a")).click(); 
	}
	

	
	@Test(priority=0)
	public static void Dropdown() {
		Select drpSelect = new Select (driver.findElement(By.name("topicItem")));  //click on Coins, Counting to check dropdown functionality
		driver.findElement(By.name("topicItem")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drpSelect.selectByVisibleText("Coins, Counting"); 
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back(); //navigating to back url
	}
	
	@Test(priority=1)
	public static void HelpTypingMath() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/div/div[2]/a"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public static void Home() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[1]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(2)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	public static void ContactUs() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[2]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(3)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public static void AboutWebmath() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[3]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(4)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	public static void WhyWebmath() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[4]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(5)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public static void WebsiteMap() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[5]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(6)); //switches to new tab
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	public static void PrivacyPolicy() {
		WebElement link = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/a[6]"));
		Actions newwin = new Actions(driver);
		newwin.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(7)); //switches to new tab
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().window(tabs.get(0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=8,  dataProvider = "Expdata")
	public static void TrigExp(String Exp) {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[1]\r\n")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[1]/input")).sendKeys(Exp);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/center/p[2]/input[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	@DataProvider(name = "Expdata")
	public Object[][] Testdatafeed() throws JXLException, IOException{
		//reading the data from excel
		wb = Workbook.getWorkbook(new File(path));
		sh = wb.getSheet(0);
		numrow = sh.getRows();
		Object[][] data = new Object[numrow][sh.getColumns()];
		for (int i=0; i<numrow ;i++) {
			data[i][0] = sh.getCell(0, i).getColumn();
		}
		return data;
	}
	
	@Test(priority=9,  dataProvider = "TriangleData")
	public static void RightTriangle(String AngleD,String AngleE,String LegA,String LegB,String HypC) {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[1]/font/font/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[4]")).sendKeys(AngleD);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[2]")).sendKeys(AngleE);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[5]")).sendKeys(LegA);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[3]")).sendKeys(LegB);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/pre/input[1]")).sendKeys(HypC);
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/center/table/tbody/tr/td/form/center/table/tbody/tr/td/p/input[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	@DataProvider(name = "TriangleData")
	public Object[][] Testdatafeed1() throws JXLException, IOException{
		//reading the data from excel
		wb = Workbook.getWorkbook(new File(path));
		sh = wb.getSheet(1);
		numrow = sh.getRows();
		Object[][] data = new Object[numrow][sh.getColumns()];
		for (int i=0; i<numrow ;i++) {
			data[i][0] = sh.getCell(0, i).getColumn();
			data[i][1] = sh.getCell(1, i).getColumn();
			data[i][2] = sh.getCell(2, i).getColumn();
			data[i][3] = sh.getCell(3, i).getColumn();
			data[i][4] = sh.getCell(4, i).getColumn();
		}
		return data;
	}
	
	@Test(priority=10)
	public static void Derivative() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center/p[3]/input[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=11)
	public static void Quotient() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[1]/center/table/tbody/tr/td[2]/form/input[3]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=12)
	public static void Integral() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[3]")).click();
		driver.findElement(By.name("s")).sendKeys("x^9");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center/p/input[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(priority=13)
	public static void DefiniteIntegral() {
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[3]/table/tbody/tr/td[2]/font/font/a[5]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/form/center/input[5]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@AfterClass
	public static void Exit() {
		driver.close();
		driver.quit();
	}
}
