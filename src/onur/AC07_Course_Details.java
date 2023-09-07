package onur;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AC07_Course_Details extends BaseDriver {
    @Test
    public void test3 ()
    {

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(1);


        WebElement sdet= driver.findElement(By.xpath("//a[@href=\"https://techno.study/tr/sdet\"]"));
        sdet.click();
        MyFunc.Bekle(1);

        WebElement bilgi=driver.findElement(By.xpath("//div[@class=\"tn-atom\" and text()=\"Programlamayı Anlamak\"]"));//icerik kontrol edildi

        Assert.assertTrue("bilgiler görüntülenemedi ",bilgi.getText().contains("Programlamayı Anlamak"));

        //WebElement home=driver.findElement(By.xpath("//a[@href=\"/home\"]"));// homepage ingilizceye döndü kullanici dostu degil(yurt disi ip kullandigim icin olabilir )
        //home.click();

        driver.navigate().to("https://techno.study/tr");

        MyFunc.Bekle(1);

        WebElement android=driver.findElement(By.cssSelector("a[href='https://techno.study/tr/androidapp']"));
        android.click();
        MyFunc.Bekle(2);

        WebElement giris=driver.findElement(By.xpath("//span[@class='t668__title t-name t-name_xl']"));

        Assert.assertTrue("bilgiler görüntülenemedi ",giris.getText().contains("Android uygulama geliştirmeye giriş"));
        MyFunc.Bekle(2);

        driver.navigate().to("https://techno.study/tr");
//
        WebElement veri_bilimi =driver.findElement(By.cssSelector("a.tn-atom[href='https://techno.study/tr/data']"));
       veri_bilimi.click();
        MyFunc.Bekle(2);

        WebElement veri_gorsl=driver.findElement(By.xpath("//h3[@class='tn-atom' and @field='tn_text_1670828331678']"));

        Assert.assertTrue("bilgiler görüntülenemedi ",veri_gorsl.getText().contains("Veri Görselleştirme ve İş Zekası"));
        MyFunc.Bekle(2);

        driver.quit();


        //Assert.assertTrue("Aranılan mesaj bulunamadı",cntr.getText().contains("Web sitesinin amacı"));


        // bonus hata
        // kullanim hatasi: dil degistilirdigi zaman ana sayfaya atiyor









    }
}
