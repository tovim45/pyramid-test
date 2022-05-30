import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pyramidExample {

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "src/main/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    //URL launch
    driver.get("https://www.pyramidanalytics.com/");
  }
}
