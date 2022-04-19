package org.link;

import org.mavenpro.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Realme extends BaseClass{
	

	public Realme() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement onclick3;
	public WebElement getLinkclick() {
		return onclick3;
	}
	
	}

