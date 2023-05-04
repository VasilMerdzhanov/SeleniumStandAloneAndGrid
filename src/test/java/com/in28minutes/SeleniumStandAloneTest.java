package com.in28minutes;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumStandAloneTest {
  @Test
  public void basic() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
	  WebDriver  driver = new ChromeDriver();
	  driver.get("https://bulma.io/documentation/form/input/");
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
  }
  
  @Test
  public void standAlone() throws MalformedURLException, InterruptedException {
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	  //chrome, firefox, htmlunit, internet explorer, iphone, opera
	  capabilities.setBrowserName("chrome");
	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
	  //WebDriver  driver = new ChromeDriver();
	  
	  WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	  
	  //RomoteWebdriver
	  //Location of Standaloneserver
	  //Witch browser?? Witch OS?? => Capabilities
	  
	  remoteDriver.get("https://bulma.io/documentation/form/input/");
	  System.out.println(remoteDriver.getCurrentUrl());
	  System.out.println(remoteDriver.getTitle());
	  
	  Thread.sleep(5000);
	  
	  remoteDriver.quit();
  }
  
  @Test
  public void hub() throws MalformedURLException, InterruptedException {
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	  //chrome, firefox, htmlunit, internet explorer, iphone, opera
	  capabilities.setBrowserName("chrome");
	  
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mythos\\Desktop\\Drivers\\chromedriver.exe");
	  //WebDriver  driver = new ChromeDriver();
	  
	  WebDriver remoteDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
	  
	  //RomoteWebdriver
	  //Location of Standaloneserver
	  //Witch browser?? Witch OS?? => Capabilities
	  
	  remoteDriver.get("https://bulma.io/documentation/form/input/");
	  System.out.println(remoteDriver.getCurrentUrl());
	  System.out.println(remoteDriver.getTitle());
	  
	  Thread.sleep(5000);
	  
	  remoteDriver.quit();
  }
}
