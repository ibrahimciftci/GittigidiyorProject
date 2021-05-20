import com.google.common.collect.RangeMap;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductManager {
    WebDriver driver;
    public ProductManager(WebDriver driver) {
        this.driver = driver;
    }

    public void productSearch() {
        try {
            driver.findElement(By.name("k")).sendKeys("Bilgisayar");
            driver.findElement(By.xpath("//*[@data-cy='search-find-button']")).click();
            Thread.sleep(300);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    List<WebElement> allProducts;
    public void randomProduct(){
        try {
            allProducts  = driver.findElements(By.xpath("//ul[@class='catalog-view clearfix products-container']/li/a"));
            Thread.sleep(500);
            Random random = new Random();
            int randomProduct  = random.nextInt(allProducts.size());
            allProducts.get(randomProduct).click();
            Thread.sleep(500);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}


