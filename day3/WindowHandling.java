package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty(
		
		//Initialize ChromeDriver
		//ChromeDriver objDriver = new ChromeDriver ();
		WebDriver objDriver = new ChromeDriver ();
		
		// Maximize the browser window
		objDriver.manage().window().maximize();
		//Load the URL 
		objDriver.get("https://www.irctc.co.in/");
		//Add an implicit wait to ensure the webpage elements are fully loaded
		objDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//click on the "FLIGHTS" link.
		objDriver.findElement(By.xpath("//a[@href ='https://www.air.irctc.co.in']")).click();
		
		//- Capture the title of the new window that opens (flights window - AirTicket)
		
		//If only one new window opened then we can handle directly sing string 
		
			/*String objWind = objDriver.getWindowHandle();
			objDriver.switchTo().window(objWind);
			String titleNewWin = objDriver.getTitle();*/
		
		
		//handle multiple window--stores as collection Set
	
		/*Object[] objWin = objDriver.getWindowHandles().toArray();//using toArray
		objDriver.switchTo().window( (String) objWin[1] );//default window index is 0
		String titleNewWin = objDriver.getTitle();
		System.out.println("Title of the New window is :- "+titleNewWin);*/
				
		Set <String> winMulti = objDriver.getWindowHandles();//Set is non indexed and does not allow duplicate, null story only once [HashSet,Linked HashSet]
		System.out.println(winMulti);//to get the adddres of the all opened window
		String winPArent = objDriver.getTitle();
		System.out.println("Parent Window is:-" + winPArent);
		
		//Convert Set into List
		
		List <String> listWindows = new ArrayList<String>(winMulti);//List  is opposite to Set
		objDriver.switchTo().window(listWindows.get(1));//focus switch to new opened window
		
		String winChild = objDriver.getTitle();
		
		System.out.println("Child Window is:- "+winChild);
		//String titleNewWin = objDriver.getTitle();
		
		objDriver.close();//it will close the current active window child
		
		//switch back to the parent window
		objDriver.switchTo().window(listWindows.get(0));
		objDriver.close();
		
		//objDriver.quit(); //This will close all the opened window
		
	}

}
