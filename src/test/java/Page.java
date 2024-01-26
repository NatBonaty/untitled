import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Page {


    @BeforeAll
    public static void setupClass() {
        String url = "https://www.google.ru/";
        openUrl(url);
    }

    public static void openUrl(String url){
        open(url);
    }

    public void searchGoogle(String text) {
        $(By.name("q")).val(text).pressEnter();
    }

    public String searchText(String selector){
        return $(selector).text();}

    public String resultSearch(String selector, int n){
        ElementsCollection els = $$(selector);
        return els.get(n).innerText();
    }
}
