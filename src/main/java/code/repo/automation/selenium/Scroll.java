package code.repo.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {

	/*
	 * This method is used to scroll down to certain units
	 */
	public static void scrollDown(String Value, WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + Value + ")", "");
	}

	/*
	 * Scroll to the bottom of the page.
	 */
	public static void scrollToBottom(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,Math.max(document.documentElement."
				+ "scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));");
	}

	/*
	 * Scroll till visibility of element
	 */
	public static void scrollTillVisibilityOfAnElement(By locator,
			WebDriver driver) {
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView();", driver.findElement(locator));
	}

}
