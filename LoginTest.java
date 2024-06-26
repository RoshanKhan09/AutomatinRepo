// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoginTestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginTest() {
    // Test name: LoginTest
    // Step # | name | target | value
    // 1 | open | /samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete11%2fWebOrders%2flogin.aspx%2fr%2fn | 
    driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete11%2fWebOrders%2flogin.aspx%2fr%2fn");
    // 2 | setWindowSize | 786x816 | 
    driver.manage().window().setSize(new Dimension(786, 816));
    // 3 | type | id=ctl00_MainContent_username | Tester
    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    // 4 | click | id=ctl00_MainContent_password | 
    driver.findElement(By.id("ctl00_MainContent_password")).click();
    // 5 | type | id=ctl00_MainContent_password | test
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    // 6 | click | id=ctl00_MainContent_login_button | 
    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    // 7 | type | id=ctl00_MainContent_username | Tester
    driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
    // 8 | type | id=ctl00_MainContent_password | test
    driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
    // 9 | click | id=ctl00_MainContent_login_button | 
    driver.findElement(By.id("ctl00_MainContent_login_button")).click();
    // 10 | click | id=ctl00_logout | 
    driver.findElement(By.id("ctl00_logout")).click();
  }
}
