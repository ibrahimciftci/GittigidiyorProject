import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartManager {
    WebDriver driver;

    public CartManager(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart(){
        try {
            driver.findElement(By.id("add-to-basket")).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void cart(){
        try {
            driver.findElement(By.xpath("//*[@class='header-cart-hidden-link']")).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void increase(){
        try {
            driver.findElement(By.xpath("//*[@value='2']")).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void deleteProduct(){
        try {
            driver.findElement(By.xpath("//*[@title='Sil']")).click();
            Thread.sleep(1000);
            Assert.assertNotNull(By.xpath("//*[@title='Sil']"));
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}
