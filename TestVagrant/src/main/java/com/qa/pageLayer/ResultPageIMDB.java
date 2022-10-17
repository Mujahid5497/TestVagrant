package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ResultPageIMDB extends TestBase{
	public ResultPageIMDB()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Pushpa: The Rise - Part 1')]")
	private WebElement MovieTitle;
	
	public SearchPageIMDB ClickOnMovieTitle()
	{
		MovieTitle.click();
		return new SearchPageIMDB();
	}


}
