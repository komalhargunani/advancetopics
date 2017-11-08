package headlesstesting;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.selenium.advancetopics.Utility;

public class SkiuliTest {
	public static void main(String[] args) throws FindFailed, InterruptedException {
		 
		// We have to create Screen class object to access method
		 
		Screen screen = new Screen();
		 
		// Create object of Pattern class and specify the images path
		 
		Pattern image = new Pattern("E:\\sikuli\\login.PNG");
		Pattern image1 = new Pattern("E:\\sikuli\\amazon.PNG");
		
		
		
		
		WebDriver driver = Utility.setupFirefoxBrowser();
		 
		 
		
		 
		driver.get("http://www.google.com");
		driver.get("");
		 
		screen.wait(image, 10);
		 
		screen.click(image);
		
		 
		}


}
