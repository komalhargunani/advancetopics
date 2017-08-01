package headlesstesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDemo {
	

	public static void main(String[] args) throws InterruptedException {
		// Declaring and initialising the HtmlUnitWebDriver
		HtmlUnitDriver unitDriver = new HtmlUnitDriver();
 
		// open google.com webpage
		unitDriver.get("http://google.com");
 
		System.out.println("Title of the page is -> " + unitDriver.getTitle());
 
		
		// Declaring and initialising the HtmlUnitWebDriver
		/*HtmlUnitDriver unitDriver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
		unitDriver.setJavascriptEnabled(true);
		unitDriver.get("http://google.com");
		String domainName = (String) unitDriver
				.executeScript("return document.domain");
		System.out.println("Domain name is " + domainName);*/
		
	}

}
