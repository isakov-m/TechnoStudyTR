import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class Main extends BaseDriver {
    @Test
    public void TS01() {

        driver.get("https://techno.study/tr/");

        Elements elements=new Elements();

        wait.until(ExpectedConditions.elementToBeClickable(elements.kurslar));

        Actions actions = new Actions(driver);

        String[] titles = {"SDET Yazılım", "Android uygulama", "Veri bilimi", "Job Center", "Master's"};

        for (int i = 0; i < elements.menu.size(); i++) {
            List<WebElement> menuList = elements.menu.get(i).findElements(By.cssSelector("[role=menu]>div>div>a>div>div~div"));

            for (WebElement e : menuList) {
                Action action = actions.moveToElement(elements.kurslar).build();
                action.perform();
                e.click();

                wait.until(ExpectedConditions.titleContains(titles[i]));
                Assert.assertTrue(driver.getTitle().contains(titles[i]));
                System.out.println(driver.getTitle() + "-" + titles[i]);
                driver.navigate().back();
            }
        }
        BekleVeKapat();
    }

    @Test
    public void TS02() {
        Elements elements=new Elements();

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(2);

        elements.campusLoginText.click();
        MyFunc.Bekle(2);

        Assert.assertTrue(driver.getCurrentUrl().equals("https://campus.techno.study/"), "Campuse login olunamiyor");
        BekleVeKapat();
    }


    String adSoy = "Test_MasMavi";
    String mail = "Testmavi123@gmail.com";
    String tl = "999999999";

    @Test
    public void TS03() {
        driver.get("https://techno.study/tr");
        MyFunc.Bekle(3);

        WebElement basvur = driver.findElement(By.xpath("(//*[text()='BAŞVUR'])[1]"));
        basvur.click();
        WebElement adSoyad = driver.findElement(By.name("name"));
        adSoyad.sendKeys(adSoy);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(mail);
        WebElement ulkekod = driver.findElement(By.cssSelector("[class='t-input-phonemask__select-flag']"));
        ulkekod.click();
        WebElement ulkeKodu = driver.findElement(By.id("t-phonemask_ad"));
        ulkeKodu.click();
        WebElement tlf = driver.findElement(By.name("tildaspec-phone-part[]"));
        tlf.sendKeys(tl);
        WebElement ul = driver.findElement(By.id("sb-1667664755026"));
        ul.click();
        WebElement ulke = driver.findElement(By.xpath("//option[text()='Andorra']"));
        ulke.click();
        WebElement kursSec = driver.findElement(By.id("sb-1663337581601"));
        kursSec.click();
        WebElement kurs = driver.findElement(By.xpath("//option[text()='Job Center & Arbeitsamt']"));
        kurs.click();
        WebElement nereden = driver.findElement(By.id("sb-1670423010572"));
        nereden.click();
        WebElement nerdenBul = driver.findElement(By.xpath("//option[text()='Arkadaş vasıtası ile']"));
        nerdenBul.click();
        WebElement promoKod = driver.findElement(By.name("promo code"));
        promoKod.sendKeys("xyz");
        WebElement sartname = driver.findElement(By.cssSelector("[class='t-checkbox__indicator']"));
        sartname.click();
        WebElement gonder = driver.findElement(By.cssSelector("[class='t-submit']"));
        gonder.click();
        WebElement dogrulama = driver.findElement(By.xpath("(//span[text()='Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.'])[2]"));

        Assert.assertTrue(dogrulama.getText().contains("Başvurunuz alınmıştır."), "Dogrulanamadi");

        BekleVeKapat();
    }


    @Test
    public void TS04() {
        Elements elements=new Elements();

        driver.get("https://techno.study/tr");
        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(elements.courses).build();
        action.perform();

        elements.Sdet.click();

        wait.until(ExpectedConditions.visibilityOf(elements.msg));
        Assert.assertTrue(elements.msg.getText().contains("Yazılım "));

        driver.navigate().back();

        Actions actions2 = new Actions(driver);
        Action action2 = actions2.moveToElement(elements.courses).build();
        action2.perform();

        elements.Android.click();

        wait.until(ExpectedConditions.visibilityOf(elements.msg2));
        Assert.assertTrue(elements.msg2.getText().contains("Android"));

        wait.until(ExpectedConditions.visibilityOf(elements.AndroidAciklama));
        Assert.assertTrue(elements.AndroidAciklama.getText().contains("Kimler bu kursa katılabilir?"));


        driver.navigate().back();

        Actions actions3 = new Actions(driver);
        Action action3 = actions3.moveToElement(elements.courses).build();
        action3.perform();

        elements.Veri.click();
        wait.until(ExpectedConditions.visibilityOf(elements.msg3));
        Assert.assertTrue(elements.msg3.getText().contains("Veri"));

        driver.navigate().back();

        Actions actions4 = new Actions(driver);
        Action action4 = actions4.moveToElement(elements.courses).build();
        action4.perform();

        elements.master.click();
        wait.until(ExpectedConditions.visibilityOf(elements.masterAciklama));
        Assert.assertTrue(elements.masterAciklama.getText().contains("Master"));

        driver.navigate().back();

        BekleVeKapat();

    }

    @Test
    public void TS05() {

        driver.get("https://techno.study/tr");
        MyFunc.Bekle(4);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement facebook = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[1]"));
        facebook.click();

        WebElement instagram = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[2]"));
        instagram.click();

        WebElement youtube = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[3]"));
        youtube.click();

        WebElement linkedin = driver.findElement(By.xpath("//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[4]"));
        linkedin.click();

        BekleVeKapat();
    }

    @Test
    public void TS06() {

        BekleVeKapat();
    }

    @Test
    public void TS07() {
        driver.get("https://techno.study/tr");
        MyFunc.Bekle(1);


        WebElement sdet = driver.findElement(By.xpath("//a[@href=\"https://techno.study/tr/sdet\"]"));
        sdet.click();
        MyFunc.Bekle(1);

        WebElement bilgi = driver.findElement(By.xpath("//div[@class=\"tn-atom\" and text()=\"Programlamayı Anlamak\"]"));//icerik kontrol edildi

        Assert.assertTrue(bilgi.getText().contains("Programlamayı Anlamak"), "bilgiler görüntülenemedi ");

        //WebElement home=driver.findElement(By.xpath("//a[@href=\"/home\"]"));// homepage ingilizceye döndü kullanici dostu degil(yurt disi ip kullandigim icin olabilir )
        //home.click();

        driver.navigate().to("https://techno.study/tr");

        MyFunc.Bekle(1);

        WebElement android = driver.findElement(By.cssSelector("a[href='https://techno.study/tr/androidapp']"));
        android.click();
        MyFunc.Bekle(2);

        WebElement giris = driver.findElement(By.xpath("//span[@class='t668__title t-name t-name_xl']"));

        Assert.assertTrue(giris.getText().contains("Android uygulama geliştirmeye giriş"), "bilgiler görüntülenemedi ");
        MyFunc.Bekle(2);

        driver.navigate().to("https://techno.study/tr");
        WebElement veri_bilimi = driver.findElement(By.cssSelector("a.tn-atom[href='https://techno.study/tr/data']"));
        veri_bilimi.click();
        MyFunc.Bekle(2);

        WebElement veri_gorsl = driver.findElement(By.xpath("//h3[@class='tn-atom' and @field='tn_text_1670828331678']"));

        Assert.assertTrue(veri_gorsl.getText().contains("Veri Görselleştirme ve İş Zekası"), "bilgiler görüntülenemedi ");
        System.out.println("TEST TAMAMLANDI ");

        //Assert.assertTrue("Aranılan mesaj bulunamadı",cntr.getText().contains("Web sitesinin amacı"));

        // bonus hata
        // kullanim hatasi: dil degistilirdigi zaman ana sayfaya atiyor

        BekleVeKapat();
    }

    @Test
    public void TS08() {
        driver.get("https://techno.study/tr");
        MyFunc.Bekle(2);
        // tiklamiyor
        //WebElement sart= driver.findElement(By.xpath("//*[@name='Checkbox']"));
        //WebElement sart= driver.findElement(By.xpath("//input[@name='Checkbox']"));
        WebElement sart = driver.findElement(By.className("t-checkbox__labeltext"));// calisiyor
        sart.click();

        MyFunc.Bekle(1);

        Assert.assertTrue(sart.getText().contains("Kullanım Şartları"), "Kullanım Şartları bilgi sayafasi acilmadi ");

        TakesScreenshot ts = (TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
        File hafizakiHali = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);

        // bonus hata
        // kullanim hatasi: dil degistilirdigi zaman ana sayfaya atiyor
        // programs/kurslar butonu bos herkangi bir link baglanmamis
        BekleVeKapat();
    }

}
