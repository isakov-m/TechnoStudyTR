package Malik;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _DropDownMenu_Elements {
    public _DropDownMenu_Elements() {
        PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "(//a[text()='Kurslar'])[1]")
    public WebElement kurslar;

    @FindBy(css = "[role=menu]>div")
    public List<WebElement> menu;





}
