package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.ResultPageIMDB;
import com.qa.pageLayer.SearchPageIMDB;
import com.qa.pageLayer.SearchPageWikipedia;
import com.qa.testBase.TestBase;

public class ResultPageIMDBTest extends TestBase{
	HomePageWikipedia obj;
	SearchPageWikipedia obj2;
	HomePageIMDB obj3;
	ResultPageIMDB obj4;
	SearchPageIMDB obj5;
	public ResultPageIMDBTest()
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
		obj4=new ResultPageIMDB();
		obj5=new SearchPageIMDB();
		obj2.NavigateToIMDB();
		obj3.EnterInSearchBox();
	}
	
	@Test()
	public void VarifyClickOnMovieTitleFunctionality()
	{
		obj5=obj4.ClickOnMovieTitle();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
