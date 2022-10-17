package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.SearchPageWikipedia;
import com.qa.testBase.TestBase;

public class SearchPageWikipediaTest extends TestBase{
	HomePageWikipedia obj;
	SearchPageWikipedia obj2;
	HomePageIMDB obj3;
	public SearchPageWikipediaTest()
	{
		super();
	}
	@BeforeMethod
	public void SetUp()
	{
		start();
		obj=new HomePageWikipedia();
		obj2=new SearchPageWikipedia();
		obj3=new HomePageIMDB();
		obj.EnterInSearchBox();

	}
	
	@Test()
	public void ValidateReleaseDateFunctinality()
	{
		obj2.ReleseDate();
	}
	@Test()
	public void ValidateReleaseCountryFunctinality()
	{
		obj2.Country();
	}
	@Test()
	public void ValidateNavigateToIMDB()
	{
		obj3=obj2.NavigateToIMDB();
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
