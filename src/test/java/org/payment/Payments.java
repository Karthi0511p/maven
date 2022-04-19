package org.payment;

import org.mavenpro.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments extends BaseClass{
	public Payments() {
		PageFactory.initElements(driver, this);
	}
	
	

		
		  @FindBy(xpath="//button[@class='_2KpZ6l RLM7ES _3AWRsL']") private WebElement
		  onclick; public WebElement getOnclick() { return onclick; }
		 
		  public WebElement getOnclick1() {
			return onclick1;
		}

		@FindBy(xpath="//button[@class='_2KpZ6l _1seccl _3AWRsL']") private
		  WebElement onclick1;
		 
		/*
		 * @FindBy(xpath="//input[@maxlength='auto']") private WebElement click1;
		 * 
		 * public WebElement getClick1() { return click1; }
		 * 
		 * 
		 * @FindBy(xpath="//input[@maxlength='auto']") private WebElement enterno;
		 * 
		 * 
		 * public WebElement getEnterno() { return enterno; }
		 * 
		 * @FindBy(xpath="class=\"_2KpZ6l _20xBvF _3AWRsL") private WebElement click;
		 * 
		 * 
		 * public WebElement getClick() { return click; }
		 */
}
