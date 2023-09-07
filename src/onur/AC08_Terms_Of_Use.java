package onur;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;

public class AC08_Terms_Of_Use extends BaseDriver {
    private Object OutputType;

    @Test
    public void test6 ()
    {

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(2);
 // tiklamiyor
        //WebElement sart= driver.findElement(By.xpath("//*[@name='Checkbox']"));
        //WebElement sart= driver.findElement(By.xpath("//input[@name='Checkbox']"));
        WebElement sart= driver.findElement(By.className("t-checkbox__labeltext"));// calisiyor
        sart.click();
        System.out.println("kullanim sartlarina tiklandi ");

        MyFunc.Bekle(1);

       Assert.assertTrue("Kullanım Şartları bilgi sayafasi acilmadi ",sart.getText().contains("Kullanım Şartları"));

        TakesScreenshot ts=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
        File hafidakiHali=ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);

        MyFunc.Bekle(2);
        driver.quit();

        // bonus hata
        // kullanim hatasi: dil degistilirdigi zaman ana sayfaya atiyor
        // programs/kurslar butonu bos herkangi bir link baglanmamis







    }
}
