package Murat;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_TS03_AnasayfadaBaşvurButonu extends BaseDriver {
    String adSoy="Test_Murat Yagmur";
    String mail="Testyagmur123@gmail.com";
    String tl="5052285441";
    @Test
    public  void test(){
        driver.get("https://techno.study/tr/");
        WebElement basvur=driver.findElement(By.xpath("(//*[text()='BAŞVUR'])[1]"));
        basvur.click();
        WebElement adSoyad=driver.findElement(By.name("name"));
        adSoyad.sendKeys(adSoy);
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys(mail);
        WebElement ulkekod=driver.findElement(By.cssSelector("[class='t-input-phonemask__select-flag']"));
        ulkekod.click();
        WebElement ulkeKodu=driver.findElement(By.id("t-phonemask_ad"));
        ulkeKodu.click();
        WebElement tlf=driver.findElement(By.name("tildaspec-phone-part[]"));
        tlf.sendKeys(tl);
        WebElement ul=driver.findElement(By.id("sb-1667664755026"));
        ul.click();
        WebElement ulke=driver.findElement(By.xpath("//option[text()='Andorra']"));
        ulke.click();
        WebElement kursSec=driver.findElement(By.id("sb-1663337581601"));
        kursSec.click();
        WebElement kurs=driver.findElement(By.xpath("//option[text()='Job Center & Arbeitsamt']"));
        kurs.click();
        WebElement nereden=driver.findElement(By.id("sb-1670423010572"));
        nereden.click();
        WebElement nerdenBul=driver.findElement(By.xpath("//option[text()='Arkadaş vasıtası ile']"));
        nerdenBul.click();
        WebElement promoKod=driver.findElement(By.name("promo code"));
        promoKod.sendKeys("xyz");
        WebElement sartname=driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
        sartname.click();
        WebElement gonder=driver.findElement(By.cssSelector("[class='t-submit']"));
       gonder.click();
       WebElement dogrulama=driver.findElement(By.xpath("(//span[text()='Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.'])[2]"));
       Assert.assertTrue("Dogrulanamadi",dogrulama.getText().contains("Başvurunuz alınmıştır."));

    }
}
