package code.repo.automation.selenium;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class DriverMethods {

	public static void closeExtraWindowAndSwitchBackToParentWindow(String mainWin, WebDriver driver) {
	    Set<String> wins = driver.getWindowHandles();
	    if (!(wins.size() > 1) || mainWin == null) {
	      System.out.println("We don't have enough windows open");
	      return;
	    }
	    for (String win : wins) {
	      if (!win.equals(mainWin)) {
	        driver.close();
	      }
	    }
	    driver.switchTo().window(mainWin);
	  }
	
	public static void setCookiesToAvoidInitialPopups(WebDriver driver) {
	    try {
	      Set<Cookie> cookies = driver.manage().getCookies();
	      if (!cookies.isEmpty()) {
	        driver.manage().deleteAllCookies();
	        cookies.clear();
	      }
	    } catch (WebDriverException w) {
	      
	    }
	  }
}
