package org.page;

import org.mavenpro.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@autocomplete='off'])[2]")
	private WebElement loginid;
	@FindBy(xpath = "(//input[@autocomplete='off'])[3]")
	private WebElement loginpass;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginbtn;

	public WebElement getLoginid() {
		return loginid;
	}

	public WebElement getLoginpass() {
		return loginpass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
	  
	  @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement
	  click;
	 
	@FindBys({ @FindBy(name = "q"), @FindBy(xpath = "//input[@class='_3704LK']") })
	private WebElement src;
	@FindBy(xpath = "//button[@class='L0Z3Pu']")
	private WebElement click1;
	@FindBy(xpath = "(//div[@class='_4rR01T'])[1]")
	private WebElement click2;

	 public WebElement getClick()
	 { return click; }
	public WebElement getSrc() {
		return src;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

}
