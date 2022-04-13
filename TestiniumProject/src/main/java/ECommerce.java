import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class ECommerce {
    ProductManager productManager;
    CartManager cartManager;
    WebDriver driver;
    public void start(){
        System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        productManager = new ProductManager(driver);
        cartManager = new CartManager(driver);
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.gittigidiyor.com/");
    }

    public void loginPage(){
        try {
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@class='gekhq4-4 egoSnI']")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@class='sc-12t95ss-3 fDarBX']")).click();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void login(){
        try {
            driver.findElement(By.id("L-UserNameField")).sendKeys("***@gmail.com");
            driver.findElement(By.id("L-PasswordField")).sendKeys("***");
            driver.findElement(By.xpath("//input[@value='Giriş Yap']")).click();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.gittigidiyor.com/");
    }

    public void close(){
        try{
            driver.findElement(By.xpath("//*[contains(@class,'tyj39b-3')]")).click();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void productSearch(){
        productManager.productSearch();
    }


    public void page2(){
        try {
            driver.findElement(By.linkText("2")).click();
            Thread.sleep(1000);
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void randomProduct(){
        productManager.randomProduct();
    }

    public void addToCart(){
        cartManager.addToCart();
    }

    public void cart(){
        cartManager.cart();
    }

    public void increase(){
        cartManager.increase();
    }

    public void delete(){
        cartManager.deleteProduct();
    }



}
