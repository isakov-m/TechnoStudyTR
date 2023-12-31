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

        Elements elements=new Elements();
        MyFunc.Bekle(3);

        elements.basvur.click();
        elements.adSoyad.sendKeys(adSoy);
        elements.email.sendKeys(mail);
        elements.ulkekod.click();
        elements.ulkeKodu.click();
        elements.tlf.sendKeys(tl);
        elements.ul.click();
        elements.ulke.click();
        elements.kursSec.click();
        elements.kurs.click();
        elements.nereden.click();
        elements.nerdenBul.click();
        elements.promoKod.sendKeys("xyz");
        elements.sartname.click();
        elements.gonder.click();

        Assert.assertTrue(elements.dogrulama.getText().contains("Başvurunuz alınmıştır."), "Dogrulanamadi");

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

        Elements elements=new Elements();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        elements.facebook.click();
        elements.instagram.click();
        elements.youtube.click();
        elements.linkedin.click();

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
