import com.codeborne.selenide.ElementsCollection;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SecondTest extends Page{



    @Test
    public void first() {
        String b = "https://www.python.org";
        searchGoogle("Python");
        //String n = searchText("div.byrV5b");
        Assert.assertTrue(b.equals(searchText("cite.tjvcx.GvPZzd.cHaqb")));
    }


    @Test
    public void three() {
        searchGoogle("Selenide");
        String a = resultSearch("h3.LC20lb", 2);

        System.out.println("Text - " + a);
        System.out.println("Text - " + resultSearch("h3.LC20lb", 3));


    }

}
