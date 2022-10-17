package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.SearchPageWikipedia;
import com.qa.testBase.TestBase;

public class HomePageWikipediaTest extends TestBase {
	HomePageWikipedia obj;
	SearchPageWikipedia obj2;

	public HomePageWikipediaTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		start();
		obj=new HomePageWikipedia();

	}

	@Test()
	public void ValidateSearchFunctionality()
	{
		obj2=obj.EnterInSearchBox();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
