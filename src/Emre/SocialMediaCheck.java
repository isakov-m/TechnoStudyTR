package Emre;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SocialMediaCheck extends BaseDriver {

    @Test
    public void SocialMedia(){

        driver.get("https://techno.study/tr/");
        MyFunc.Bekle(4);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Bekle(4);

        WebElement facebook = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[1]"));
        facebook.click();
        MyFunc.Bekle(3);



        WebElement instagram = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[2]"));
        instagram.click();
        MyFunc.Bekle(4);



        WebElement youtube= driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[3]"));
        youtube.click();
        MyFunc.Bekle(3);



        WebElement linkedin = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[4]"));
        linkedin.click();
        MyFunc.Bekle(3);


        MyFunc.Bekle(5);
        driver.quit();
    }
}
