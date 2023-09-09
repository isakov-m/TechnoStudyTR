import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

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

    //TS02
    @FindBy(xpath = "//td[text()='Campus Login']")
    public WebElement campusLoginText;




}
