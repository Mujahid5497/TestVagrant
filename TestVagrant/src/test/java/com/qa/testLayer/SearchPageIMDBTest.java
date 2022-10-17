package com.qa.testLayer;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePageIMDB;
import com.qa.pageLayer.HomePageWikipedia;
import com.qa.pageLayer.ResultPageIMDB;
import com.qa.pageLayer.SearchPageIMDB;
import com.qa.pageLayer.SearchPageWikipedia;
import com.qa.testBase.TestBase;

public class SearchPageIMDBTest extends TestBase{
	HomePageWikipedia obj;
	SearchPageWikipedia obj2;
	HomePageIMDB obj3;
	ResultPageIMDB obj4;
	SearchPageIMDB obj5;
	public SearchPageIMDBTest()
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
	}

	@Test(priority=2)
	public void ValidateReleaseDateOfWikipediaAndIMDB()
	{
		obj.EnterInSearchBox();
		String ReleaseDateWiki=obj2.ReleseDate();
		obj2.NavigateToIMDB();
		obj3.EnterInSearchBox();
		obj4.ClickOnMovieTitle();
		String ReleaseDateIMDB=obj5.ReleaseDate();
		Assert.assertEquals(ReleaseDateWiki, ReleaseDateIMDB);
	}
	@Test(priority=1)
	public void ValidateCountryOfWikipediaAndIMDB()
	{
		obj.EnterInSearchBox();
		String CountryWiki=obj2.Country();
		obj2.NavigateToIMDB();
		obj3.EnterInSearchBox();
		obj4.ClickOnMovieTitle();
		String CountryIMDB=obj5.Country();
		Assert.assertEquals(CountryWiki, CountryIMDB);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
