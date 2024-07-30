package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfLinks_ListConcepts {

	private static String string;

	public static void main(String[] args) {
	
		
		ChromeDriver objfbBrw = new  ChromeDriver();
		objfbBrw.get("https://www.facebook.com/");
		objfbBrw.manage().window().maximize();
		
		List<WebElement> allLinks = objfbBrw.findElements(By.tagName("a"));//to get the all the links  only print the address not actual value from UI
		
		//to get the count of the links
		
		int iSize = allLinks.size();
		System.out.println("Total Links present in FB HomePage are "+iSize);
		
		//convert to values from address
		List<String> allLinkText = new ArrayList<String> ();//Creating blank list 
				
		//System.out.println(allLinkText);//it will print blank array
				
		
		for (int i=0; i<=iSize-1; i++ ) {
			
			String result = allLinks.get(i).getText();//get mthod will retrive the html tags and getText will retrive the text from tag
			System.out.println("Link "+i+ "-"+result);
			allLinkText.add(result);//adding address value or Label to new list
			
		}
		
		String dd= allLinkText.get(15);
		System.out.println("After adding to StringList--"+ dd);
		
		objfbBrw.close();
		
	}

}
