package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElementsUsingiFrame {

	public static void main(String[] args) {
		
		//- Initialize ChromeDrive
		ChromeDriver objDrvier = new ChromeDriver();
		//- Load the URL 
		objDrvier.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		objDrvier.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//- Maximize the browser window
		objDrvier.manage().window().maximize();
		//- Add an implicit wait to ensure the webpage elements are fully loaded
		objDrvier.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//- Switch to the frame
		objDrvier.switchTo().frame("iframeResult");
		
		//- Click the "Try It" button inside the frame
		objDrvier.findElement(By.xpath("//button[text() = 'Try it']")).click();
		
		//verify alert is present or not
		
	
		//- Click OK/Cancel in the alert that appears
		Alert objAlert = objDrvier.switchTo().alert();
		objAlert.dismiss();
		
		String sVerifyText = objDrvier.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("Displated text is ---"+sVerifyText);
		
		if (sVerifyText.contains("OK")) {
			System.out.println("User Clciked on Ok Button from Alert");
		}
		else {
				System.out.println("User Clciked on Cancel Button from Alert");
		}			
	}
}
