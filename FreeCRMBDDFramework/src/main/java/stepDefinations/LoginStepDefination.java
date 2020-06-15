package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/* Feature Glue code */

  public class LoginStepDefination {
	  
	  WebDriver driver;
  
	  @Given("^User is already on Login Page$") 
	  public void user_already_on_login_page() {
		  System.setProperty("webdriver.chrome.driver","/Users/tuna/Downloads/WebDriver/chromedriver");
		  driver = new ChromeDriver();
		  driver.get("https://www.freecrm.co.in");
	  }
  
	  @SuppressWarnings("deprecation")
	  @When("^title of Login Page is FREE CRM$")
	  public void title_of_login_page_is_free_crm() {
		  String title = driver.getTitle();
		  System.out.println("Title of the page :: "+title);
		  Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	  }
	  
	  @Then("^User clicks on Login In button$")
	  public void user_clicks_on_login_button() {
		  /*
		  WebElement loginBtn = driver.findElement(By.xpath("//input[@type='Log In']"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click()", loginBtn);
	      */
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.className("btn-primary")).click();
	  }
	  
	  @Then("^User enters username and password$")
	  public void user_enters_username_and_password() {
	      driver.findElement(By.name("email")).sendKeys("biplab.sarkar99@gmail.com");
	      driver.findElement(By.name("password")).sendKeys("TestAccount1234");
	  }
	  
	  @Then("^User clicks on login button$")
	  public void user_submits_login() {
		  /*
	      WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      js.executeScript("arguments[0].click()", loginBtn);
	      */
		  driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	  }
	  
	  @SuppressWarnings("deprecation")
	  @Then("^User is on home page$")
	  public void user_is_on_home_page() {
	      String title = driver.getTitle();
	      System.out.println("Title after successful login :: "+title);
	      Assert.assertEquals("Cogmento CRM", title);
	  }
  }
 
