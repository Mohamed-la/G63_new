import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginStepDefinition
{
    WebDriver driver;
    @Given("user opens browser and navigate to the website")
     public void openBrowser()
    {
        System.out.println("hoksha");
        WebDriverManager.chromedriver().setup();  // equal system.set property
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

     //   System.out.println("koraaaaa");
        
    }
   @And("user go to login page")
     public void goToLoginPage()
   {
      driver.navigate().to("https://the-internet.herokuapp.com/");
//       driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//      driver.findElement(By.linkText("Form Authentication")).click();
   }
//
//   @When("user enters valid username and password")
//    public void validUsernameAndPassword()
//   {
//     driver.findElement(By.id("username")).sendKeys("tomsmith");
//     driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//
//   }
////   @When("user enters invalid username and password")
////    public void invalidUsernameAndPassword()
////   {
////       driver.findElement(By.id("username")).sendKeys("tomsmithfalse");
////       driver.findElement(By.id("password")).sendKeys("falseSuperSecretPassword!");
////   }
//
//   @And("user press on logon button")
//   public void pressLogonBtn()
//   {
//      driver.findElement(By.className("fa")).click();
//   }
//   @Then("user login to website properly")
//   public void successLogin()
//   {
//       Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
//   }
//    @Then("user observe error message")
//    public void failLogin()
//    {
//
//
//   }
}
