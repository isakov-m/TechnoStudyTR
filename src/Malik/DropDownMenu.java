package Malik;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class DropDownMenu extends BaseDriver {
    @Test
    public void dropDownMenu() throws AWTException {

        driver.get("https://techno.study/tr/");

        _DropDownMenu_Elements elements = new _DropDownMenu_Elements();

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
}
