/*package medicare_admin_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import medicare_admin.Edit_page;
import medicare_admin.Login_admin_page;
import medicare_admin.Login_page;

import medicarepage.Payment_page;


import java.util.concurrent.TimeUnit;

public class Edit_page_test {
    @Test
	public void editPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/vigneshta95gmai/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://localhost:8081/medicare/home");

        PageFactory.initElements(driver, Login_page.class);
        Thread.sleep(3000);
        Login_page.Login.click();

        PageFactory.initElements(driver, Login_admin_page.class);
        Thread.sleep(3000);
        Login_admin_page.Email.sendKeys("vk@gmail.com");
        Login_admin_page.Password.sendKeys("admin");
        Login_admin_page.Login.click();
        Thread.sleep(2000);
        Login_admin_page.Manage_Product.click();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        PageFactory.initElements(driver, Edit_page.class);
        Thread.sleep(3000);
        Edit_page.editbutton.click();
        Thread.sleep(2000);
        Edit_page.unit_price.clear();
        Thread.sleep(2000);
        Edit_page.unit_price.sendKeys("55");
        Thread.sleep(2000);
        Edit_page.quantity.clear();
        Thread.sleep(2000);
        Edit_page.quantity.sendKeys("200");
        Thread.sleep(2000);
        Edit_page.save.click();
        Thread.sleep(3000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
        Edit_page.enable.click();
        Thread.sleep(2000);
        Edit_page.saveok.click();
        Thread.sleep(5000);
        Edit_page.ok.click();
        Thread.sleep(2000);
        Edit_page.enable.click();
        Thread.sleep(2000);
        Edit_page.saveok.click();
        Thread.sleep(5000);
        Edit_page.ok.click();
        Edit_page.logout.click();
        Thread.sleep(2000);
        Edit_page.logoutbutton.click();

        PageFactory.initElements(driver, Loginpage.class);
        Thread.sleep(3000);
        Loginpage.Email.sendKeys("sagarsahana7@gmail.com");
        Loginpage.Password.sendKeys("sagar51@");
        Thread.sleep(5000);
        Loginpage.Login.click();
        Thread.sleep(2000);
        Edit_page.View_Product.click();
        Thread.sleep(2000);
        Edit_page.search.sendKeys("dulc");
        Thread.sleep(2000);
        Edit_page.search.clear();
        Thread.sleep(1000);
        Edit_page.search.sendKeys("c");
        Edit_page.search.clear();
        Thread.sleep(2000);
        Edit_page.filter.click();
        Thread.sleep(2000);
        WebElement courseElement = driver.findElement(By.xpath("//*[@id=\"productListTable_length\"]/label/select"));
        Select courseNameDropdown = new Select(courseElement);
        courseNameDropdown.selectByIndex(0);
        Thread.sleep(2000);
        Edit_page.add.click();
        Thread.sleep(2000);
        Edit_page.continueshop.click();
        Thread.sleep(5000);
        WebElement courseElement1 = driver.findElement(By.xpath("//*[@id=\"productListTable_length\"]/label/select"));
        Select courseNameDropdown1 = new Select(courseElement1);
        courseNameDropdown1.selectByIndex(2);
        Thread.sleep(3000);
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0,800)");
        Thread.sleep(5000);
        Edit_page.add1.click();
        Thread.sleep(2000);
        Edit_page.continueshop.click();
        Thread.sleep(4000);
        WebElement dropElement = driver.findElement(By.xpath("//*[@id=\"productListTable_length\"]/label/select"));
        Select courseNameDropdown3 = new Select(dropElement);
        courseNameDropdown3.selectByIndex(3);
        Thread.sleep(3000);
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0,800)");
        Thread.sleep(3000);
        Edit_page.add2.click();
        Thread.sleep(3000);
        Edit_page.checkout.click();

        PageFactory.initElements(driver, Singup_address.class);
        Thread.sleep(3000);
        Singup_address.Address_line_one.sendKeys("hanumath nagar");
        Thread.sleep(2000);
        Singup_address.Address_Line_Two.sendKeys("near iti college");
        Thread.sleep(2000);
        Singup_address.City.sendKeys("siruguppa");
        Thread.sleep(2000);
        Singup_address.Postal_Code.sendKeys("583121");
        Thread.sleep(2000);
        Singup_address.State.sendKeys("karnataka");
        Thread.sleep(2000);
        Singup_address.Country.sendKeys("INDIA");
        Thread.sleep(2000);
        Singup_address.Address.click();

        PageFactory.initElements(driver, Payment_page.class);
        Thread.sleep(3000);
        Payment_page.CARD_NUMBER.sendKeys("996403456749");
        Thread.sleep(2000);
        Payment_page.MM.sendKeys("12");
        Thread.sleep(2000);
        Payment_page.YY.sendKeys("33");
        Thread.sleep(2000);
        Payment_page.pay.click();
        Thread.sleep(2000);
        Edit_page.Register.click();
        Thread.sleep(2000);
        Edit_page.logout1.click();
        Thread.sleep(2000);
        Edit_page.logout2.click();
        Thread.sleep(2000);
        Edit_page.Register1.click();
        Thread.sleep(2000);
        Edit_page.Firstnmae.sendKeys("sagar");
        Thread.sleep(2000);
        Edit_page.Lastname.sendKeys("y");
        Thread.sleep(2000);
        Edit_page.Email1.sendKeys("sagarsahana7@gmail.com.com");
        Thread.sleep(2000);
        Edit_page.contacno.sendKeys("7892237979");
        Thread.sleep(2000);
        Edit_page.password1.sendKeys("sagar51@");
        Thread.sleep(2000);
        Edit_page.confirmpass.sendKeys("sagar51@");
        Thread.sleep(2000);
        Edit_page.billig.click();
        Thread.sleep(2000);
        Edit_page.addressline1.sendKeys("hanumath nagar");
        Thread.sleep(2000);
        Edit_page.addressline2.sendKeys("near iti college");
        Thread.sleep(2000);
        Edit_page.city1.sendKeys("siruguppa");
        Thread.sleep(2000);
        Edit_page.code1.sendKeys("583121");
        Thread.sleep(2000);
        Edit_page.state.sendKeys("karnataka");
        Thread.sleep(2000);
        Edit_page.country1.sendKeys("INDIA");
        Thread.sleep(2000);
        Edit_page.confirm1l.click();
        Thread.sleep(2000);
        Edit_page.confiro2m.click();
    }
}*/
