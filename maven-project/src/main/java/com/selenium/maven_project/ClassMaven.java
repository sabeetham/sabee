package com.selenium.maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassMaven 
{

	public static void main(String[] args)
   
	{
		
          System.out.println("launching chrome browser");
		
		  System.setProperty("webdriver.chorme.driver","c:\\chrome path.exe");
		
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://connect.maveric-systems.com/index.php/site/login");
		
	}

}

		
		
	