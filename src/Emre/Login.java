package Emre;



import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseDriver {

    @Test

    public void LogInWeb(){

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(4);

        WebElement campusLoginText = driver.findElement(By.xpath("//td[text()='Campus Login']"));


        String text = campusLoginText.getText();

        // Assert
        Assert.assertEquals(text, "Campus Login", "Metin uyuşmuyor.");

        campusLoginText.click();












        MyFunc.Bekle(5);
        driver.quit();
    }
}
