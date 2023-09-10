import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "(//a[text()='Kurslar'])[1]")
    public WebElement kurslar;

    @FindBy(css = "[role=menu]>div")
    public List<WebElement> menu;

    @FindBy(css = "[class='t228__list_item']")
    public WebElement courses;

    @FindBy(xpath = "(//*[ contains( text(), 'SDET' )  ] )[1]")
    public WebElement Sdet;

    @FindBy(css = "div[class='t503']")
    public WebElement msg;

    @FindBy(xpath = "//div[text()='Android uygulama geliştirme']")
    public WebElement Android;

    @FindBy(css = "div[class='t503']")
    public WebElement AndroidAciklama;

    @FindBy(xpath = "(//p[@style='text-align: center;'])[1]")
    public WebElement msg2;


    @FindBy(xpath = "//div[text()='Veri bilimi']")
    public WebElement Veri;

    @FindBy(css = "div[id='rec538004474']")
    public WebElement msg3;


    @FindBy(xpath = "//div[ contains( text(), 'Master' )  ]")
    public WebElement master;

    @FindBy(css = "[field='tn_text_1622986948166']>:nth-child(1)")
    public WebElement masterAciklama;

    //TS02 Emre
    @FindBy(xpath = "//td[text()='Campus Login']")
    public WebElement campusLoginText;

    //TS05 Emre
    @FindBy (xpath = "//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[1]")
    public WebElement facebook;
    @FindBy (xpath = "//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[2]")
    public WebElement instagram;
    @FindBy(xpath ="//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[3]")
    public WebElement youtube;
    @FindBy(xpath = "//*[@id='rec515963432']/div/div/div[1]/div[1]/ul/li[4]")
    public WebElement linkedin;

    //TS03 Murat
    @FindBy(xpath = "(//*[text()='BAŞVUR'])[1]")
    public WebElement basvur;
    @FindBy(name = "name")
    public WebElement adSoyad;
    @FindBy(name = "email")
    public WebElement email;
    @FindBy(css = "[class='t-input-phonemask__select-flag']")
    public WebElement ulkekod;
    @FindBy(id = "t-phonemask_ad")
    public WebElement ulkeKodu;
    @FindBy(name = "tildaspec-phone-part[]")
    public WebElement tlf;
    @FindBy(id = "sb-1667664755026")
    public WebElement ul;
    @FindBy(xpath = "//option[text()='Andorra']")
    public WebElement ulke;
    @FindBy(id = "sb-1663337581601")
    public WebElement kursSec;
    @FindBy(xpath = "//option[text()='Job Center & Arbeitsamt']")
    public WebElement kurs;
    @FindBy(id = "sb-1670423010572")
    public WebElement nereden;
    @FindBy(xpath = "//option[text()='Arkadaş vasıtası ile']")
    public WebElement nerdenBul;
    @FindBy(name = "promo code")
    public WebElement promoKod;
    @FindBy(css = "[class='t-checkbox__indicator']")
    public WebElement sartname;
    @FindBy(css = "[class='t-submit']")
    public WebElement gonder;
   @FindBy(xpath = "(//span[text()='Başvurunuz alınmıştır. Bilgilendirme emailinize gönderilmiştir.'])[2]")
    public WebElement dogrulama;


}
