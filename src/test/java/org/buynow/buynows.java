package org.buynow;

import org.mavenpro.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class buynows extends BaseClass{

	public buynows() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")
	private WebElement click;
	public WebElement getBuy() {
		return click;
	}
}
