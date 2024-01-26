import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.SoftAssertsExtension;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FirstTest extends Page{


        String url = "https://www.google.ru/";
        String b = "https://www.python.org";





    @Test
    public void first() {
        openUrl(url);
        searchGoogle("Java");
        searchGoogle("Python");
        System.out.println("Text " + (searchText("div.byrV5b")));



        //$("#search").shouldHave(text("https://www.python.org"));
        //$(".tjvcx.GvPZzd.cHaqb").shouldHave(text("https://www.python.org"));
        //System.out.println(($("cite.tjvcx.GvPZzd.cHaqb").text()));



    }
    @Test
    public void second() {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement search = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        search.sendKeys("Selenium \n");

        WebElement element = driver.findElement(By.xpath("//*[@id='search']"));
        //element.click();
        String textElement = element.getText();
        System.out.println(textElement); //выведет текст поисковой страницы
    }
    @Test
    public void three() {
        open(url);
        $(By.name("q")).val("Java").pressEnter();

        ElementsCollection els = $$("h3.LC20lb");

        System.out.println("Text - " + els.get(2).innerText());
        System.out.println("Text - " + els.get(3).innerText());
        System.out.println("Size - " + els.size());

        //        for(int i =0; i < els.size(); i++){
//            System.out.println(els.get(i).innerText());
//        }




    }

}
