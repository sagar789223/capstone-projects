/*package medicare_admin_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import medicare_admin.Login_admin_page;
import medicare_admin.Login_page;
import medicare_admin.Manage_product_page;

public class Manage_product_page_test {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/vigneshta95gmai/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       
        driver.get("http://localhost:8081/medicare/home");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void manageProductPageTest() throws InterruptedException {
        PageFactory.initElements(driver, Login_page.class);
        Thread.sleep(3000);
        Login_page.Login.click();

        PageFactory.initElements(driver, Login_admin_page.class);
        Thread.sleep(3000);
        Login_admin_page.Email.sendKeys("sagarsahana7@gmail.com");
        Login_admin_page.Password.sendKeys("sagar51@");
        Login_admin_page.Login.click();
        Thread.sleep(2000);
        Login_admin_page.Manage_Product.click();

        PageFactory.initElements(driver, Manage_product_page.class);

        // Enter product information and perform actions
        enterProductDetailsAndSave("Dulceflex", "Bisacodyl tablets", "Description for Dulceflex", "20",
                "/home/vigneshta95gmai/Documents/s-l400.jpg");

        enterProductDetailsAndSave("Neurobion Forte", "ZuelligPharma", "Description for Neurobion Forte", "3",
                "/home/vigneshta95gmai/Documents/Neurobion-ForteDT.png");

        enterProductDetailsAndSave("Nise", "Nise", "Description for Nise", "90",
                "/home/vigneshta95gmai/Documents/716kMhLuAYL.jpg");

        enterProductDetailsAndSave("Amoxicillin", "cipla", "Description for Amoxicillin", "5",
                "/home/vigneshta95gmai/Documents/Amoxicillin-250mg-cipla pack-2.jpg");

        // Add more products as needed
    }

    private void enterProductDetailsAndSave(String name, String brand, String description, String price, String imagePath) throws InterruptedException {
        Manage_product_page.Name.sendKeys(name);
        Manage_product_page.Brand.sendKeys(brand);
        Manage_product_page.Description.sendKeys(description);
        Manage_product_page.Unit_Price.sendKeys(price);
        Manage_product_page.Quantity.sendKeys("1"); // Assuming quantity is always 1

        // Upload image
        Manage_product_page.Upload_a_file.sendKeys(imagePath);

        Manage_product_page.Save.click();

        Thread.sleep(3000); // Add a suitable delay
    }
}
*/